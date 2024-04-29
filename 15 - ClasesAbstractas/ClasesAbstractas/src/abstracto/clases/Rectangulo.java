package abstracto.clases;

public class Rectangulo extends FiguraGeometrica {
    // Constructor
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    // Implementación del comportamiento del método en la subclase
    @Override
    public void dibujar() {
        System.out.println("Figura dibujada: " + this.getClass().getSimpleName());
    }
}
