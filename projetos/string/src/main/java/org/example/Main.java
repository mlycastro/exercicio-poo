
public class inverterString {
    public static String inverter(String texto) {
        StringBuilder invertido = new StringBuilder();
        int i;
        for (i = texto.length() - 1; >=0; i--) {
            invertido.append(texto.charAt(i));
        }
        return invertido.toString();
    }
    public static void main(String[] args) {
        String texto = "olá, mundo!";
        System.out.printf("texto original: " + inverter(texto));

        }
    }
