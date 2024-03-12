public class Division {
    // Atributos
    private int numerador;
    private int denominador;

    /**
     * Constructor
     *
     * @param numerador   int
     * @param denominador int
     */
    public Division(int numerador, int denominador) throws OperationException {
        if (denominador == 0) {
            // throw new IllegalArgumentException("Denominador igual a cero");
            throw new OperationException("Denominador igual a cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void visualizarOperacion() {
        System.out.println("El resultado de la división es: " + numerador / denominador);
    }
}
