public class Main {
    public static long calcularFatorial(int num) {

        if (num < 0){
            throw new IllegalArgumentException("numero deve ser positivo");
                    } else if (num == 0 || num ==1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 2; i <= num; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
public static void mais(String[]args) {
        int num = 5;
        System.out.println ("fatorial de " + num + " : " + calcularFatorial(num));

        }
    }
