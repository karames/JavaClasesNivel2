import domain.datos.AccesoDatos;
import domain.datos.ImplementacionMySql;
import domain.datos.ImplementacionOracle;

/**
 * Ejemplo uso Interfaces
 *
 * @author Nono Karames
 */
public class EjemploInterfaces {
    public static void main(String[] args) throws Exception {
        AccesoDatos datos = new ImplementacionOracle();
        ejecutar(datos, "listar");

        AccesoDatos datos2 = new ImplementacionMySql();
        ejecutar(datos2, "insertar");

        System.out.println("Máximo registros: " + AccesoDatos.MAX_REGISTROS);
    }

    public static void ejecutar(AccesoDatos datos, String accion) {
        if ("listar".equals(accion)) {
            datos.listarRegistros();
        } else if ("insertar".equals(accion)) {
            datos.insertarRegistros();
        }
    }
}
