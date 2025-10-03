public class Main {

    public static void main(String[] args) {
        // Se agrega la frase a revisar
        String texto = "HELLO WORLD";

        System.out.println("Frase que se va a revisar: " + texto);
        System.out.println();

        // Ciclo que recorre cada caracter en la frase
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            Letra l = FabricaLetra.get(c); // Obtiene (o reutiliza) el objeto Letra desde la fabrica
            l.display(i); // Muestra la letra junto asu posicion (dato extrinseco)
        }
        System.out.println();
        
        // Se muestra en pantalla la cantidad de objetos unicos creados en memoria
        System.out.println("Total de objetos Letra creados: " + FabricaLetra.getTotalLetrasCreadas());
    }
}
