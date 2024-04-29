import beans.PersonaBean;

/**
 * Ejemplo uso JavaBeans
 * Definición de clases con unos requisitos concretos
 *
 * @author Nono Karames
 */
public class EjemploJavaBeans {
    public static void main(String[] args) throws Exception {
        PersonaBean personaBean = new PersonaBean();
        personaBean.setNombre("Juan");
        personaBean.setEdad(29);

        System.out.println("");
        System.out.println("Nombre: " + personaBean.getNombre());
        System.out.println("Edad: " + personaBean.getEdad());
    }
}
