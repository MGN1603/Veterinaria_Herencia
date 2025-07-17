package Modelo;

import java.time.LocalDate;

public class Consulta extends EventoClinico {

    private String diagnostico;
    private String tratamiento;
    private String medicamentos;
    private Veterinario veterinario;
    private Cita cita;

    public Consulta(int id, String diagnostico, String tratamiento, String medicamentos, Veterinario veterinario, LocalDate fecha, Mascota mascota, String descripcion, Cita cita) {
        super(id, fecha, mascota, descripcion);
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.medicamentos = medicamentos;
        this.veterinario = veterinario;
        this.cita = cita;
    }

    public Cita getCita() {
        return cita;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    @Override
    public String mostrarDetalle() {
        return "Consulta [" + fecha + "]\n"
                + "Veterinario: " + (veterinario != null ? veterinario.getNombre() : "N/A") + "\n"
                + "Diagnóstico: " + diagnostico + "\n"
                + "Tratamiento: " + tratamiento + "\n"
                + "Medicamentos: " + medicamentos;
    }
}

