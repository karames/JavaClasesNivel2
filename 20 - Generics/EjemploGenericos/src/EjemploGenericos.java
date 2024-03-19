/**
 * Ejemplo uso tipos genéricos
 * No se pueden aplicar a tipos primitivos
 *
 * @author Nono Karames
 */
public class EjemploGenericos {
    public static void main(String[] args) throws Exception {
        // Crear instancia de ClaseGenerica para String
        ClaseGenerica<String> objetoString = new ClaseGenerica<String>("Nono");
        objetoString.obtenerTipo();

        // Crear instancia de ClaseGenerica para Integer
        ClaseGenerica<Integer> objetoInteger = new ClaseGenerica<Integer>(15);
        objetoInteger.obtenerTipo();

        // Crear instancia de ClaseGenerica para Double
        ClaseGenerica<Double> objetoDouble = new ClaseGenerica<Double>(15.26);
        objetoDouble.obtenerTipo();
    }
}
