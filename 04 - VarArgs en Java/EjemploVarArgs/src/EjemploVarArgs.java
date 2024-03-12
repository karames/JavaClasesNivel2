/**
 * Ejemplo uso VarArgs
 *
 * @author Nono Karames
 * @version 1.0
 */
public class EjemploVarArgs {
    /**
     * Método principal
     *
     * @param args Descripción
     * @throws Exception Descripción
     */
    public static void main(String[] args) throws Exception {
        imprimirNumeros(15, 20, 3, 61, 75, 18, 10);

        System.out.println("");
        imprimirNumerosForEach(15, 20, 3, 61, 75, 18, 10);

        System.out.println("");
        variosParametros("Juan", true, 15, 20, 14);
    }

    /**
     * Imprimir arreglo con bucle for
     *
     * @param numeros Descripción
     */
    public static void imprimirNumeros(int... numeros) {
        int elemento;
        for (int i = 0; i < numeros.length; i++) {
            elemento = numeros[i];
            System.out.println("Elemento " + i + ": " + elemento);
        }
    }

    /**
     * Imprimir arreglo con bucle foreach
     *
     * @param numeros Descripción
     */
    public static void imprimirNumerosForEach(int... numeros) {
        for (int i : numeros) {
            System.out.println("El número es: " + i);
        }
    }

    /**
     * VarArgs con varios argumentos
     *
     * @param nombre  Descripción
     * @param valido  Descripción
     * @param numeros Descripción
     */
    public static void variosParametros(String nombre, boolean valido, int... numeros) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Válido: " + valido);
        for (int i : numeros) {
            System.out.println("El número es: " + i);
        }
    }
}
