package DAOs;

import DTOs.VeterinarioDTO;
import Persistencia.SerializadoraVeterinario;
import java.util.ArrayList;

public class DaoVeterinario {

    private final ArrayList<VeterinarioDTO> veterinarios;
    private final SerializadoraVeterinario serializadoraVeterinario;

    public DaoVeterinario() {
        this.serializadoraVeterinario = new SerializadoraVeterinario();
        this.veterinarios = serializadoraVeterinario.getListaVeterinario();
    }

    public ArrayList<VeterinarioDTO> getVeterinarios() {
        return veterinarios;
    }

    public boolean registrarVeterinario(VeterinarioDTO veterinario) {
        if (veterinario != null && buscarVeterinario(veterinario.getDocumento()) == null) {
            veterinarios.add(veterinario);
            serializadoraVeterinario.escribirVeterinario();
            return true;
        }
        return false;
    }

    public VeterinarioDTO buscarVeterinario(int idVeterinario) {
        for (VeterinarioDTO veterinario : veterinarios) {
            if (veterinario.getDocumento() == idVeterinario) {
                return veterinario;
            }
        }
        return null;
    }

    public boolean eliminarVeterinario(int idVeterinario) {
        VeterinarioDTO vet = buscarVeterinario(idVeterinario);
        if (vet != null) {
            veterinarios.remove(vet);
            serializadoraVeterinario.escribirVeterinario();
            return true;
        }
        return false;
    }

    public boolean cambiarDisponibilidad(int idVeterinario, boolean nuevaDisponibilidad) {
        VeterinarioDTO vet = buscarVeterinario(idVeterinario);
        if (vet != null) {
            vet.setDisponibilidad(nuevaDisponibilidad);
            serializadoraVeterinario.escribirVeterinario();
            return true;
        }
        return false;
    }
}
