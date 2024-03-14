/**
 * Uso Autoboxing / Unboxing
 *
 * @author Nono Karames
 */
public class AutoboxingUnboxing {
    public static void main(String[] args) throws Exception {
        // Autoboxing (conversión de tipos primitivos a tipo Object)
        Integer enteroObj = 10;
        Float flotanteObj = 12.5f;
        Double dobleObj = 40.1d;
        System.out.println("Autoboxing");
        System.out.println("Entero obj: " + enteroObj.intValue());
        System.out.println("Flotante obj: " + flotanteObj.floatValue());
        System.out.println("Doble obj: " + dobleObj.doubleValue());

        // Autounboxing (conversión de objetos a tipos primitivos)
        int entero = enteroObj;
        float flotante = flotanteObj;
        double doble = dobleObj;
        System.out.println("\nAutounboxing");
        System.out.println("Entero: " + entero);
        System.out.println("Flotante: " + flotante);
        System.out.println("Doble: " + doble);
    }
}
