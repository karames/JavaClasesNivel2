package datos;

public class ImplementacionOracle implements AccesoDatos {

    @Override
    public void insertarRegistros() {
        System.out.println("Insertar registros desde Oracle");
    }

    @Override
    public void listarRegistros() {
        System.out.println("Listar registros desde Oracle");
    }

}
