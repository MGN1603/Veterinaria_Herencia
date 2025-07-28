package Controladores;

import DAOs.DaoCita;
import DAOs.DaoConsulta;
import DAOs.DaoMascota;
import DAOs.DaoPropietario;
import DAOs.DaoVacuna;
import DAOs.DaoVeterinario;
import DTOs.MascotaDTO;
import DTOs.PropietarioDTO;
import Excepciones.MascotaExistenteExcepcion;
import Excepciones.MascotaNoEncontradaExcepcion;
import Excepciones.PropietarioNoEncontradoExcepcion;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControladorMascota {

    private final DaoMascota mascotaDAO;
    private final DaoPropietario daoPropietario;
    private final DaoCita daoCita;
    private final DaoConsulta daoConsulta;
    private final DaoVacuna daoVacuna;
    private final DaoVeterinario daoVeterinario;
    private final HistorialClinico historialClinico;

    public ControladorMascota(DaoMascota mascotaDAO, DaoPropietario daoPropietario, DaoCita daoCita,
            DaoConsulta daoConsulta, DaoVacuna daoVacuna, DaoVeterinario daoVeterinario) {
        this.mascotaDAO = mascotaDAO;
        this.daoPropietario = daoPropietario;
        this.daoCita = daoCita;
        this.daoConsulta = daoConsulta;
        this.daoVacuna = daoVacuna;
        this.daoVeterinario = daoVeterinario;
        this.historialClinico = new HistorialClinico(
                daoCita, daoVacuna, daoConsulta, daoVeterinario, mascotaDAO
        );
    }

    public boolean guardarMascota(MascotaDTO mascota) throws MascotaExistenteExcepcion {
        if (mascota == null) {
            throw new IllegalArgumentException("La mascota no puede ser nula.");
        }

        if (mascotaDAO.buscarMascota(mascota.getIdMascota()) != null) {
            throw new MascotaExistenteExcepcion("Ya existe una mascota con ID: " + mascota.getIdMascota());
        }

        return mascotaDAO.guardarMascota(mascota);
    }

    public boolean guardarMascotaPropietario(MascotaDTO mascota, int idPropietario)
            throws PropietarioNoEncontradoExcepcion, MascotaExistenteExcepcion {

        if (mascota == null) {
            throw new IllegalArgumentException("La mascota no puede ser nula.");
        }
        if (mascotaDAO.buscarMascota(mascota.getIdMascota()) != null) {
            throw new MascotaExistenteExcepcion("Ya existe una mascota con ID: " + mascota.getIdMascota());
        }

        PropietarioDTO propietario = validarYObtenerPropietario(idPropietario);
        mascota.setIdPropietario(idPropietario);

        return mascotaDAO.guardarMascota(mascota);
    }

    public MascotaDTO buscarMascota(int idMascota) throws MascotaNoEncontradaExcepcion {
        return validarYObtenerMascota(idMascota);
    }

    public boolean eliminarMascota(int idMascota) throws MascotaNoEncontradaExcepcion {
        validarYObtenerMascota(idMascota);

        // Eliminación en cascada
        daoCita.eliminarCitaPorMascota(idMascota);
        daoConsulta.eliminarConsultaMascota(idMascota);
        daoVacuna.eliminarVacunaMascota(idMascota);

        return mascotaDAO.eliminarMascota(idMascota);
    }

    public boolean actualizarMascota(MascotaDTO mascotaActualizada)
            throws MascotaNoEncontradaExcepcion {
        validarYObtenerMascota(mascotaActualizada.getIdMascota());
        return mascotaDAO.actualizarDatosMascota(mascotaActualizada);
    }

    public ArrayList<MascotaDTO> obtenerMascotas() {
        return mascotaDAO.getListaMascotas();
    }

    public boolean mascotaTienePropietario(int idMascota) throws MascotaNoEncontradaExcepcion {
        MascotaDTO mascota = validarYObtenerMascota(idMascota);
        return mascota.getIdPropietario() > 0;
    }

    public DefaultTableModel listarMascotasTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{
            "ID", "Nombre", "Especie", "Raza", "Edad", "Peso", "Doc. Prop.", "Nombre Prop."
        });

        for (MascotaDTO mascota : mascotaDAO.getListaMascotas()) {
            String nombreProp = "En adopción";
            PropietarioDTO propietario = daoPropietario.buscarPropietario(mascota.getIdPropietario());
            if (propietario != null) {
                nombreProp = propietario.getNombre();
            }

            modelo.addRow(new Object[]{
                mascota.getIdMascota(),
                mascota.getNombre(),
                mascota.getEspecie(),
                mascota.getRaza(),
                mascota.getEdad(),
                mascota.getPeso(),
                mascota.getIdPropietario(),
                nombreProp
            });
        }

        return modelo;
    }

    public MascotaDTO validarYObtenerMascota(int idMascota) throws MascotaNoEncontradaExcepcion {
        if (idMascota <= 0) {
            throw new IllegalArgumentException("ID de mascota inválido.");
        }
        MascotaDTO mascota = mascotaDAO.buscarMascota(idMascota);
        if (mascota == null) {
            throw new MascotaNoEncontradaExcepcion("No se encontró la mascota con ID: " + idMascota);
        }
        return mascota;
    }

    public PropietarioDTO validarYObtenerPropietario(int idPropietario)
            throws PropietarioNoEncontradoExcepcion {
        if (idPropietario <= 0) {
            throw new IllegalArgumentException("ID de propietario inválido.");
        }
        PropietarioDTO propietario = daoPropietario.buscarPropietario(idPropietario);
        if (propietario == null) {
            throw new PropietarioNoEncontradoExcepcion("No se encontró el propietario con ID: " + idPropietario);
        }
        return propietario;
    }

    public String obtenerHistorialClinico(int idMascota) throws MascotaNoEncontradaExcepcion {
        validarYObtenerMascota(idMascota);

        return historialClinico.obtenerHistorialClinico(idMascota);
    }
}
