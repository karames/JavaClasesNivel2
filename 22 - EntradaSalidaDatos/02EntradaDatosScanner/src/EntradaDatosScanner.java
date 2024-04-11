import java.util.Scanner;

/**
 * Ejemplo uso entrada de datos clase Scanner
 *
 * @author Nono Karames
 */
public class EntradaDatosScanner {
    public static void main(String[] args) throws Exception {
        String captura = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.print("Introduce un dato: ");
        captura = scan.nextLine();
        while (captura != null) {
            System.out.println("Dato introducido: " + captura);
            System.out.println("");
            System.out.print("Introduce un dato: ");
            captura = scan.nextLine();
        }
        scan.close();
    }
}
