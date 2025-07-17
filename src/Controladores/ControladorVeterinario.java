package Controladores;

import Modelo.Veterinario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControladorVeterinario {

    private final ArrayList<Veterinario> veterinarios;

    public ControladorVeterinario() {
        this.veterinarios = new ArrayList<>();
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public boolean registrarVeterinario(Veterinario veterinario) {
        if (veterinario != null && buscarVeterinario(veterinario.getDocumento()) == null) {
            veterinarios.add(veterinario);
            return true;
        }
        return false;
    }

    public Veterinario buscarVeterinario(int idVeterinario) {
        for (Veterinario v : veterinarios) {
            if (v.getDocumento() == idVeterinario) {
                return v;
            }
        }
        return null;
    }

    public boolean eliminarVeterinario(int idVeterinario) {
        Veterinario vet = buscarVeterinario(idVeterinario);
        if (vet != null) {
            veterinarios.remove(vet);
            return true;
        }
        return false;
    }

    public boolean estaDisponible(int idVeterinario) {
        Veterinario vet = buscarVeterinario(idVeterinario);
        return vet != null && vet.isDisponibilidad();
    }

    public boolean cambiarDisponibilidad(int idVeterinario, boolean nuevaDisponibilidad) {
        Veterinario vet = buscarVeterinario(idVeterinario);
        if (vet != null) {
            vet.setDisponibilidad(nuevaDisponibilidad);
            return true;
        }
        return false;
    }

    public DefaultTableModel listarVeterinariosTabla() {
        String[] columnas = {"ID", "Nombre","Telefono","Correo", "Especialidad", "Disponible"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (Veterinario v : veterinarios) {
            Object[] fila = {
                v.getDocumento(),
                v.getNombre(),
                v.getTelefono(),
                v.getCorreo(),
                v.getEspecialidad(),
                v.isDisponibilidad() ? "Sí" : "No"
            };
            modelo.addRow(fila);
        }

        return modelo;
    }
}
