package paquete1;

public class Clase1 {
    // Atributos
    public int atrPublico = 5;
    protected int atrProtegido = 6;
    int atrPaquete = 7;
    private int atrPrivado = 8;

    // Constructores
    public Clase1() {
        System.out.println("Constructor público Clase1 vacío");
    }

    public Clase1(int i) {
        System.out.println("Constructor público Clase1 con 1 parámetro");
    }

    protected Clase1(int i, int j) {
        System.out.println("Constructor protegido Clase1 con 2 parámetros");
    }

    Clase1(int i, int j, int k) {
        System.out.println("Constructor paquete Clase1 con 3 parámetros");
    }

    private Clase1(int i, int j, int k, int l) {
        System.out.println("Constructor privado Clase1 con 4 parámetros");
    }

    // Definición de métodos
    public String metodoPublico() {
        return "Método público Clase1";
    }

    protected String metodoProtegido() {
        return "Método protegido Clase1";
    }

    String metodoPaquete() {
        return "Método paquete Clase1";
    }

    private String metodoPrivado() {
        return "Método privado Clase1";
    }
}
