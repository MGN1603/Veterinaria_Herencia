package Persistencia;

import DTOs.ConsultaDTO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializadoraConsulta {

    private ArrayList<ConsultaDTO> listaConsultas;

    public SerializadoraConsulta() {
        this.listaConsultas = leerListaConsulta();
    }

    public ArrayList<ConsultaDTO> getListaConsulta() {
        return listaConsultas;
    }

    public void escribirConsulta() {
        try {
            FileOutputStream archivo = new FileOutputStream("consultas.txt");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(listaConsultas);
            escritor.close();
        } catch (IOException ex) {

        }
    }

    public ArrayList<ConsultaDTO> leerListaConsulta() {

        try {
            FileInputStream archivo = new FileInputStream("consultas.txt");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            ArrayList<ConsultaDTO> lista = (ArrayList<ConsultaDTO>) lector.readObject();
            lector.close();
            return lista;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }
}
