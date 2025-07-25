package DAOs;

import DTOs.VacunaDTO;
import Persistencia.SerializadoraVacuna;
import java.util.ArrayList;

public class DaoVacuna {

    private final ArrayList<VacunaDTO> vacunas;
    private final SerializadoraVacuna serializadoraVacuna;

    public DaoVacuna() {
        this.serializadoraVacuna = new SerializadoraVacuna();
        this.vacunas = serializadoraVacuna.getListaVacuna();

    }

    public ArrayList<VacunaDTO> getVacunas() {
        return vacunas;
    }

    public boolean registrarVacuna(VacunaDTO vacuna) {
        if (vacuna != null && vacuna.getIdMascota() > 0) {
            vacunas.add(vacuna);
            serializadoraVacuna.escribirVacuna();
            return true;
        }
        return false;
    }

    public ArrayList<VacunaDTO> obtenerVacunasPorMascota(int idMascota) {
        ArrayList<VacunaDTO> resultado = new ArrayList<>();
        for (VacunaDTO vacuna : vacunas) {
            if (vacuna.getIdMascota() == idMascota) {
                resultado.add(vacuna);
                serializadoraVacuna.escribirVacuna();
            }
        }
        return resultado;
    }

    public void eliminarVacunaMascota(int idMascota) {
        vacunas.removeIf(vacuna -> vacuna.getIdMascota() == idMascota);
        serializadoraVacuna.escribirVacuna();
    }
}
