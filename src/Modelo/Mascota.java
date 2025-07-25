package Modelo;

import java.util.ArrayList;

public class Mascota {

    private String nombre;
    private int idMascota;
    private String especie;
    private String raza;
    private int edad;
    private double peso;
    private ArrayList<EventoClinico> historial;
    private Propietario propietario;

    public Mascota(String nombre, int idMascota, String especie, String raza, int edad, double peso, Propietario propietario) {
        this.nombre = nombre;
        this.idMascota = idMascota;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.propietario = propietario;
        this.historial = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<EventoClinico> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<EventoClinico> historial) {
        this.historial = historial;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
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
