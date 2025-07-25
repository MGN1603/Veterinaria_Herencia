package DTOs;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CitaDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idCita;
    private LocalDate fecha;
    private String descripcion;
    private LocalDateTime horaCita;
    private boolean atendida;
    private int idVeterinario;
    private int idMascota;
    private int idConsulta;

    public CitaDTO(int idCita, LocalDate fecha, String descripcion, LocalDateTime horaCita, boolean atendida, int idVeterinario, int idMascota, int idConsulta) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.horaCita = horaCita;
        this.atendida = atendida;
        this.idVeterinario = idVeterinario;
        this.idMascota = idMascota;
        this.idConsulta = idConsulta;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(LocalDateTime horaCita) {
        this.horaCita = horaCita;
    }

    public boolean isAtendida() {
        return atendida;
    }

    public void setAtendida(boolean atendida) {
        this.atendida = atendida;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

}
