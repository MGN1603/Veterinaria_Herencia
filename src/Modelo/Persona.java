package Modelo;

public class Persona {

    protected String nombre;
    protected int documento;
    protected int telefono;
    protected String correo;

    public Persona(String nombre, int documento, int telefono, String correo) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
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

    public String mostrarDatos() {
        return """
            DATOS DE LA PERSONA
            Nombre: """ + nombre + "\n"
                + "Documento: " + documento + "\n"
                + "Teléfono: " + telefono + "\n"
                + "Correo: " + correo;
    }
}
