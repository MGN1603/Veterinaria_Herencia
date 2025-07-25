package DTOs;

import java.io.Serializable;
import java.time.LocalDate;

public class ConsultaDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idConsulta;
    private LocalDate fecha;
    private String diagnostico;
    private String tratamiento;
    private String medicamentos;
    private String descripcion;
    private int idVeterinario;
    private int idCita;
    private int idMascota;

    public ConsultaDTO(int idConsulta, LocalDate fecha, String diagnostico, String tratamiento, String medicamentos, String descripcion, int idVeterinario, int idCita, int idMascota) {
        this.idConsulta = idConsulta;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.medicamentos = medicamentos;
        this.descripcion = descripcion;
        this.idVeterinario = idVeterinario;
        this.idCita = idCita;
        this.idMascota = idMascota;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }
}
