package DAOs;

import DTOs.ConsultaDTO;
import Persistencia.GestorPersistencia;

import java.util.ArrayList;
import java.util.List;

public class DaoConsulta {

    private final String RUTA = "datos/consultas.dat";
    private final GestorPersistencia gestor = GestorPersistencia.getInstance();

    public ArrayList<ConsultaDTO> getConsultas() {
        List<ConsultaDTO> lista = gestor.cargarLista(RUTA);
        return lista != null ? new ArrayList<>(lista) : new ArrayList<>();
    }

    public boolean registrarConsulta(ConsultaDTO consulta) {
        if (consulta == null || buscarConsulta(consulta.getIdConsulta()) != null) {
            return false;
        }

        ArrayList<ConsultaDTO> lista = getConsultas();
        lista.add(consulta);
        gestor.guardarLista(RUTA, lista);
        return true;
    }

    public ConsultaDTO buscarConsulta(int idConsulta) {
        for (ConsultaDTO consulta : getConsultas()) {
            if (consulta.getIdConsulta() == idConsulta) {
                return consulta;
            }
        }
        return null;
    }

    public ArrayList<ConsultaDTO> obtenerConsultasPorMascota(int idMascota) {
        ArrayList<ConsultaDTO> resultado = new ArrayList<>();
        for (ConsultaDTO consulta : getConsultas()) {
            if (consulta.getIdMascota() == idMascota) {
                resultado.add(consulta);
            }
        }
        return resultado;
    }

    public boolean existeConsultaParaCita(int idCita) {
        for (ConsultaDTO consulta : getConsultas()) {
            if (consulta.getIdCita() == idCita) {
                return true;
            }
        }
        return false;
    }

    public ConsultaDTO buscarConsultaPorCita(int idCita) {
        for (ConsultaDTO consulta : getConsultas()) {
            if (consulta.getIdCita() == idCita) {
                return consulta;
            }
        }
        return null;
    }

    public void eliminarConsultaMascota(int idMascota) {
        ArrayList<ConsultaDTO> lista = getConsultas();
        boolean modificada = lista.removeIf(consulta -> consulta.getIdMascota() == idMascota);
        if (modificada) {
            gestor.guardarLista(RUTA, lista);
        }
    }
}
