package paquete2;

import paquete1.Clase1;

public class Clase4 {
    // Constructor
    public Clase4() {
        // Acceso constructor protegido Clase1: no permitido al no ser una subclase
        // super(1, 2);

        // Acceso constructor package Clase1: no permitido fuera del paquete
        // super(1, 2, 3);

        // Acceso constructor privado Clase1: no permitido
        // super(1, 2, 3, 4);
    }

    // Definición de métodos
    public void pruebaDesdeClase4() {
        /*
         * Sólo se pueden emplear los constructores públicos de Clase1
         * El resto de constructores sólo están restringidos
         * Clase4 no es subclase y está en otro paquete
         */
        System.out.println("\nAcceso constructor Clase1 desde Clase4");
        Clase1 c1 = new Clase1();
        // Clase1 c1 = new Clase1(1);

        System.out.println("\nAcceso atributos Clase1 desde Clase4");
        System.out.println("Atributo público: " + c1.atrPublico);
        System.out.println("Atributo protegido: acceso no permitido (paquete externo y no subclase)");
        // System.out.println("Atributo protegido: " + c1.atrProtegido);
        System.out.println("Atributo package: acceso no permitido desde paquete externo");
        // System.out.println("Atributo package: " + c1.atrPaquete);
        System.out.println("Atributo privado: acceso no permitido");
        // System.out.println("Atributo privado: " + c1.atrPrivado);

        System.out.println("\nAcceso métodos Clase1 desde Clase4");
        System.out.println("Método público: " + c1.metodoPublico());
        System.out.println("Método protegido: acceso no permitido (paquete externo y no subclase)");
        // System.out.println("Método protegido: " + c1.metodoProtegido());
        System.out.println("Método paquete: acceso no permitido desde paquete externo");
        // System.out.println("Método paquete: " + c1.metodoPaquete());
        System.out.println("Método privado: acceso no permitido");
        // System.out.println("Método privado: " + c1.metodoPrivado());
    }
}
