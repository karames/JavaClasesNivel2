package ejemploenumeraciones;

public class EjemploEnumeraciones {
    public static void main(String[] args) throws Exception {
        // Utilizar enumeración Dias
        System.out.println("Valor 1: " + Dias.LUNES);

        // Test del día utilizado
        indicarDia(Dias.VIERNES);

        // Utilizar enumeración Continentes
        System.out.println("Continente 4: " + Continentes.AMERICA);
        System.out.println("Número de países en " + Continentes.AMERICA + ": "
                + Continentes.AMERICA.getPaises());

        // Test del número de países por continente
        System.out.println("");
        indicarPaises(Continentes.AFRICA);

        // Imprimir continentes
        System.out.println("");
        imprimirContinentes();
    }

    public static void indicarDia(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Día de la semana 1º");
                break;
            case MARTES:
                System.out.println("Día de la semana 2º");
                break;
            case MIÉRCOLES:
                System.out.println("Día de la semana 3º");
                break;
            case JUEVES:
                System.out.println("Día de la semana 4º");
                break;
            case VIERNES:
                System.out.println("Día de la semana 5º");
                break;
            case SÁBADO:
                System.out.println("Día de la semana 6º");
                break;
            case DOMINGO:
                System.out.println("Día de la semana 7º");
                break;
            default:
                System.out.println("Día de la semana erróneo");
        }
    }

    public static void indicarPaises(Continentes continentes) {
        switch (continentes) {
            case AFRICA:
                System.out.println("Número de países en " + continentes + ": "
                        + continentes.getPaises());
                break;
            case EUROPA:
                System.out.println("Número de países en " + continentes + ": "
                        + continentes.getPaises());
                break;
            case ASIA:
                System.out.println("Número de países en " + continentes + ": "
                        + continentes.getPaises());
                break;
            case AMERICA:
                System.out.println("Número de países en " + continentes + ": "
                        + continentes.getPaises());
                break;
            case OCEANÍA:
                System.out.println("Número de países en " + continentes + ": "
                        + continentes.getPaises());
                break;
            default:
                System.out.println("País erróneo");
        }
    }

    public static void imprimirContinentes() {
        for (Continentes item : Continentes.values()) {
            System.out.println(item + " contiene " + item.getPaises() + " países");
        }
    }
}
