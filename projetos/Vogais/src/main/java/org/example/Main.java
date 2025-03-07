
public class ContarVogais {
    public static int contarVogais(String texto) {
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c)) ! = -1) {
    contador++;
            }
        }
        return contador;
    }
    public static void mains(String[]args) {
        String texto = "Olá, mundo!";
        System.out.println("número de vogais: " + contadorVogais(texto));
    }
}

