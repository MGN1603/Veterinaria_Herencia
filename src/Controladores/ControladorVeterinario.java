package Controladores;

import DAOs.DaoVeterinario;
import DTOs.VeterinarioDTO;
import Excepciones.VeterinarioExistenteExcepcion;
import Excepciones.VeterinarioNoEncontradoExcepcion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControladorVeterinario {

    private final DaoVeterinario daoVeterinario;

    public ControladorVeterinario() {
        this.daoVeterinario = new DaoVeterinario();
    }

    public ArrayList<VeterinarioDTO> obtenerVeterinarios() {
        return daoVeterinario.getVeterinarios();
    }

    public boolean registrarVeterinario(VeterinarioDTO veterinario) throws VeterinarioExistenteExcepcion {
        if (veterinario == null) {
            throw new IllegalArgumentException("El veterinario no puede ser nulo.");
        }

        if (daoVeterinario.buscarVeterinario(veterinario.getDocumento()) != null) {
            throw new VeterinarioExistenteExcepcion("Ya existe un veterinario con ese documento.");
        }

        return daoVeterinario.registrarVeterinario(veterinario);
    }

    public VeterinarioDTO buscarVeterinario(int documento) throws VeterinarioNoEncontradoExcepcion {
        VeterinarioDTO vet = daoVeterinario.buscarVeterinario(documento);
        if (vet == null) {
            throw new VeterinarioNoEncontradoExcepcion("Veterinario no encontrado con documento: " + documento);
        }
        return vet;
    }

    public boolean eliminarVeterinario(int documento) throws VeterinarioNoEncontradoExcepcion {
        if (daoVeterinario.buscarVeterinario(documento) == null) {
            throw new VeterinarioNoEncontradoExcepcion("No se puede eliminar: veterinario no encontrado.");
        }
        return daoVeterinario.eliminarVeterinario(documento);
    }

    public boolean cambiarDisponibilidad(int documento, boolean disponible) throws VeterinarioNoEncontradoExcepcion {
        if (daoVeterinario.buscarVeterinario(documento) == null) {
            throw new VeterinarioNoEncontradoExcepcion("No se encontró el veterinario para cambiar disponibilidad.");
        }
        return daoVeterinario.cambiarDisponibilidad(documento, disponible);
    }

    public DefaultTableModel listarVeterinariosTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{
            "Documento", "Nombre", "Teléfono", "Correo", "Especialidad", "Disponible"
        });

        for (VeterinarioDTO v : daoVeterinario.getVeterinarios()) {
            modelo.addRow(new Object[]{
                v.getDocumento(),
                v.getNombre(),
                v.getTelefono(),
                v.getCorreo(),
                v.getEspecialidad(),
                v.isDisponibilidad() ? "Sí" : "No"
            });
        }

        return modelo;
    }
}
