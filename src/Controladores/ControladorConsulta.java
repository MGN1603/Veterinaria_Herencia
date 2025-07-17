package Controladores;

import Modelo.Consulta;
import Modelo.Mascota;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControladorConsulta {

    private final ArrayList<Consulta> consultas;
    private final ControladorCita controladorCita;

    public ControladorConsulta(ControladorCita controladorCita) {
        this.consultas = new ArrayList<>();
        this.controladorCita = controladorCita;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public boolean registrarConsulta(Consulta consulta) {
        if (consulta != null && consulta.getMascota() != null && consulta.getCita() != null && consulta.getVeterinario() != null) {
            if (!consultas.contains(consulta)) {
                consultas.add(consulta);
                consulta.getMascota().getHistorial().add(consulta);
                consulta.getCita().setConsulta(consulta);
                return true;
            }
        }
        return false;
    }

    public Consulta buscarConsulta(int idConsulta) {
        for (Consulta consulta : consultas) {
            if (consulta.getId() == idConsulta) {
                return consulta;
            }
        }
        return null;
    }

    public boolean eliminarConsulta(int idConsulta) {
        Consulta consulta = buscarConsulta(idConsulta);
        if (consulta != null) {
            consultas.remove(consulta);
            return true;
        }
        return false;
    }

    public ArrayList<Consulta> obtenerConsultasPorMascota(Mascota mascota) {
        ArrayList<Consulta> resultado = new ArrayList<>();
        for (Consulta consulta : consultas) {
            if (consulta.getMascota() != null && consulta.getMascota().equals(mascota)) {
                resultado.add(consulta);
            }
        }
        return resultado;
    }

    public DefaultTableModel TablaConsultasPorMascota(Mascota mascota) {
        String[] columnas = {
            "ID", "Fecha", "Mascota", "Veterinario",
            "Diagnóstico", "Tratamiento", "Medicamentos", "Descripción"
        };

        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (Consulta consulta : obtenerConsultasPorMascota(mascota)) {
            Object[] fila = {
                consulta.getId(),
                consulta.getFecha(),
                consulta.getMascota().getNombre(),
                (consulta.getVeterinario() != null) ? consulta.getVeterinario().getNombre() : "N/A",
                consulta.getDiagnostico(),
                consulta.getTratamiento(),
                consulta.getMedicamentos(),
                consulta.getDescripcion()
            };
            modelo.addRow(fila);
        }

        return modelo;
    }

    public int generarIdConsulta() {
        return consultas.size() + 1;
    }
}
