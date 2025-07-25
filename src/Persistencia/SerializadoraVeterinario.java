package Persistencia;

import DTOs.VeterinarioDTO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializadoraVeterinario {

    private ArrayList<VeterinarioDTO> listaVeterinarios;

    public SerializadoraVeterinario() {
        this.listaVeterinarios = leerListaVeterinario();
    }

    public ArrayList<VeterinarioDTO> getListaVeterinario() {
        return listaVeterinarios;
    }

    public void escribirVeterinario() {
        try {
            FileOutputStream archivo = new FileOutputStream("veterinarios.txt");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(listaVeterinarios);
            escritor.close();
        } catch (IOException ex) {

        }
    }

    public ArrayList<VeterinarioDTO> leerListaVeterinario() {

        try {
            FileInputStream archivo = new FileInputStream("veterinarios.txt");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            ArrayList<VeterinarioDTO> lista = (ArrayList<VeterinarioDTO>) lector.readObject();
            lector.close();
            return lista;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }

}
