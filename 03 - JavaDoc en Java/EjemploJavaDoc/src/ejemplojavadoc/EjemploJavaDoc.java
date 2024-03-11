package ejemplojavadoc;

import karames.es.ejemplojavadoc.Aritmetica;

/**
 * Clase principal para probar el concepto de JavaDoc
 * con la clase {@link Aritmetica}
 *
 * @author Nono Karames
 * @version 1.0.0
 */
public class EjemploJavaDoc {
    /**
     * Método que ejecuta la prueba de la clase Aritmetica
     *
     * @param args Argumentos CLI
     * @throws Exception Esta excepción se devuelve cuando se produce un error
     */
    public static void main(String[] args) throws Exception {
        int resultado = new Aritmetica(3, 2).sumar();
        System.out.println("Resultado: " + resultado);
    }
}
