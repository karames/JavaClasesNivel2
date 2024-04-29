import datos.AccesoDatos;
import datos.ImplementacionMySql;
import datos.ImplementacionOracle;

/**
 * Ejemplo uso Interfaces
 *
 * @author Nono Karames
 */
public class EjemploInterfaces {
    public static void main(String[] args) throws Exception {
        AccesoDatos datos1 = new ImplementacionOracle();
        ejecutar(datos1, "Listar");

        AccesoDatos datos2 = new ImplementacionMySql();
        ejecutar(datos2, "Insertar");

        System.out.println("Máximo registros: " + AccesoDatos.MAX_REGISTROS);
    }

    private static void ejecutar(AccesoDatos datos, String accion) {
        if ("Listar".equals(accion)) {
            datos.listarRegistros();
        } else if ("Insertar".equals(accion)) {
            datos.insertarRegistros();
        }
    }
}
