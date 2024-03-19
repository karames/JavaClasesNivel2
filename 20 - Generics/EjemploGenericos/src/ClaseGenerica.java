public class ClaseGenerica<T> {
    // Atributo genérico
    T atrGenerico;

    public ClaseGenerica(T atrGenerico) {
        this.atrGenerico = atrGenerico;
    }

    public void obtenerTipo() {
        System.err.println("El tipo T es: " + atrGenerico.getClass().getName());
    }
}
