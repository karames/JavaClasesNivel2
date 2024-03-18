public class Escritor extends Empleado {
    // Atributos
    private final TipoEscritura tipoEscritura;

    // Constructor
    protected Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    // Definición de métodos
    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    public String getTipoDeEscrituraEnTexto() {
        return tipoEscritura.getDescripcion();
    }
}
