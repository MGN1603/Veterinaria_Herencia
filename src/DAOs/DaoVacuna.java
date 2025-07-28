package DAOs;

import DTOs.VacunaDTO;
import Persistencia.GestorPersistencia;

import java.util.ArrayList;
import java.util.List;

public class DaoVacuna {

    private final String RUTA = "datos/vacunas.dat";
    private final GestorPersistencia gestor = GestorPersistencia.getInstance();

    public ArrayList<VacunaDTO> getVacunas() {
        List<VacunaDTO> lista = gestor.cargarLista(RUTA);
        return lista != null ? new ArrayList<>(lista) : new ArrayList<>();
    }

    public boolean registrarVacuna(VacunaDTO vacuna) {
        if (vacuna == null || vacuna.getIdMascota() <= 0) {
            return false;
        }

        ArrayList<VacunaDTO> lista = getVacunas();
        lista.add(vacuna);
        gestor.guardarLista(RUTA, lista);
        return true;
    }

    public ArrayList<VacunaDTO> obtenerVacunasPorMascota(int idMascota) {
        ArrayList<VacunaDTO> resultado = new ArrayList<>();
        for (VacunaDTO vacuna : getVacunas()) {
            if (vacuna.getIdMascota() == idMascota) {
                resultado.add(vacuna);
            }
        }
        return resultado;
    }

    public void eliminarVacunaMascota(int idMascota) {
        ArrayList<VacunaDTO> lista = getVacunas();
        boolean modificada = lista.removeIf(v -> v.getIdMascota() == idMascota);
        if (modificada) {
            gestor.guardarLista(RUTA, lista);
        }
    }
}
