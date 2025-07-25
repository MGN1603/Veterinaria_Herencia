package Controladores;

import DAOs.DaoVacuna;
import DAOs.DaoMascota;
import DTOs.VacunaDTO;
import DTOs.MascotaDTO;
import Excepciones.MascotaNoEncontradaExcepcion;
import Excepciones.VacunaInvalidaExcepcion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControladorVacuna {

    private final DaoVacuna daoVacuna;
    private final DaoMascota daoMascota;

    public ControladorVacuna() {
        this.daoVacuna = new DaoVacuna();
        this.daoMascota = new DaoMascota();
    }

    public ArrayList<VacunaDTO> getVacunas() {
        return daoVacuna.getVacunas();
    }

    public boolean registrarVacuna(VacunaDTO vacuna)
            throws VacunaInvalidaExcepcion, MascotaNoEncontradaExcepcion {

        if (vacuna == null) {
            throw new VacunaInvalidaExcepcion("La vacuna no puede ser null.");
        }

        if (vacuna.getIdMascota() <= 0) {
            throw new VacunaInvalidaExcepcion("El ID de mascota no es válido.");
        }
        System.out.println("Mascotas actualmente en memoria en DaoMascota desde Vacuna:");
        for (MascotaDTO m : daoMascota.getListaMascotas()) {
            System.out.println(m.getIdMascota()+ " - " + m.getNombre());
        }
        MascotaDTO mascota = daoMascota.buscarMascota(vacuna.getIdMascota());
        if (mascota == null) {
            throw new MascotaNoEncontradaExcepcion("No se encontró la mascota con ID: " + vacuna.getIdMascota());
        }

        return daoVacuna.registrarVacuna(vacuna);
    }

    public ArrayList<VacunaDTO> obtenerVacunasPorMascota(int idMascota)
            throws MascotaNoEncontradaExcepcion {

        MascotaDTO mascota = daoMascota.buscarMascota(idMascota);
        if (mascota == null) {
            throw new MascotaNoEncontradaExcepcion("La mascota con ID " + idMascota + " no existe.");
        }

        return daoVacuna.obtenerVacunasPorMascota(idMascota);
    }

    public DefaultTableModel tablaVacunasPorMascota(int idMascota)
            throws MascotaNoEncontradaExcepcion {

        String[] columnas = {"Nombre Mascota", "Vacuna", "Lote", "Aplicación", "Fecha Prox."};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        MascotaDTO mascota = daoMascota.buscarMascota(idMascota);
        if (mascota == null) {
            throw new MascotaNoEncontradaExcepcion("La mascota con ID " + idMascota + " no existe.");
        }

        for (VacunaDTO vacuna : daoVacuna.obtenerVacunasPorMascota(idMascota)) {
            Object[] fila = {
                mascota.getNombre(),
                vacuna.getTipoVacuna(),
                vacuna.getLote(),
                vacuna.getFecha(),
                vacuna.getFechaProx()
            };
            modelo.addRow(fila);
        }

        return modelo;
    }

    public int generarIdVacuna() {
        return daoVacuna.getVacunas().size() + 1;
    }
}
