package Modelo;

import java.time.LocalDate;

public class Vacuna extends EventoClinico {

    private String tipoVacuna;
    private String lote;
    private String fechaProx;

    public Vacuna(int id, LocalDate fecha, Mascota mascota, String descripcion, String tipoVacuna, String lote, String fechaProx) {
        super(id, fecha, mascota, descripcion);
        this.tipoVacuna = tipoVacuna;
        this.lote = lote;
        this.fechaProx = fechaProx;
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

    public String getFechaProx() {
        return fechaProx;
    }

    public void setFechaProx(String fechaProx) {
        this.fechaProx = fechaProx;
    }

    @Override
    public String mostrarDetalle() {
        return "Vacuna [" + fecha + "]\n"
                + "Tipo: " + tipoVacuna + "\n"
                + "Lote: " + lote + "\n"
                + "Proxima Dosis: " + fechaProx;
    }
}
