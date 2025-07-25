package Persistencia;

import DTOs.CitaDTO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializadoraCita {

    private ArrayList<CitaDTO> listaCitas;

    public SerializadoraCita() {
        this.listaCitas = leerListaCitas();
    }

    public ArrayList<CitaDTO> getListaCita() {
        return listaCitas;
    }

    public void escribirCita() {
        try {
            FileOutputStream archivo = new FileOutputStream("citas.txt");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(listaCitas);
            escritor.close();
        } catch (IOException ex) {

        }
    }

    public ArrayList<CitaDTO> leerListaCitas() {

        try {
            FileInputStream archivo = new FileInputStream("citas.txt");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            ArrayList<CitaDTO> lista = (ArrayList<CitaDTO>) lector.readObject();
            lector.close();
            return lista;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }

}
