package Controladores;

import Modelo.Mascota;
import Modelo.Propietario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControladorMascota {

    private final ArrayList<Mascota> listaMascotas;
    private final ControladorPropietario controladorPropietario;

    public ControladorMascota(ControladorPropietario controladorPropietario) {
        this.listaMascotas = new ArrayList<>();
        this.controladorPropietario = controladorPropietario;
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public boolean guardarMascota(Mascota mascota) {
        if (mascota != null && buscarMascota(mascota.getIdMascota()) == null) {
            listaMascotas.add(mascota);
            return true;
        }
        return false;
    }

    public boolean guardarMascotaConPropietario(Mascota mascota, int docPropietario) {
        if (mascota != null) {
            Propietario propietario = controladorPropietario.buscarPropietario(docPropietario);
            if (propietario != null) {
                mascota.asignarPropietario(propietario);
                controladorPropietario.agregarMascotaAPropietario(propietario, mascota);
                listaMascotas.add(mascota);
                return true;
            }
        }
        return false;
    }

    public Mascota buscarMascota(int idMascota) {
        for (Mascota m : listaMascotas) {
            if (m.getIdMascota() == idMascota) {
                return m;
            }
        }
        return null;
    }

    public boolean actualizarDatosMascota(Mascota mascota) {
        Mascota existente = buscarMascota(mascota.getIdMascota());
        if (existente != null) {
            existente.setNombre(mascota.getNombre());
            existente.setPeso(mascota.getPeso());
            existente.setEdad(mascota.getEdad());
            existente.setEspecie(mascota.getEspecie());
            existente.setRaza(mascota.getRaza());
            return true;
        }
        return false;
    }

    public boolean eliminarMascota(int idMascota) {
        Mascota encontrada = buscarMascota(idMascota);
        if (encontrada != null) {
            Propietario propietario = encontrada.getPropietario();
            if (propietario != null) {
                propietario.getMascotas().remove(encontrada);
            }
            listaMascotas.remove(encontrada);
            return true;
        }
        return false;
    }

    public DefaultTableModel listarMascotasTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{
            "ID", "Nombre", "Especie", "Raza", "Edad", "Peso", "Doc.Pro", "Nombre.Pro"
        });

        for (Mascota mascota : listaMascotas) {
            String documento = "N/A";
            String nombrePropietario = "Sin Dueño";

            if (mascota.getPropietario() != null) {
                documento = String.valueOf(mascota.getPropietario().getDocumento());
                nombrePropietario = mascota.getPropietario().getNombre();
            }
            
            modelo.addRow(new Object[]{
                mascota.getIdMascota(),
                mascota.getNombre(),
                mascota.getEspecie(),
                mascota.getRaza(),
                mascota.getEdad(),
                mascota.getPeso(),
                documento,
                nombrePropietario
            });
        }
        return modelo;
    }

}
