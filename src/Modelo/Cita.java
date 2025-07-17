package Modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cita extends EventoClinico {

    private LocalDateTime horaCita;
    private boolean atendida;
    private Veterinario veterinario;
    private Consulta consulta;

    public Cita(int id, LocalDateTime horaCita, boolean atendida, Veterinario veterinario, LocalDate fecha, Mascota mascota, String descripcion) {
        super(id, fecha, mascota, descripcion);
        this.horaCita = horaCita;
        this.atendida = atendida;
        this.veterinario = veterinario;
        this.consulta = null;
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

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    @Override
    public String mostrarDetalle() {
        return "Cita [" + fecha + " - " + horaCita.toLocalTime() + "]\n"
                + "Veterinario: " + (veterinario != null ? veterinario.getNombre() : "N/A") + "\n"
                + "Estado: " + (atendida ? "Atendida" : "Pendiente") + "\n"
                + "Motivo: " + descripcion;
    }
}
