package beans;

import java.io.Serializable;

/**
 * JavaBean: Modelo de componentes desarrollo por Sun Microsystems
 * Requisitos:
 * Las propiedades tienen que ser private
 * Constructor público vacío obligatorio (puede tener otros)
 * Por cada propiedad su correspondiente set, get, is (si es necesario)
 * Implementa java.io.Serializable:
 * Permite que los objetos sean serializables (convertirlo en 1 y 0)
 * No tiene ningún método (no es obligatorio implementar nada)
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
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
