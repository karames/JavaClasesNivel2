public class Persona {
    // Atributos
    private final int idPersona;
    private static int contadorPersonas;

    // Bloque anónimo estático de inicialización
    static {
        System.out.println("Ejecuta el bloque anónimo estático");
        contadorPersonas = 10;
    }

    // Bloque anónimo de inicialización atributos de la clase
    // El bloque se copia a cada constructor de la clase
    {
        System.out.println("Ejecuta el bloque anónimo");
        idPersona = ++contadorPersonas;
    }

    // Constructor
    public Persona() {
        System.out.println("Ejecuta el constructor");
    }

    // Métodos
    public int getIdPersona() {
        return idPersona;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + "]";
    }
}
