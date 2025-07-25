package DAOs;

import DTOs.CitaDTO;
import Persistencia.SerializadoraCita;
import java.util.ArrayList;

public class DaoCita {

    private final ArrayList<CitaDTO> citas;
    private final SerializadoraCita serializadoraCita;

    public DaoCita() {
        this.serializadoraCita = new SerializadoraCita();
        this.citas = serializadoraCita.getListaCita();
    }

    public ArrayList<CitaDTO> getCitas() {
        return citas;
    }

    public boolean agregarCitaMascota(CitaDTO cita) {
        if (cita != null && buscarCitaPorId(cita.getIdCita()) == null) {
            citas.add(cita);
            serializadoraCita.escribirCita();
            return true;
        }
        return false;
    }

    public CitaDTO buscarCitaPorId(int idCita) {
        for (CitaDTO cita : citas) {
            if (cita.getIdCita() == idCita) {
                return cita;
            }
        }
        return null;
    }

    public ArrayList<CitaDTO> obtenerCitasPorMascota(int idMascota) {
        ArrayList<CitaDTO> resultado = new ArrayList<>();
        for (CitaDTO cita : citas) {
            if (cita.getIdMascota() == idMascota) {
                resultado.add(cita);
            }
        }
        return resultado;
    }

    public boolean actualizarConsulta(int idCita, int idConsulta) {
        CitaDTO cita = buscarCitaPorId(idCita);
        if (cita != null) {
            cita.setIdConsulta(idConsulta);
            cita.setAtendida(true);
            serializadoraCita.escribirCita();
            return true;
        }
        return false;
    }

    public boolean citaTieneConsulta(int idCita) {
        CitaDTO cita = buscarCitaPorId(idCita);
        return cita != null && cita.getIdConsulta() > 0;
    }

    // NUEVO MÉTODO - obtener citas pendientes (sin consulta)
    public ArrayList<CitaDTO> obtenerCitasPendientes() {
        ArrayList<CitaDTO> resultado = new ArrayList<>();
        for (CitaDTO cita : citas) {
            if (!cita.isAtendida() && cita.getIdConsulta() == 0) {
                resultado.add(cita);
            }
        }
        return resultado;
    }

    public void eliminarCitasPorMascota(int idMascota) {
        citas.removeIf(cita -> cita.getIdMascota() == idMascota);
        serializadoraCita.escribirCita();
    }
}
