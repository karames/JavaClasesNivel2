/**
 * Uso de for extendido (foreach)
 *
 * @author Nono Karames
 */
public class ForEach {
    public static void main(String[] args) throws Exception {
        // Crear arreglo de edades (enteros)
        int[] edades = { 15, 20, 41, 50 };

        // Usar for extendido (foreach)
        for (int edad : edades) {
            System.out.println("Edad: " + edad);
        }

        System.out.println("");
        // Crear arreglo de personas (objetos)
        Persona[] personas = { new Persona("Nono"), new Persona("Cristina") };

        // Usar for extendido (foreach)
        for (Persona persona : personas) {
            int id = persona.getIdPersona();
            String nombre = persona.getNombre();
            System.out.println("Persona " + id + ": " + nombre);
        }
    }
}
