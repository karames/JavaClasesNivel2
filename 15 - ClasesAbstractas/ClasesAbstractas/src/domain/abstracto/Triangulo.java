package domain.abstracto;

public class Triangulo extends FiguraGeometrica {
    // Constructor
    public Triangulo(String tipoFigura) {
        super(tipoFigura);
    }

    // Implementación del comportamiento del método en la subclase
    @Override
    public void dibujar() {
        System.out.println("Figura dibujada: " + this.getClass().getSimpleName());
    }
}
