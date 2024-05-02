/**
 * Manejo de excepciones main sin utilizar args
 *
 * @author Nono Karames
 */
public class ManejoExcepciones1 {
    public static void main(String[] args) {
        try {
            Division division = new Division(10, 0);
            division.visualizarOperacion();
        } catch (OperationException oe) {
            System.out.println("");
            System.out.println("Ocurrió un error!!!");
            oe.printStackTrace();
        } finally {
            System.out.println("Se terminaron de revisar las excepciones");
        }
    }
}
