package Controladores;

import DAOs.DaoCita;
import DAOs.DaoMascota;
import DAOs.DaoConsulta;
import DTOs.CitaDTO;
import DTOs.MascotaDTO;
import Excepciones.CitaNoEncontradaExcepcion;
import Excepciones.CitaYaAtendidaExcepcion;
import Excepciones.MascotaNoEncontradaExcepcion;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControladorCita {

    private final DaoCita daoCita;
    private final DaoMascota daoMascota;
    private final DaoConsulta daoConsulta;

    public ControladorCita() {
        this.daoCita = new DaoCita();
        this.daoMascota = new DaoMascota();
        this.daoConsulta = new DaoConsulta();

    }

    public ArrayList<CitaDTO> obtenerCitaDTO() {
        return daoCita.getCitas();
    }

    public ArrayList<CitaDTO> obtenerCitasPorMascota(int idMascota) {
        return daoCita.obtenerCitasPorMascota(idMascota);
    }

    public ArrayList<CitaDTO> obtenerCitasPendientes() {
        return daoCita.obtenerCitasPendientes();
    }

    public boolean citaPuedeRecibirConsulta(int idCita) {
        CitaDTO cita = daoCita.buscarCitaPorId(idCita);
        return cita != null && !cita.isAtendida() && cita.getIdConsulta() == 0;
    }

    public boolean registrarCita(CitaDTO cita) throws MascotaNoEncontradaExcepcion {
        if (cita == null) {
            throw new IllegalArgumentException("La cita no puede ser null.");
        }

        MascotaDTO mascota = daoMascota.buscarMascota(cita.getIdMascota());
        if (mascota == null) {
            throw new MascotaNoEncontradaExcepcion("No se encontró la mascota con ID: " + cita.getIdMascota());
        }

        return daoCita.agregarCitaMascota(cita);
    }

    public CitaDTO buscarCita(int idCita) throws CitaNoEncontradaExcepcion {
        CitaDTO cita = daoCita.buscarCitaPorId(idCita);
        if (cita == null) {
            throw new CitaNoEncontradaExcepcion("No se encontró una cita con ID: " + idCita);
        }
        return cita;
    }

    public boolean actualizarConsultaCita(int idCita, int idConsulta)
            throws CitaNoEncontradaExcepcion, CitaYaAtendidaExcepcion {

        CitaDTO cita = daoCita.buscarCitaPorId(idCita);
        if (cita == null) {
            throw new CitaNoEncontradaExcepcion("No se puede actualizar: cita no encontrada con ID: " + idCita);
        }

        if (cita.isAtendida()) {
            throw new CitaYaAtendidaExcepcion("La cita con ID " + idCita + " ya fue atendida.");
        }

        return daoCita.actualizarConsulta(idCita, idConsulta);
    }

    public boolean eliminarCitaPendiente(int idCita) throws CitaNoEncontradaExcepcion, CitaYaAtendidaExcepcion {
        CitaDTO cita = daoCita.buscarCitaPorId(idCita);
        if (cita == null) {
            throw new CitaNoEncontradaExcepcion("No existe una cita con ID: " + idCita);
        }

        if (cita.isAtendida()) {
            throw new CitaYaAtendidaExcepcion("No puedes eliminar una cita que ya fue atendida.");
        }
        return daoCita.eliminarCitaPorId(idCita);
    }

    public DefaultTableModel listarCitas() {
        String[] columnas = {"ID", "Mascota", "Fecha", "Hora", "Estado", "ID Consulta"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (CitaDTO cita : daoCita.getCitas()) {
            MascotaDTO mascota = daoMascota.buscarMascota(cita.getIdMascota());

            String estado;
            if (cita.isAtendida()) {
                estado = "Atendida";
            } else if (cita.getIdConsulta() > 0) {
                estado = "Con Consulta";
            } else {
                estado = "Pendiente";
            }

            modelo.addRow(new Object[]{
                cita.getIdCita(),
                mascota != null ? mascota.getNombre() : "Desconocida",
                cita.getFecha(),
                cita.getHoraCita().toLocalTime(),
                estado,
                cita.getIdConsulta() > 0 ? cita.getIdConsulta() : "-"
            });
        }

        return modelo;
    }

    public int generarIdCita() {
        int maxId = 0;
        for (CitaDTO cita : daoCita.getCitas()) {
            if (cita.getIdCita() > maxId) {
                maxId = cita.getIdCita();
            }
        }
        return maxId + 1;
    }
}
