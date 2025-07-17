package Modelo;

public class Veterinario extends Persona {

    private String especialidad;
    private boolean disponibilidad;

    public Veterinario(String especialidad, boolean disponibilidad, String nombre, int documento, int telefono, String correo) {
        super(nombre, documento, telefono, correo);
        this.especialidad = especialidad;
        this.disponibilidad = disponibilidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + ", Especialidad: " + especialidad + ", Disponible: " + disponibilidad;
    }

    @Override
    public String toString() {
        return nombre + "-" + especialidad;
    }
}
