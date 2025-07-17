package Controladores;

import Modelo.Cita;
import Modelo.Consulta;
import Modelo.Mascota;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

public class ControladorCita {

    private final ArrayList<Cita> citas;
    private final ControladorMascota controladorMascota;

    public ControladorCita(ControladorMascota controladorMascota) {
        this.citas = new ArrayList<>();
        this.controladorMascota = controladorMascota;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public boolean agregarCitaMascota(Cita cita) {
        if (cita != null && cita.getMascota() != null && !citas.contains(cita)) {
            citas.add(cita);
            cita.getMascota().agregarEvento(cita);
            return true;
        }
        return false;
    }

    public Cita buscarCitaPorId(int idCita) {
        for (Cita cita : citas) {
            if (cita.getId() == idCita) {
                return cita;
            }
        }
        return null;
    }

    public ArrayList<Cita> obtenerCitasPorMascota(Mascota mascota) {
        ArrayList<Cita> resultado = new ArrayList<>();
        for (Cita cita : citas) {
            if (cita.getMascota().equals(mascota)) {
                resultado.add(cita);
            }
        }
        return resultado;
    }

    public boolean actualizarConsulta(Cita cita, Consulta consulta) {
        if (citas.contains(cita)) {
            cita.setConsulta(consulta);
            cita.setAtendida(true);
            return true;
        }
        return false;
    }

    public boolean eliminarCita(Cita cita) {
        return citas.remove(cita);
    }

    public DefaultTableModel listarCitasTabla() {
        String[] columnas = {"Fecha", "Hora", "Mascota", "Propietario", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (Cita c : citas) {
            String nombreMascota = c.getMascota().getNombre();
            String nombrePropietario = (c.getMascota().getPropietario() != null)
                    ? c.getMascota().getPropietario().getNombre()
                    : "Sin dueño";
            String estado = (c.getConsulta() != null) ? "Completada" : "Pendiente";

            Object[] fila = {
                c.getFecha(),
                c.getHoraCita().toLocalTime(),
                nombreMascota,
                nombrePropietario,
                estado
            };
            modelo.addRow(fila);
        }

        return modelo;
    }

    public int generarIdCita() {
        return citas.size() + 1;
    }
}
