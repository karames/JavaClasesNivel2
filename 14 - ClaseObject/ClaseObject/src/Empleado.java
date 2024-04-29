public class Empleado {
    // Atributos
    private String nombre;
    private double sueldo;

    // Constructor
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    // Definición de métodos
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

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        // if (this == obj)
        // return true;
        // if (getClass() != obj.getClass())
        // return false;

        if (obj instanceof Empleado) {
            Empleado emp = (Empleado) obj;
            if (nombre.equals(emp.nombre) && Double.valueOf(sueldo).equals(emp.sueldo)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

        // Empleado other = (Empleado) obj;
        // if (nombre == null) {
        // if (other.nombre != null)
        // return false;
        // } else if (!nombre.equals(other.nombre))
        // return false;
        // if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(other.sueldo))
        // return false;
        // return true;
    }

    @Override
    public int hashCode() {

        int hash = 7;
        hash = 31 * hash + this.nombre.hashCode();
        hash = 31 * hash + Double.valueOf(this.sueldo).hashCode();
        return hash;

        // final int prime = 31;
        // int result = 1;
        // result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        // long temp;
        // temp = Double.doubleToLongBits(sueldo);
        // result = prime * result + (int) (temp ^ (temp >>> 32));
        // return result;
    }
}
