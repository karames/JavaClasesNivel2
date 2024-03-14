package paquete1;

public class Clase1 {
    // Atributos
    public int atrPublico = 5;
    protected int atrProtegido = 6;
    int atrPaquete = 7;
    private int atrPrivado = 8;

    // Constructores
    public Clase1() {
        System.out.println("Constructor público vacío");
    }

    public Clase1(int i) {
        System.out.println("Constructor público con 1 parámetro");
    }

    protected Clase1(int i, int j) {
        System.out.println("Constructor protegido");
    }

    Clase1(int i, int j, int k) {
        System.out.println("Constructor paquete");
    }

    private Clase1(int i, int j, int k, int l) {
        System.out.println("Constructor privado");
    }

    // Definición de métodos
    public String metodoPublico() {
        return "Método publico";
    }

    protected String metodoProtegido() {
        return "Método protegido";
    }

    String metodoPaquete() {
        return "Método paquete";
    }

    private String metodoPrivado() {
        return "Método privado";
    }
}
