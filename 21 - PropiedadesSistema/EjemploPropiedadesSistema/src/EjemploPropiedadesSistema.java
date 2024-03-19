import java.util.Enumeration;
import java.util.Properties;

/**
 * Propiedades del sistema
 *
 * @author Nono Karames
 */
public class EjemploPropiedadesSistema {
    public static void main(String[] args) throws Exception {
        Properties propiedades = System.getProperties();
        Enumeration nombrePropiedades = propiedades.propertyNames();

        while (nombrePropiedades.hasMoreElements()) {
            String nombrePropiedad = (String) nombrePropiedades.nextElement();
            String valorPropiedad = propiedades.getProperty(nombrePropiedad);
            System.out.println("Llave " + nombrePropiedad + ": " + valorPropiedad);
        }
    }
}
