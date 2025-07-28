package DAOs;

import DTOs.MascotaDTO;
import Persistencia.GestorPersistencia;

import java.util.ArrayList;
import java.util.List;

public class DaoMascota {

    private final String RUTA = "datos/mascotas.dat";
    private final GestorPersistencia gestor = GestorPersistencia.getInstance();

    public ArrayList<MascotaDTO> getListaMascotas() {
        List<MascotaDTO> mascotas = gestor.cargarLista(RUTA);
        return mascotas != null ? new ArrayList<>(mascotas) : new ArrayList<>();
    }

    public boolean guardarMascota(MascotaDTO mascota) {
        if (mascota == null || buscarMascota(mascota.getIdMascota()) != null) {
            return false;
        }

        ArrayList<MascotaDTO> lista = getListaMascotas();
        lista.add(mascota);
        gestor.guardarLista(RUTA, lista);
        return true;
    }

    public MascotaDTO buscarMascota(int idMascota) {
        for (MascotaDTO m : getListaMascotas()) {
            if (m.getIdMascota() == idMascota) {
                return m;
            }
        }
        return null;
    }

    public void ponerMascotasEnAdopcionPorPropietario(int idPropietario) {
        ArrayList<MascotaDTO> lista = getListaMascotas();
        for (MascotaDTO mascota : lista) {
            if (mascota.getIdPropietario() == idPropietario) {
                mascota.setIdPropietario(0);
            }
        }
        gestor.guardarLista(RUTA, lista);
    }

    public boolean actualizarDatosMascota(MascotaDTO mascota) {
        ArrayList<MascotaDTO> lista = getListaMascotas();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIdMascota() == mascota.getIdMascota()) {
                lista.set(i, mascota);
                gestor.guardarLista(RUTA, lista);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarMascota(int idMascota) {
        ArrayList<MascotaDTO> lista = getListaMascotas();
        boolean eliminado = lista.removeIf(m -> m.getIdMascota() == idMascota);
        if (eliminado) {
            gestor.guardarLista(RUTA, lista);
        }
        return eliminado;
    }
}
