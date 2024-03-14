package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1 {
    // Constructor
    public Clase3() {
        // Acceso constructor público Clase1: permitido
        // super(); super(1)

        // Acceso constructor protegido Clase1: permitido al ser una subclase
        super(1, 2);

        // Acceso constructor package Clase1: no permitido fuera del paquete
        // super(1, 2, 3);

        // Acceso constructor privado Clase1: no permitido
        // super(1, 2, 3, 4);
    }

    // Definición de métodos
    public void pruebaDesdeClase3() {
        // Sólo se puede emplear los constructores públicos de Clase1
        // ?? Constructor protected: no está definido en

        System.out.println("Acceso constructores Clase1 desde Clase3");
        new Clase1();
        new Clase1(7);

        System.out.println("\nAcceso atributos Clase1 desde Clase3");
        Clase1 c1 = new Clase1();
        System.out.println("Atributo público: " + c1.atrPublico);
        System.out.println("Atributo heredado: " + atrPublico);
        System.out.println("Atributo protegido (heredado): " + atrProtegido);
        // System.out.println("Atributo package: " + c1.atrPaquete);
        System.out.println("Atributo package: acceso no permitido desde paquete externo");
        // System.out.println("Atributo privado: " + c1.atrPrivado);
        System.out.println("Atributo privado: acceso no permitido");

    }

}
