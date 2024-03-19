import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Ejemplo uso colecciones
 *
 * @author Nono Karames
 */
public class EjemploColecciones {
    public static void main(String[] args) throws Exception {
        // Set
        System.out.println("Interface Set");
        Set<String> miSet = new HashSet<>();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("400");
        // Elemento repetido -> lo ignora
        miSet.add("400");
        imprimir(miSet);

        // List
        System.out.println("Interface List");
        List<String> miLista = new ArrayList<>();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        // Elemento repetido
        miLista.add("4");
        imprimir(miLista);

        // Map
        System.out.println("Interface Map");
        Map<String, String> miMapa = new HashMap<>();
        // Llave, valor
        miMapa.put("1", "Juan");
        miMapa.put("2", "Carlos");
        miMapa.put("3", "Rocío");
        miMapa.put("4", "Esperanza");
        // Imprimir llaves
        imprimir(miMapa.keySet());
        // Imprimir valores
        imprimir(miMapa.values());
    }

    private static void imprimir(Collection<String> coleccion) {
        for (Object elemento : coleccion) {
            System.out.print(elemento + " ");
        }
        System.out.println("");
    }
}
