package tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {

    // Crear archivo
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El archivo se ha creado correctamente\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Escribir archivo
    public static void escribirArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String contenido = "Contenido a escribir en el archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de escritura");
            salida.close();
            System.out.println("Se ha escrito en el archivo correctamente\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Leer archivo
    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println("Lectura: " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Anexar archivo
    public static void anexarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String contenido = "Anexando información al archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de anexar");
            salida.close();
            System.out.println("Se ha anexado información al archivo correctamente\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
