/**
 * Ejemplo uso Clase Object
 * Sobreescritura toString(), equals(), hasCode()
 *
 * @author Nono Karames
 */
public class ClaseObject {

    public static void main(String[] args) throws Exception {
        Empleado empleado1 = new Empleado("Juan", 10000);
        Empleado empleado2 = new Empleado("Juan", 10000);
        // Empleado empleado2 = empleado1;
        compararObjetos(empleado1, empleado2);
    }

    private static void compararObjetos(Empleado empleado1, Empleado empleado2) {
        System.out.println("Contenido objeto 1: " + empleado1);
        System.out.println("Contenido objeto 2: " + empleado2);

        // Revisión por referencia
        if (empleado1 == empleado2) {
            System.out.println("Los objetos tienen la misma dirección de memoria");
        } else {
            System.out.println("Los objetos NO tienen la misma dirección de memoria");
        }

        // Revisión por el método equals
        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales, tienen el mismo contenido");
        } else {
            System.out.println("Los objetos NO son iguales, NO tienen el mismo contenido");
        }

        // Revisión por el método hasCode
        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("Los objetos tienen el mismo código hash: " + empleado1.hashCode());
        } else {
            System.out.println("Los objetos NO tienen el mismo código hash");
            System.out.println("Código hash objeto 1: " + empleado1.hashCode());
            System.out.println("Código hash objeto 2: " + empleado2.hashCode());
        }
    }

}
