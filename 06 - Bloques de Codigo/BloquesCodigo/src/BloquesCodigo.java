/**
 * Uso de bloques anónimos estáticos y dinámicos
 *
 * @author Nono Karames
 */
public class BloquesCodigo {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona();
        int i = p1.getIdPersona();
        int totalPersonas = Persona.getContadorPersonas();

        System.out.println("Total personas: " + totalPersonas);
        System.err.println("id 'p1': " + i);
    }
}
