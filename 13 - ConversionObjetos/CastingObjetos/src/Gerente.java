public class Gerente extends Empleado {
    // Atributos
    private String departamento;

    // Constructor
    protected Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    // Definición de métodos
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
