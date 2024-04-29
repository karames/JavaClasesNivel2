package datos;

public interface AccesoDatos {
    // Atributos
    public static final int MAX_REGISTROS = 10;

    // Métodos
    public abstract void insertarRegistros();

    public abstract void listarRegistros();
}
