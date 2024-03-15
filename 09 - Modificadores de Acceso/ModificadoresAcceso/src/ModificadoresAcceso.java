import paquete1.Clase2;
import paquete2.Clase3;
import paquete2.Clase4;

/**
 * Uso modificadores de acceso
 *
 * @author Nono Karames
 */
public class ModificadoresAcceso {
    public static void main(String[] args) throws Exception {
        System.out.println("*** Acceso desde Clase2 a Clase1 (mismo paquete) ***");
        new Clase2().pruebaDesdeClase2();

        System.out.println("\n*** Acceso desde Clase3 a Clase1 (distinto paquete, es subclase) ***");
        new Clase3().pruebaDesdeClase3();

        System.out.println("\n*** Acceso desde Clase4 a Clase1 (distinto paquete, NO es subclase) ***");
        new Clase4().pruebaDesdeClase4();
    }
}
