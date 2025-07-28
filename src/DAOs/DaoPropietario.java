package DAOs;

import DTOs.PropietarioDTO;
import Persistencia.GestorPersistencia;

import java.util.ArrayList;
import java.util.List;

public class DaoPropietario {

    private final String RUTA = "datos/propietarios.dat";
    private final GestorPersistencia gestor = GestorPersistencia.getInstance();

    public ArrayList<PropietarioDTO> getPropietarios() {
        List<PropietarioDTO> lista = gestor.cargarLista(RUTA);
        return lista != null ? new ArrayList<>(lista) : new ArrayList<>();
    }

    public boolean guardarPropietario(PropietarioDTO propietario) {
        if (propietario == null || buscarPropietario(propietario.getDocumento()) != null) {
            return false;
        }

        ArrayList<PropietarioDTO> lista = getPropietarios();
        lista.add(propietario);
        gestor.guardarLista(RUTA, lista);
        return true;
    }

    public PropietarioDTO buscarPropietario(int documento) {
        for (PropietarioDTO p : getPropietarios()) {
            if (p.getDocumento() == documento) {
                return p;
            }
        }
        return null;
    }

    public boolean actualizarDatos(PropietarioDTO propietario) {
        ArrayList<PropietarioDTO> lista = getPropietarios();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDocumento() == propietario.getDocumento()) {
                lista.set(i, propietario);
                gestor.guardarLista(RUTA, lista);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarPropietario(int documento) {
        ArrayList<PropietarioDTO> lista = getPropietarios();
        boolean eliminado = lista.removeIf(p -> p.getDocumento() == documento);
        if (eliminado) {
            gestor.guardarLista(RUTA, lista);
        }
        return eliminado;
    }
}
