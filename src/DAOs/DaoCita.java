package DAOs;

import DTOs.CitaDTO;
import Persistencia.GestorPersistencia;

import java.util.ArrayList;
import java.util.List;

public class DaoCita {

    private final String RUTA = "datos/citas.dat";
    private final GestorPersistencia gestor = GestorPersistencia.getInstance();

    public ArrayList<CitaDTO> getCitas() {
        List<CitaDTO> lista = gestor.cargarLista(RUTA);
        return lista != null ? new ArrayList<>(lista) : new ArrayList<>();
    }

    public boolean agregarCitaMascota(CitaDTO cita) {
        if (cita == null || buscarCitaPorId(cita.getIdCita()) != null) {
            return false;
        }

        ArrayList<CitaDTO> lista = getCitas();
        lista.add(cita);
        gestor.guardarLista(RUTA, lista);
        return true;
    }

    public CitaDTO buscarCitaPorId(int idCita) {
        for (CitaDTO cita : getCitas()) {
            if (cita.getIdCita() == idCita) {
                return cita;
            }
        }
        return null;
    }

    public ArrayList<CitaDTO> obtenerCitasPorMascota(int idMascota) {
        ArrayList<CitaDTO> resultado = new ArrayList<>();
        for (CitaDTO cita : getCitas()) {
            if (cita.getIdMascota() == idMascota) {
                resultado.add(cita);
            }
        }
        return resultado;
    }

    public boolean actualizarConsulta(int idCita, int idConsulta) {
        ArrayList<CitaDTO> lista = getCitas();
        for (CitaDTO cita : lista) {
            if (cita.getIdCita() == idCita) {
                cita.setIdConsulta(idConsulta);
                cita.setAtendida(true);
                gestor.guardarLista(RUTA, lista);
                return true;
            }
        }
        return false;
    }

    public boolean citaTieneConsulta(int idCita) {
        CitaDTO cita = buscarCitaPorId(idCita);
        return cita != null && cita.getIdConsulta() > 0;
    }

    public ArrayList<CitaDTO> obtenerCitasPendientes() {
        ArrayList<CitaDTO> resultado = new ArrayList<>();
        for (CitaDTO cita : getCitas()) {
            if (!cita.isAtendida() && cita.getIdConsulta() == 0) {
                resultado.add(cita);
            }
        }
        return resultado;
    }
    
    public boolean eliminarCitaPorMascota(int idMascota) {
        ArrayList<CitaDTO> lista = getCitas();
        boolean eliminada = lista.removeIf(cita -> cita.getIdMascota() == idMascota);
        if (eliminada) {
            gestor.guardarLista(RUTA, lista);
        }
        return eliminada;
    }

    public boolean eliminarCitaPorId(int idCita) {
        ArrayList<CitaDTO> lista = getCitas();
        boolean eliminada = lista.removeIf(cita -> cita.getIdCita() == idCita);
        if (eliminada) {
            gestor.guardarLista(RUTA, lista);
        }
        return eliminada;
    }
}
