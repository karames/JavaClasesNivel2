import java.util.Scanner;

/**
 * Ejemplo uso entrada y salida - Calculadora
 *
 * @author Nono Karames
 */
public class EntradaDatosCalculadora {
    public static void main(String[] args) throws Exception {
        int a, b, resultado;

        System.out.println("");
        System.out.print("Introduce el valor 1: ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();

        System.out.print("Introduce el valor 2: ");
        b = scan.nextInt();
        resultado = Operaciones.sumar(a, b);

        System.out.println("El resultado de la suma es: " + resultado);
        scan.close();
    }

}
