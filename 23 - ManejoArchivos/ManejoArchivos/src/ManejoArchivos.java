import tools.Archivo;

/**
 * Ejemplo uso manejo de archivos
 *
 * @author Nono Karames
 */
public class ManejoArchivos {

    private static final String NOMBRE_ARCHIVO = "D:\\JavaClasesNivel2\\23 - ManejoArchivos\\ManejoArchivos\\pruebaJava.txt";

    public static void main(String[] args) throws Exception {

        // Crear un archivo
        Archivo.crearArchivo(NOMBRE_ARCHIVO);

        // Escribir a un archivo
        Archivo.escribirArchivo(NOMBRE_ARCHIVO);

        // Leer de un archivo
        Archivo.leerArchivo(NOMBRE_ARCHIVO);

        // Anexar información a un archivo
        Archivo.anexarArchivo(NOMBRE_ARCHIVO);

        // Leer de un archivo
        Archivo.leerArchivo(NOMBRE_ARCHIVO);
    }
}
