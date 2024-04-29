package datos;

public class ImplementacionMySql implements AccesoDatos {

    @Override
    public void insertarRegistros() {
        System.out.println("Insertar registros desde MySql");
    }

    @Override
    public void listarRegistros() {
        System.out.println("Listar registros desde MySql");
    }

}
