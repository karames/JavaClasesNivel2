import java.io.Serializable;

/**
 * JavaBean: Modelo de componentes desarrollo por Sun Microsystems
 * Requisitos:
 * Implementa Serializable
 * Las propiedades tienen que ser private
 * Constructor público vacío
 * Por cada propiedad su correspondiente set y/o get (si es necesario)
 * Serializable:
 * Permite que los objetos sean serializables en disco o red
 * No tiene ningún método
 */
public class PersonaBean implements Serializable {
    // Atributos: requisito private
    private String nombre;
    private int edad;

    // Constructor público vacío: requisito obligatorio
    public PersonaBean() {
    }

    // Constructor personalizado: no requerido
    public PersonaBean(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Por cada propiedad un get y/o set (cuando sea necesario)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
