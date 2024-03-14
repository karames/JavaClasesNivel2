public class Persona {
    // Atributos
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;

    // Constructor
    public Persona(String nombre) {
        idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    // Métodos
    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
    }
}
