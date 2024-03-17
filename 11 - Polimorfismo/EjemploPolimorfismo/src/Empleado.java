public class Empleado {
    // Atributos
    protected String nombre;
    protected double sueldo;

    // Constructor
    protected Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // Definición métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String obtenerDetalles() {
        return "Método Empleado obtenerDetalles()" + "\n" +
                "Nombre: " + nombre + "\n" +
                "Sueldo: " + sueldo;
    }
}