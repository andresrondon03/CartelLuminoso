import java.util.*;

public class FabricaLetra {

    // Almacen de las letras creadas para poder reutilizarlas
    private static final Map<Character, Letra> pool = new HashMap<>();

    // Método que:
    // - Devuelve una letra desde el pool
    // - Si no existe la letra, la crea y la agrega antes de devolverla
    public static Letra get(char c) {
        pool.putIfAbsent(c, new Letra(c));
        return pool.get(c);
    }

    // Método que guarda y devuelve la cantidad de objetos unico Letra creados
    public static int getTotalLetrasCreadas() {
        return pool.size();
    }

}
