package paquete1;

public class Clase2 {
    // Constructor
    public Clase2() {
        System.out.println("Prueba constructores");
        // Constructores public
        new Clase1();
        new Clase1(1);
        // Constructor protected
        new Clase1(1, 2);
        // Constructor default/package
        new Clase1(1, 2, 3);
        // Constructor private
        // new Clase1(1, 2, 3, 4);
        System.out.println("Constructor privado: acceso no permitido");
    }

    // Definición de métodos
    public void pruebaDesdeClase2() {
        System.out.println("Acceso atributos Clase1 desde Clase2");
        Clase1 c1 = new Clase1();
        System.out.println("Atributo publico: " + c1.atrPublico);
        System.out.println("Atributo protegido: " + c1.atrProtegido);
        System.out.println("Atributo paquete: " + c1.atrPaquete);
        // System.out.println("Atributo privado: " + c1.atrPrivado);
        System.out.println("Atributo privado: acceso no permitido");

        System.out.println("\nAcceso métodos Clase1 desde Clase2");
        System.out.println("Método público: " + c1.metodoPublico());
        System.out.println("Método protegido: " + c1.metodoProtegido());
        System.out.println("Método paquete: " + c1.metodoPaquete());
        // System.out.println("Método privado: " + c1.metodoPrivado());
        System.out.println("Método privado: acceso no permitido");
    }
}
