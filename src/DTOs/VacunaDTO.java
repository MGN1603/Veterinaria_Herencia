package DTOs;

import java.io.Serializable;
import java.time.LocalDate;

public class VacunaDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idVacuna;
    private LocalDate fecha;
    private int idMascota;
    private String descripcion;
    private String tipoVacuna;
    private String lote;
    private LocalDate fechaProx;

    public VacunaDTO(int idVacuna, LocalDate fecha, int idMascota, String descripcion, String tipoVacuna, String lote, LocalDate fechaProx) {
        this.idVacuna = idVacuna;
        this.fecha = fecha;
        this.idMascota = idMascota;
        this.descripcion = descripcion;
        this.tipoVacuna = tipoVacuna;
        this.lote = lote;
        this.fechaProx = fechaProx;
    }

    public int getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public LocalDate getFechaProx() {
        return fechaProx;
    }

    public void setFechaProx(LocalDate fechaProx) {
        this.fechaProx = fechaProx;
    }

}
