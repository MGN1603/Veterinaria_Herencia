package DAOs;

import DTOs.MascotaDTO;
import Persistencia.SerializadoraMascota;
import java.util.ArrayList;

public class DaoMascota {

    private final ArrayList<MascotaDTO> listaMascota;
    private final SerializadoraMascota serializadoraMascota;

    public DaoMascota() {
        this.serializadoraMascota = new SerializadoraMascota();
        this.listaMascota = serializadoraMascota.getListaMascota();
    }

    public ArrayList<MascotaDTO> getListaMascotas() {
        return listaMascota;
    }

    public boolean guardarMascota(MascotaDTO mascota) {
        if (mascota != null && buscarMascota(mascota.getIdMascota()) == null) {
            listaMascota.add(mascota);
            serializadoraMascota.escribirMascota();
            return true;
        }
        return false;
    }

    public MascotaDTO buscarMascota(int idMascota) {
        for (MascotaDTO m : listaMascota) {
            if (m.getIdMascota() == idMascota) {
                return m;
            }
        }
        return null;
    }

    public void ponerMascotasEnAdopcionPorPropietario(int idPropietario) {
        for (MascotaDTO mascota : listaMascota) {
            if (mascota.getIdPropietario() == idPropietario) {
                mascota.setIdPropietario(0);
            }
        }
        serializadoraMascota.escribirMascota();
    }

    public boolean actualizarDatosMascota(MascotaDTO mascota) {
        MascotaDTO existente = buscarMascota(mascota.getIdMascota());
        if (existente != null) {
            existente.setNombre(mascota.getNombre());
            existente.setPeso(mascota.getPeso());
            existente.setEdad(mascota.getEdad());
            existente.setEspecie(mascota.getEspecie());
            existente.setRaza(mascota.getRaza());
            existente.setIdPropietario(mascota.getIdPropietario()); 
            serializadoraMascota.escribirMascota();
            return true;
        }
        return false;
    }

    public boolean eliminarMascota(int idMascota) {
        MascotaDTO encontrada = buscarMascota(idMascota);
        if (encontrada != null) {
            listaMascota.remove(encontrada);
            serializadoraMascota.escribirMascota();
            return true;
        }
        return false;
    }
}
