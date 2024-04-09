package main;

import java.util.Scanner;
import peliculas.negocio.CatalogoPeliculas;
import peliculas.negocio.*;

/**
 * Catálogo Películas
 *
 * @author Nono Karames
 * @version 1.0.0
 */
public class CatalogoPeliculasTest {

    private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "c:\\catalogoPeliculas\\peliculas.txt";
    private static final CatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();

    public static void main(String[] args) throws Exception {

        // Mientras la opción elegida sea 0, preguntamos al usuario
        while (opcion != 0) {
            try {
                // Presentación del menú y captura de la opción elegida
                System.out.println("Elige opción:\n1.- Iniciar catálogo de películas"
                        + "\n2.- Agregar película\n"
                        + "3.- Listar Películas\n"
                        + "4.- Buscar Película\n"
                        + "0.- Salir");
                opcion = Integer.parseInt(scanner.nextLine());

                // Acciones en función de la opción elegida
                switch (opcion) {
                    case 1:
                        // 1. Creamos el objeto que administra el catálogo de películas
                        // La creación del archivo es opcional, de todas maneras se creará
                        // al escribir por primera vez en el archivo
                        catalogoPeliculas.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        // 2. Agregar información al archivo
                        System.out.println("Introduce el nombre de una película a agregar:");
                        String nombre = scanner.nextLine();
                        catalogoPeliculas.agregarPelicula(nombre, nombreArchivo);
                        break;
                    case 3:
                        // 3. Listar catálogo completo
                        catalogoPeliculas.listarPeliculas(nombreArchivo);
                        break;
                    case 4:
                        // 4. Buscar película
                        System.out.println("Introduce el nombre de la película a buscar:");
                        String buscar = scanner.nextLine();
                        catalogoPeliculas.buscarPelicula(nombreArchivo, buscar);
                        break;
                    case 0:
                        System.out.println("¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opción no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("¡Error!");
            }
        }
    }
}
