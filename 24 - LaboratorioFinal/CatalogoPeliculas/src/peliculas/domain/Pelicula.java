package peliculas.domain;

public class Pelicula {
    // Definición atributos
    // DUDAR:
    String nombre;

    // Definición constructor
    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    // Definición métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pelicula [nombre=" + nombre + "]";
    }
}
