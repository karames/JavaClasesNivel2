/**
 * Ejemplo de uso polimorfismo
 *
 * @author Nono Karames
 */
public class EjemploPolimorfismo {
    public static void main(String[] args) throws Exception {
        Empleado empleado = new Empleado("Juan", 1000);
        imprimirDetalles(empleado);

        Gerente gerente = new Gerente("Karla", 2000, "Informática");
        imprimirDetalles(gerente);
    }

    /*
     * El tipo que recibe el método es del tipo padre (Empleado)
     * Sin embargo, en el momento de ejecutar el método,
     * se ejecuta el del hijo (Gerente)
     * Polimorfismo, múltiples formas pero en tiempo de ejecución
     */
    public static void imprimirDetalles(Empleado empleado) {
        System.out.println(empleado.obtenerDetalles());
    }
}
