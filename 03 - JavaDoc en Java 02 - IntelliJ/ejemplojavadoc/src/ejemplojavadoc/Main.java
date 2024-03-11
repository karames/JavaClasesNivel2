package ejemplojavadoc;

import es.karames.ejemplojavadoc.Aritmetica;

/**
 * Clase principal para probar el concepto de JavaDoc
 * con la clase {@link Aritmetica}
 *
 * @author Nono Karames
 * @version 1.0.0
 */
public class Main {
    /**
     * Método que ejecuta la prueba de la clase Aritmetica
     *
     * @param args Argumentos CLI
     */
    public static void main(String[] args) {
        int resultado = new Aritmetica(3, 2).sumar();
        System.out.println("Resultado: " + resultado);
    }
}