package peliculas.excepciones;

public class AccesoDatosEx extends Exception {
    // Definición atributos
    // REVISAR: ¿private, public o default?
    String mensaje;

    // Definición constructor
    public AccesoDatosEx(String mensaje) {
        this.mensaje = mensaje;
    }
}
