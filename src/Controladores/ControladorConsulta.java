package Controladores;

import DAOs.DaoConsulta;
import DAOs.DaoCita;
import DAOs.DaoMascota;
import DTOs.ConsultaDTO;
import DTOs.CitaDTO;
import DTOs.MascotaDTO;
import Excepciones.CitaNoEncontradaExcepcion;
import Excepciones.CitaYaAtendidaExcepcion;
import Excepciones.ConsultaNoEncontradaExcepcion;
import Excepciones.ConsultaYaExistenteExcepcion;
import Excepciones.MascotaNoEncontradaExcepcion;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControladorConsulta {

    private final DaoConsulta daoConsulta;
    private final DaoCita daoCita;
    private final DaoMascota daoMascota;

    public ControladorConsulta(DaoConsulta daoConsulta, DaoCita daoCita, DaoMascota daoMascota) {
        this.daoConsulta = daoConsulta;
        this.daoCita = daoCita;
        this.daoMascota = daoMascota;
    }

    public boolean registrarConsulta(ConsultaDTO consulta)
            throws CitaNoEncontradaExcepcion, CitaYaAtendidaExcepcion,
            ConsultaYaExistenteExcepcion, MascotaNoEncontradaExcepcion {

        if (consulta == null) {
            throw new IllegalArgumentException("La consulta no puede ser null.");
        }

        CitaDTO cita = daoCita.buscarCitaPorId(consulta.getIdCita());
        if (cita == null) {
            throw new CitaNoEncontradaExcepcion("No se encontró la cita con ID: " + consulta.getIdCita());
        }

        if (cita.isAtendida()) {
            throw new CitaYaAtendidaExcepcion("La cita con ID " + consulta.getIdCita() + " ya fue atendida.");
        }

        if (daoConsulta.existeConsultaParaCita(consulta.getIdCita())) {
            throw new ConsultaYaExistenteExcepcion("Ya existe una consulta para la cita con ID: " + consulta.getIdCita());
        }

        MascotaDTO mascota = daoMascota.buscarMascota(consulta.getIdMascota());
        if (mascota == null) {
            throw new MascotaNoEncontradaExcepcion("No se encontró la mascota con ID: " + consulta.getIdMascota());
        }

        boolean consultaRegistrada = daoConsulta.registrarConsulta(consulta);

        if (consultaRegistrada) {
            boolean citaActualizada = daoCita.actualizarConsulta(consulta.getIdCita(), consulta.getIdConsulta());

            if (!citaActualizada) {
                System.err.println("Advertencia: Consulta registrada pero no se pudo actualizar la cita");
            }

            return true;
        }

        return false;
    }

    public ConsultaDTO buscarConsulta(int idConsulta) throws ConsultaNoEncontradaExcepcion {
        ConsultaDTO consulta = daoConsulta.buscarConsulta(idConsulta);
        if (consulta == null) {
            throw new ConsultaNoEncontradaExcepcion("Consulta no encontrada con ID: " + idConsulta);
        }
        return consulta;
    }

    public ArrayList<ConsultaDTO> obtenerConsultasPorMascota(int idMascota) throws MascotaNoEncontradaExcepcion {
        MascotaDTO mascota = daoMascota.buscarMascota(idMascota);
        if (mascota == null) {
            throw new MascotaNoEncontradaExcepcion("La mascota con ID " + idMascota + " no existe.");
        }
        return daoConsulta.obtenerConsultasPorMascota(idMascota);
    }

    public DefaultTableModel tablaConsultasPorMascota(int idMascota) throws MascotaNoEncontradaExcepcion {
        String[] columnas = {
            "ID", "Fecha", "Diagnóstico", "Tratamiento", "Medicamentos", "Descripción"
        };

        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (ConsultaDTO c : obtenerConsultasPorMascota(idMascota)) {
            modelo.addRow(new Object[]{
                c.getIdConsulta(),
                c.getFecha(),
                c.getDiagnostico(),
                c.getTratamiento(),
                c.getMedicamentos(),
                c.getDescripcion()
            });
        }

        return modelo;
    }

    public int generarNuevoIdConsulta() {
        int maxId = 0;
        for (ConsultaDTO consulta : daoConsulta.getConsultas()) {
            if (consulta.getIdConsulta() > maxId) {
                maxId = consulta.getIdConsulta();
            }
        }
        return maxId + 1;
    }
}
