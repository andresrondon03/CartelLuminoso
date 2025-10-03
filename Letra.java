public class Letra {

    private final char value; // Valor intrínseco (compartido entre objetos iguales)

    public Letra(char v) {
        this.value = v;
    }

    public void display(int posicion) { // Muestra la letra junto a su posición (dato extrínseco)
        System.out.println("Letra '" + value + "' en la posición " + posicion);
    }
}
