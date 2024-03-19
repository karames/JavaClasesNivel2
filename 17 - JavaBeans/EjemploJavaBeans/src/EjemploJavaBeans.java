/**
 * Ejemplo uso JavaBeans
 * Definición de clases con unos requisitos concretos
 *
 * @author Nono Karames
 */
public class EjemploJavaBeans {
    public static void main(String[] args) throws Exception {
        PersonaBean persona = new PersonaBean();
        persona.setNombre("Juan");
        persona.setEdad(29);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
