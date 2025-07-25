package DAOs;

import DTOs.PropietarioDTO;
import Persistencia.SerializadoraPropietario;
import java.util.ArrayList;

public class DaoPropietario {

    private final ArrayList<PropietarioDTO> propietarios;
    private final SerializadoraPropietario serializadoraPropietario;

    public DaoPropietario() {
        this.serializadoraPropietario = new SerializadoraPropietario();
        this.propietarios = serializadoraPropietario.getListaPropietario();
    }

    public ArrayList<PropietarioDTO> getPropietarios() {
        return propietarios;
    }

    public boolean guardarPropietario(PropietarioDTO propietario) {
        if (propietario != null && buscarPropietario(propietario.getDocumento()) == null) {
            propietarios.add(propietario);
            serializadoraPropietario.escribirPropietario();
            return true;
        }
        return false;
    }

    public PropietarioDTO buscarPropietario(int documento) {
        for (PropietarioDTO propietario : propietarios) {
            if (propietario.getDocumento() == documento) {
                return propietario;
            }
        }
        return null;
    }

    public boolean actualizarDatos(PropietarioDTO propietario) {
        PropietarioDTO existente = buscarPropietario(propietario.getDocumento());
        if (existente != null) {
            existente.setNombre(propietario.getNombre());
            existente.setTelefono(propietario.getTelefono());
            existente.setCorreo(propietario.getCorreo());
            serializadoraPropietario.escribirPropietario();
            return true;
        }
        return false;
    }

    public boolean eliminarPropietario(int documento) {
        PropietarioDTO propietario = buscarPropietario(documento);
        if (propietario != null) {
            propietarios.remove(propietario);
            serializadoraPropietario.escribirPropietario();
            return true;
        }
        return false;
    }
}
