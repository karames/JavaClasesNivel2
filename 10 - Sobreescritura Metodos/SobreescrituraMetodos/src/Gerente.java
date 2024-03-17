public class Gerente extends Empleado {
    // Atributos
    protected String departamento;

    // Constructor
    protected Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    // Métodos
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + "\n" +
                "Departamento: " + departamento;
    }
}
