package Persistencia;

import DTOs.MascotaDTO;
import DTOs.PropietarioDTO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializadoraMascota {

    private ArrayList<MascotaDTO> listaMascotas;

    public SerializadoraMascota() {
        this.listaMascotas = leerListaMascota();
    }

    public ArrayList<MascotaDTO> getListaMascota() {
        return listaMascotas;
    }

    public void escribirMascota() {
        try {
            FileOutputStream archivo = new FileOutputStream("mascotas.txt");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(listaMascotas);
            escritor.close();
        } catch (IOException ex) {

        }
    }

    public ArrayList<MascotaDTO> leerListaMascota() {

        try {
            FileInputStream archivo = new FileInputStream("mascotas.txt");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            ArrayList<MascotaDTO> lista = (ArrayList<MascotaDTO>) lector.readObject();
            lector.close();
            return lista;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }

}
