package Controladores;

import DAOs.DaoCita;
import DAOs.DaoConsulta;
import DAOs.DaoMascota;
import DAOs.DaoPropietario;
import DAOs.DaoVacuna;
import DTOs.MascotaDTO;
import DTOs.PropietarioDTO;
import Excepciones.MascotaExistenteExcepcion;
import Excepciones.MascotaNoEncontradaExcepcion;
import Excepciones.PropietarioNoEncontradoExcepcion;
import javax.swing.table.DefaultTableModel;

public class ControladorMascota {

    private final DaoMascota mascotaDAO;
    private final DaoPropietario daoPropietario;
    private final DaoCita daoCita;
    private final DaoConsulta daoConsulta;
    private final DaoVacuna daoVacuna;

    public ControladorMascota() {
        this.mascotaDAO = new DaoMascota();
        this.daoPropietario = new DaoPropietario();
        this.daoCita = new DaoCita();
        this.daoConsulta = new DaoConsulta();
        this.daoVacuna = new DaoVacuna();
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
            throw new IllegalArgumentException("La mascota no puede ser nula");
        }

        if (mascotaDAO.buscarMascota(mascota.getIdMascota()) != null) {
            throw new MascotaExistenteExcepcion("Ya existe una mascota con ID: " + mascota.getIdMascota());
        }

        PropietarioDTO propietario = daoPropietario.buscarPropietario(idPropietario);
        if (propietario == null) {
            throw new PropietarioNoEncontradoExcepcion("No se encontró el propietario con ID: " + idPropietario);
        }

        mascota.setIdPropietario(idPropietario);
        return mascotaDAO.guardarMascota(mascota);
    }

    public MascotaDTO buscarMascota(int idMascota) throws MascotaNoEncontradaExcepcion {
        MascotaDTO encontrada = mascotaDAO.buscarMascota(idMascota);
        if (encontrada == null) {
            throw new MascotaNoEncontradaExcepcion("No se encontró la mascota con ID: " + idMascota);
        }
        return encontrada;
    }

    public boolean asignarPropietarioAMascota(int idMascota, int idPropietario)
            throws MascotaNoEncontradaExcepcion, PropietarioNoEncontradoExcepcion {

        // Validar parámetros
        if (idMascota <= 0) {
            throw new IllegalArgumentException("El ID de la mascota debe ser un número positivo.");
        }

        if (idPropietario <= 0) {
            throw new IllegalArgumentException("El ID del propietario debe ser un número positivo.");
        }

        // Verificar que la mascota existe
        MascotaDTO mascota = mascotaDAO.buscarMascota(idMascota);
        if (mascota == null) {
            throw new MascotaNoEncontradaExcepcion("No se encontró la mascota con ID: " + idMascota);
        }

        // Verificar que el propietario existe
        PropietarioDTO propietario = daoPropietario.buscarPropietario(idPropietario);
        if (propietario == null) {
            throw new PropietarioNoEncontradoExcepcion("No se encontró el propietario con ID: " + idPropietario);
        }

        // Asignar el propietario a la mascota
        mascota.setIdPropietario(idPropietario);
        return mascotaDAO.actualizarDatosMascota(mascota);
    }

    // Método adicional para verificar si una mascota ya tiene propietario
    public boolean mascotaTienePropietario(int idMascota) throws MascotaNoEncontradaExcepcion {
        MascotaDTO mascota = mascotaDAO.buscarMascota(idMascota);
        if (mascota == null) {
            throw new MascotaNoEncontradaExcepcion("No se encontró la mascota con ID: " + idMascota);
        }
        return mascota.getIdPropietario() > 0;
    }

    public boolean actualizarMascota(MascotaDTO dto) throws MascotaNoEncontradaExcepcion {
        MascotaDTO actual = mascotaDAO.buscarMascota(dto.getIdMascota());
        if (actual == null) {
            throw new MascotaNoEncontradaExcepcion("No se encontró la mascota para actualizar sus datos.");
        }
        return mascotaDAO.actualizarDatosMascota(dto);
    }

    public boolean eliminarMascota(int idMascota) throws MascotaNoEncontradaExcepcion {
        MascotaDTO mascota = mascotaDAO.buscarMascota(idMascota);
        if (mascota == null) {
            throw new MascotaNoEncontradaExcepcion("No se encontró la mascota: no se puede eliminar una mascota no existente.");
        }
        daoCita.eliminarCitasPorMascota(idMascota);
        daoConsulta.eliminarConsultaMascota(idMascota);
        daoVacuna.eliminarVacunaMascota(idMascota);
        return mascotaDAO.eliminarMascota(idMascota);
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
}
