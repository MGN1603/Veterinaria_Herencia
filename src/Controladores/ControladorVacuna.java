package Controladores;

import Modelo.Mascota;
import Modelo.Vacuna;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControladorVacuna {

    private final ArrayList<Vacuna> vacunas;

    public ControladorVacuna() {
        this.vacunas = new ArrayList<>();

    }

    public ArrayList<Vacuna> getVacunas() {
        return vacunas;
    }

    public boolean registrarVacuna(Vacuna vacuna) {
        if (vacuna != null && vacuna.getMascota() != null) {
            vacunas.add(vacuna);
            vacuna.getMascota().agregarEvento(vacuna);
            return true;
        }
        return false;
    }

    public ArrayList<Vacuna> obtenerVacunasPorMascota(Mascota mascota) {
        ArrayList<Vacuna> resultado = new ArrayList<>();
        for (Vacuna v : vacunas) {
            if (v.getMascota().equals(mascota)) {
                resultado.add(v);
            }
        }
        return resultado;
    }

    public DefaultTableModel TablaVacunasPorMascota(Mascota mascota) {
        String[] columnas = {"Nombre Mascota", "Vacuna", "Lote", "Aplicacion", "Fecha Prox"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (Vacuna vacuna : obtenerVacunasPorMascota(mascota)) {
            Object[] fila = {
                mascota.getNombre(),
                vacuna.getTipoVacuna(),
                vacuna.getLote(),
                vacuna.getFecha(),
                vacuna.getFechaProx(),};
            modelo.addRow(fila);
        }

        return modelo;
    }

    public int generarIdVacunas() {
        return vacunas.size() + 1;
    }
}
