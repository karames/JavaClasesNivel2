import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ejemplo uso entrada de datos
 *
 * @author Nono Karames
 */
public class EjemploEntradaDatos {
    public static void main(String[] args) throws Exception {
        String captura;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bInput = new BufferedReader(input);
        try {
            System.out.println("");
            System.out.print("Introduce un dato: ");
            captura = bInput.readLine();
            while (captura != null) {
                System.out.println("Dato introducido: " + captura);
                System.out.print("Introduce un dato: ");
                captura = bInput.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
