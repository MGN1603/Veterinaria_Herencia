package Modelo;

import java.util.ArrayList;

public class Mascota {

    private String nombre;
    private final int idMascota;
    private String especie;
    private String raza;
    private int edad;
    private double peso;
    private ArrayList<EventoClinico> historial;
    private Propietario propietario;

    public Mascota(String nombre, int idMascota, String especie, String raza, int edad, double peso) {
        setNombre(nombre);
        setEspecie(especie);
        setRaza(raza);
        setEdad(edad);
        setPeso(peso);
        this.idMascota = idMascota;
        this.historial = new ArrayList<>();
    }

    public int getIdMascota() {
        return idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.isBlank()) {
            throw new IllegalArgumentException("La especie no puede ser nula");
        }
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if (raza == null || raza.isBlank()) {
            throw new IllegalArgumentException("La Raza no puede ser nula");
        }
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La Edad no puede ser Negativo");
        }
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso no puede ser negativo ni cero");
        }
        this.peso = peso;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void asignarPropietario(Propietario propietario) {
        if (propietario == null) {
            throw new IllegalArgumentException("El propietario no puede ser nulo");
        }
        this.propietario = propietario;
    }

    public ArrayList<EventoClinico> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<EventoClinico> historial) {
        this.historial = historial;
    }

    public void agregarEvento(EventoClinico evento) {
        historial.add(evento);
    }

    public String historialClinico() {

        if (historial.isEmpty()) {
            return "Esta mascota no tiene historial clínico registrado.";
        }
        StringBuilder sb = new StringBuilder("Historial clínico de " + nombre + ":\n\n");
        for (EventoClinico evento : historial) {
            sb.append("---------\n");
            sb.append(evento.mostrarDetalle()).append("\n\n");
        }

        return sb.toString();
    }
}
