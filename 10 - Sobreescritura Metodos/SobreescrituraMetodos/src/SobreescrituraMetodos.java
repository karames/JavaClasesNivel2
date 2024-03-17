/**
 * Ejemplo sobreescritura de métodos
 *
 * @author Nono Karames
 */
public class SobreescrituraMetodos {
    public static void main(String[] args) throws Exception {
        System.out.println("Empleado");
        Empleado empleado = new Empleado("Juan", 1000);
        System.out.println(empleado.obtenerDetalles());

        System.out.println("\nGerente");
        Gerente gerente = new Gerente("Karla", 2000, "Informática");
        System.out.println(gerente.obtenerDetalles());
    }
}
