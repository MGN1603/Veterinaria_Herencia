package Controladores;

import DAOs.DaoMascota;
import DAOs.DaoPropietario;
import DTOs.MascotaDTO;
import DTOs.PropietarioDTO;
import Excepciones.PropietarioExistenteExcepcion;
import Excepciones.PropietarioNoEncontradoExcepcion;
import javax.swing.table.DefaultTableModel;

public class ControladorPropietario {

    private final DaoPropietario dao;
    private final DaoMascota daoMascota;

    public ControladorPropietario() {
        this.dao = new DaoPropietario();
        this.daoMascota = new DaoMascota();
    }

    public boolean registrarPropietario(PropietarioDTO propietario) throws PropietarioExistenteExcepcion {
        if (propietario == null) {
            throw new IllegalArgumentException("El propietario no puede ser null.");
        }

        if (dao.buscarPropietario(propietario.getDocumento()) != null) {
            throw new PropietarioExistenteExcepcion("Ya existe un propietario con ese documento.");
        }

        return dao.guardarPropietario(propietario);
    }

    public PropietarioDTO buscarPropietario(int documento) throws PropietarioNoEncontradoExcepcion {
        PropietarioDTO encontrado = dao.buscarPropietario(documento);
        if (encontrado == null) {
            throw new PropietarioNoEncontradoExcepcion("Propietario no encontrado con documento: " + documento);
        }
        return encontrado;
    }

    public boolean actualizarDatos(PropietarioDTO actualizado) throws PropietarioNoEncontradoExcepcion {
        PropietarioDTO actual = dao.buscarPropietario(actualizado.getDocumento());
        if (actual == null) {
            throw new PropietarioNoEncontradoExcepcion("No se puede actualizar: propietario no encontrado.");
        }

        return dao.actualizarDatos(actualizado);
    }

    public boolean eliminarPropietario(int documento) throws PropietarioNoEncontradoExcepcion {
        PropietarioDTO actual = dao.buscarPropietario(documento);
        if (actual == null) {
            throw new PropietarioNoEncontradoExcepcion("No se puede eliminar: propietario no encontrado.");
        }

        boolean eliminado = dao.eliminarPropietario(documento);
        if (eliminado) {
            daoMascota.ponerMascotasEnAdopcionPorPropietario(documento);
        }

        return eliminado;
    }

    public DefaultTableModel obtenerTablaPropietarios() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"ID", "Nombre", "Documento", "Teléfono", "Correo"});

        for (PropietarioDTO p : dao.getPropietarios()) {
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

    public DefaultTableModel obtenerTablaMascotasDePropietario(int documento) throws PropietarioNoEncontradoExcepcion {
        buscarPropietario(documento);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"ID", "Nombre", "Especie", "Raza", "Edad", "Peso"});

        for (MascotaDTO m : daoMascota.getListaMascotas()) {
            if (m.getIdPropietario() == documento) {
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
