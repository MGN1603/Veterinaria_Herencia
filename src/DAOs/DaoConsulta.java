package DAOs;

import DTOs.ConsultaDTO;
import Persistencia.SerializadoraConsulta;
import java.util.ArrayList;

public class DaoConsulta {

    private final ArrayList<ConsultaDTO> consultas;
    private final SerializadoraConsulta serializadoraConsulta;

    public DaoConsulta() {
        this.serializadoraConsulta = new SerializadoraConsulta();
        this.consultas = serializadoraConsulta.getListaConsulta();
    }

    public ArrayList<ConsultaDTO> getConsultas() {
        return consultas;
    }

    public boolean registrarConsulta(ConsultaDTO consulta) {
        if (consulta != null && buscarConsulta(consulta.getIdConsulta()) == null) {
            consultas.add(consulta);
            serializadoraConsulta.escribirConsulta();
            return true;
        }
        return false;
    }

    public ConsultaDTO buscarConsulta(int idConsulta) {
        for (ConsultaDTO consulta : consultas) {
            if (consulta.getIdConsulta() == idConsulta) {
                return consulta;
            }
        }
        return null;
    }

    public ArrayList<ConsultaDTO> obtenerConsultasPorMascota(int idMascota) {
        ArrayList<ConsultaDTO> resultado = new ArrayList<>();
        for (ConsultaDTO consulta : consultas) {
            if (consulta.getIdMascota() == idMascota) {
                resultado.add(consulta);
            }
        }
        return resultado;
    }

    // NUEVO MÉTODO - verificar si ya existe consulta para una cita
    public boolean existeConsultaParaCita(int idCita) {
        for (ConsultaDTO consulta : consultas) {
            if (consulta.getIdCita() == idCita) {
                return true;
            }
        }
        return false;
    }

    // NUEVO MÉTODO - buscar consulta por ID de cita
    public ConsultaDTO buscarConsultaPorCita(int idCita) {
        for (ConsultaDTO consulta : consultas) {
            if (consulta.getIdCita() == idCita) {
                return consulta;
            }
        }
        return null;
    }

    public void eliminarConsultaMascota(int idMascota) {
        consultas.removeIf(consulta -> consulta.getIdMascota() == idMascota);
        serializadoraConsulta.escribirConsulta();
    }
}
