package Modelo;

import java.util.ArrayList;

public class Propietario extends Persona {

    private ArrayList<Mascota> mascotas;

    public Propietario(String nombre, int documento, int telefono, String correo) {
        super(nombre, documento, telefono, correo);
        this.mascotas = new ArrayList<>();
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos();
    }

}
