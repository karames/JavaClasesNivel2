package abstracto.clases;

public abstract class FiguraGeometrica {
    // Atributos
    protected String tipoFigura;

    // Constructor
    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    // Definición de métodos
    public String getTipoFigura() {
        return this.tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    // La clase padre no define comportamientos, la clase hija los implementa
    // Sólo firma del método
    public abstract void dibujar();

    @Override
    public String toString() {
        return "FiguraGeometrica [tipoFigura=" + this.tipoFigura + "]";
    }
}
