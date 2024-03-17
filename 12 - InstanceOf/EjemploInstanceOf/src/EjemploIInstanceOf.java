/**
 * Ejemplo de uso operador instanceof
 *
 * @author Nono Karames
 */
public class EjemploIInstanceOf {
    public static void main(String[] args) throws Exception {
        FiguraGeometrica figura;
        figura = new Elipse();
        figura.dibujar();

        System.out.print("Tipo específico: ");
        determinarTipo(figura);
        System.out.println("Todos sus tipos: ");
        determinarTodosLosTipos(figura);
    }

    // Determinar el tipo específico de instancia
    private static void determinarTipo(FiguraGeometrica figura) {
        if (figura instanceof Elipse) {
            System.out.println("Elipse");
        } else if (figura instanceof Circulo) {
            System.out.println("Circulo");
        } else if (figura instanceof Rectangulo) {
            System.out.println("Rectangulo");
        } else if (figura instanceof Triangulo) {
            System.out.println("Triangulo");
        } else if (figura instanceof FiguraGeometrica) {
            System.out.println("FiguraGeometrica");
        } else if (figura instanceof Object) {
            System.out.println("Object");
        } else {
            System.out.println("No se encontró el tipo");
        }
    }

    // Determinar todos los tipos de la instancia (promoción de jerarquías)
    private static void determinarTodosLosTipos(FiguraGeometrica figura) {
        if (figura instanceof Elipse) {
            System.out.println("Elipse");
        }
        if (figura instanceof Circulo) {
            System.out.println("Circulo");
        }
        if (figura instanceof Rectangulo) {
            System.out.println("Rectangulo");
        }
        if (figura instanceof Triangulo) {
            System.out.println("Triangulo");
        }
        if (figura instanceof FiguraGeometrica) {
            System.out.println("FiguraGeometrica");
        }
        if (figura instanceof Object) {
            System.out.println("Object");
        } else {
            System.out.println("No se encontró el tipo");
        }
    }
}
