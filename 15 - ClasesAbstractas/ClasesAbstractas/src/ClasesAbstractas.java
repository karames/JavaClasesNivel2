import domain.abstracto.FiguraGeometrica;
import domain.abstracto.Rectangulo;
import domain.abstracto.Triangulo;
import domain.abstracto.Circulo;

/**
 * Ejemplo de uso clases abstractas
 *
 * @author Nono Karames
 */
public class ClasesAbstractas {
    public static void main(String[] args) throws Exception {
        FiguraGeometrica rectangulo = new Rectangulo("Rectángulo");
        FiguraGeometrica triangulo = new Triangulo("Triángulo");
        FiguraGeometrica circulo = new Circulo("Círculo");

        System.out.println(rectangulo);
        rectangulo.dibujar();

        System.out.println("");
        System.out.println(triangulo);
        triangulo.dibujar();

        System.out.println("");
        System.out.println(circulo);
        circulo.dibujar();
    }
}
