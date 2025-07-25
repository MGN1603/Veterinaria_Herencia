package Persistencia;

import DTOs.PropietarioDTO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializadoraPropietario {

    private ArrayList<PropietarioDTO> listaPropietario;

    public SerializadoraPropietario() {
        this.listaPropietario = leerListaPropietario();
    }

    public ArrayList<PropietarioDTO> getListaPropietario() {
        return listaPropietario;
    }

    public void escribirPropietario() {
        try {
            FileOutputStream archivo = new FileOutputStream("propietarios.txt");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(listaPropietario);
            escritor.close();
        } catch (IOException ex) {

        }
    }

    public ArrayList<PropietarioDTO> leerListaPropietario() {

        try {
            FileInputStream archivo = new FileInputStream("propietarios.txt");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            ArrayList<PropietarioDTO> lista = (ArrayList<PropietarioDTO>) lector.readObject();
            lector.close();
            return lista;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }
}
