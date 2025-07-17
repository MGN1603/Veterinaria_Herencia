package Controladores;

import Modelo.Mascota;
import Modelo.Propietario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControladorPropietario {

    private final ArrayList<Propietario> propietarios;

    public ControladorPropietario() {
        this.propietarios = new ArrayList<>();
    }

    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }

    public boolean guardarPropietario(Propietario propietario) {
        if (propietario != null && buscarPropietario(propietario.getDocumento()) == null) {
            propietarios.add(propietario);
            return true;
        }
        return false;
    }

    public void agregarMascotaAPropietario(Propietario propietario, Mascota mascota) {
        if (propietario != null && mascota != null) {
            propietario.getMascotas().add(mascota);
        }
    }

    public Propietario buscarPropietario(int documento) {
        for (Propietario propietario : propietarios) {
            if (propietario.getDocumento() == documento) {
                return propietario;
            }
        }
        return null;
    }

    public boolean actualizarDatos(Propietario propietario) {
        Propietario existente = buscarPropietario(propietario.getDocumento());
        if (existente != null) {
            existente.setNombre(propietario.getNombre());
            existente.setTelefono(propietario.getTelefono());
            existente.setCorreo(propietario.getCorreo());
            return true;
        }
        return false;
    }

    public boolean eliminarPropietario(int documento) {
        Propietario propietario = buscarPropietario(documento);
        if (propietario != null) {
            propietarios.remove(propietario);
            return true;
        }
        return false;
    }

    public DefaultTableModel listaPropietarios() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"ID", "Nombre", "Documento", "Teléfono", "Correo"});
        for (Propietario p : propietarios) {
            modelo.addRow(new Object[]{
                p.getDocumento(),
                p.getNombre(),
                p.getDocumento(),
                p.getTelefono(),
                p.getCorreo()
            });
        }
        return modelo;
    }

    public DefaultTableModel listaPropietariosMascota(int documento) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"ID", "Nombre", "Especie", "Raza", "Edad", "Peso"});

        Propietario propietario = buscarPropietario(documento);
        if (propietario != null) {
            for (Mascota m : propietario.getMascotas()) {
                modelo.addRow(new Object[]{
                    m.getIdMascota(),
                    m.getNombre(),
                    m.getEspecie(),
                    m.getRaza(),
                    m.getEdad(),
                    m.getPeso()
                });
            }
        }

        return modelo;
    }
}
