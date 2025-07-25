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

    public ControladorConsulta() {
        this.daoConsulta = new DaoConsulta();
        this.daoCita = new DaoCita();
        this.daoMascota = new DaoMascota();
    }

    // MÉTODO PRINCIPAL - registrar consulta con validaciones completas
    public boolean registrarConsulta(ConsultaDTO consulta)
            throws CitaNoEncontradaExcepcion, CitaYaAtendidaExcepcion,
            ConsultaYaExistenteExcepcion, MascotaNoEncontradaExcepcion {

        if (consulta == null) {
            throw new IllegalArgumentException("La consulta no puede ser null.");
        }

        // 1. Verificar que la cita existe
        CitaDTO cita = daoCita.buscarCitaPorId(consulta.getIdCita());
        if (cita == null) {
            throw new CitaNoEncontradaExcepcion("No se encontró la cita con ID: " + consulta.getIdCita());
        }

        // 2. Verificar que la cita no esté ya atendida
        if (cita.isAtendida()) {
            throw new CitaYaAtendidaExcepcion("La cita con ID " + consulta.getIdCita() + " ya fue atendida.");
        }

        // 3. Verificar que no exista ya una consulta para esta cita
        if (daoConsulta.existeConsultaParaCita(consulta.getIdCita())) {
            throw new ConsultaYaExistenteExcepcion("Ya existe una consulta para la cita con ID: " + consulta.getIdCita());
        }

        // 4. Verificar que la mascota existe
        MascotaDTO mascota = daoMascota.buscarMascota(consulta.getIdMascota());
        if (mascota == null) {  
            throw new MascotaNoEncontradaExcepcion("No se encontró la mascota con ID: " + consulta.getIdMascota());
        }

        // 5. Registrar la consulta
        boolean consultaRegistrada = daoConsulta.registrarConsulta(consulta);

        if (consultaRegistrada) {
            // 6. Actualizar la cita para marcarla como atendida
            boolean citaActualizada = daoCita.actualizarConsulta(consulta.getIdCita(), consulta.getIdConsulta());

            if (!citaActualizada) {
                // Si falla la actualización de la cita, habría que hacer rollback
                // pero como usas serialización, esto es complicado
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

    public int generarIdConsulta() {
        return daoConsulta.getConsultas().size() + 1;
    }
}
