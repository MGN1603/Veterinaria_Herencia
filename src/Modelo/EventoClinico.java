package Modelo;

import java.time.LocalDate;

public abstract class EventoClinico {

    protected int id;
    protected LocalDate fecha;
    protected Mascota mascota;
    protected String descripcion;

    public EventoClinico(int id, LocalDate fecha, Mascota mascota, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.mascota = mascota;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract String mostrarDetalle();

}
