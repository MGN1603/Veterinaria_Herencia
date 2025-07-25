package Persistencia;

import DTOs.VacunaDTO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializadoraVacuna {

    private ArrayList<VacunaDTO> listaVacunas;

    public SerializadoraVacuna() {
        this.listaVacunas = leerListaVacuna();
    }

    public ArrayList<VacunaDTO> getListaVacuna() {
        return listaVacunas;
    }

    public void escribirVacuna() {
        try {
            FileOutputStream archivo = new FileOutputStream("vacunas.txt");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(listaVacunas);
            escritor.close();
        } catch (IOException ex) {

        }
    }

    public ArrayList<VacunaDTO> leerListaVacuna() {

        try {
            FileInputStream archivo = new FileInputStream("vacunas.txt");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            ArrayList<VacunaDTO> lista = (ArrayList<VacunaDTO>) lector.readObject();
            lector.close();
            return lista;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }

}
