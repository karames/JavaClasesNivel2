/**
 * Ejemplo casting de objetos (conversión)
 *
 * @author Nono Karames
 */
public class CastingObjetos {
    public static void main(String[] args) throws Exception {
        // Upcasting: asignamos una referencia de un objeto de menos jerarquía
        // Es automático, no necesitamos de una notación especial
        Empleado empleado1 = new Escritor("Nono", 15000, TipoEscritura.CLÁSICO);
        // No es posible acceder a los métodos específicos de la clase Escritor
        // empleado1.getTipoDeEscrituraEnTexto();
        // Acceso a método genérico
        imprimirDetalles(empleado1);

        // Upcasting
        Empleado empleado2 = new Gerente("Laura", 18000, "Informática");
        // No es posible acceder a los métodos específicos de la clase Gerente
        // empleado2.getDepartamento();
        // Acceso a método genérico
        imprimirDetalles(empleado2);
    }

    // Método genérico detalles de la jerarquía Empleado
    public static void imprimirDetalles(Empleado empleado) {
        String resultado = null;

        // Acceso a Método genérico: polimorfismo
        System.out.println("\nDetalle Empleado\n" + empleado.obtenerDetalles());

        // Métodos específicos: downcasting
        if (empleado instanceof Escritor) {
            // Escritor escritor = (Escritor) empleado;
            // resultado = escritor.getTipoDeEscrituraEnTexto();
            resultado = ((Escritor) empleado).getTipoDeEscrituraEnTexto();
            System.out.println("Resultado tipo escritura: " + resultado);
        } else if (empleado instanceof Gerente) {
            resultado = ((Gerente) empleado).getDepartamento();
            System.out.println("Resultado departamento: " + resultado);
        }
    }
}
