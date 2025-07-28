package DTOs;

import java.io.Serializable;

public class VeterinarioDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private int documento;
    private int telefono;
    private String correo;
    private String especialidad;
    private boolean disponibilidad;

    public VeterinarioDTO(String nombre, int documento, int telefono, String correo, String especialidad, boolean disponibilidad) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
    public String toString() {
        return nombre + "-" + especialidad;
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre + "\n"
                + "Documento: " + documento + "\n"
                + "Telefono: " + telefono + "\n"
                + "Correo: " + correo + "\n"
                + "Especialidad: " + especialidad + "\n"
                + "Disponibilidad: " + disponibilidad;

    }

}
