package DAOs;

import DTOs.VeterinarioDTO;
import Persistencia.GestorPersistencia;

import java.util.ArrayList;
import java.util.List;

public class DaoVeterinario {

    private final String RUTA = "datos/veterinarios.dat";
    private final GestorPersistencia gestor = GestorPersistencia.getInstance();

    public ArrayList<VeterinarioDTO> getVeterinarios() {
        List<VeterinarioDTO> lista = gestor.cargarLista(RUTA);
        return lista != null ? new ArrayList<>(lista) : new ArrayList<>();
    }

    public boolean registrarVeterinario(VeterinarioDTO veterinario) {
        if (veterinario == null || buscarVeterinario(veterinario.getDocumento()) != null) {
            return false;
        }

        ArrayList<VeterinarioDTO> lista = getVeterinarios();
        lista.add(veterinario);
        gestor.guardarLista(RUTA, lista);
        return true;
    }

    public VeterinarioDTO buscarVeterinario(int idVeterinario) {
        for (VeterinarioDTO vet : getVeterinarios()) {
            if (vet.getDocumento() == idVeterinario) {
                return vet;
            }
        }
        return null;
    }

    public boolean eliminarVeterinario(int idVeterinario) {
        ArrayList<VeterinarioDTO> lista = getVeterinarios();
        boolean eliminado = lista.removeIf(v -> v.getDocumento() == idVeterinario);
        if (eliminado) {
            gestor.guardarLista(RUTA, lista);
        }
        return eliminado;
    }

    public boolean cambiarDisponibilidad(int idVeterinario, boolean nuevaDisponibilidad) {
        ArrayList<VeterinarioDTO> lista = getVeterinarios();
        for (VeterinarioDTO vet : lista) {
            if (vet.getDocumento() == idVeterinario) {
                vet.setDisponibilidad(nuevaDisponibilidad);
                gestor.guardarLista(RUTA, lista);
                return true;
            }
        }
        return false;
    }
}
