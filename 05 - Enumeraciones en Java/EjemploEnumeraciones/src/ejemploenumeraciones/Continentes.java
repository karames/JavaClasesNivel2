package ejemploenumeraciones;

public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANÍA(14);

    // Atributo de cada elemento de la enumeración
    private final int numPaises;

    /**
     * Constructor de cada elemento de la enumeración
     *
     * @param numPaises
     */
    private Continentes(int numPaises) {
        this.numPaises = numPaises;
    }

    /**
     * Obtener números de países del continente
     *
     * @return número de países
     */
    public int getPaises() {
        return numPaises;
    }
}
