package Persistencia;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorPersistencia {

    private static GestorPersistencia instancia;

    private GestorPersistencia() {}

    public static synchronized GestorPersistencia getInstance() {
        if (instancia == null) {
            instancia = new GestorPersistencia();
        }
        return instancia;
    }

    private void asegurarRuta(String ruta) {
        File archivo = new File(ruta);
        File carpeta = archivo.getParentFile();
        if (carpeta != null && !carpeta.exists()) {
            boolean creada = carpeta.mkdirs();
            if (creada) {
                System.out.println("Carpeta creada: " + carpeta.getPath());
            }
        }
    }

    public <T extends Serializable> void guardarLista(String ruta, List<T> lista) {
        asegurarRuta(ruta);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends Serializable> List<T> cargarLista(String ruta) {
        File archivo = new File(ruta);
        if (!archivo.exists()) {
            asegurarRuta(ruta); 
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            return (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer datos: " + e.getMessage());
        }
        return null;
    }
}
