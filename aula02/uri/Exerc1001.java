package uri;

import java.util.Scanner;

/**
 * Exerc1001
 */
public class Exerc1001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B;
        double X;

        A = entrada.nextInt();
        B = entrada.nextInt();

        X = A + B;

        System.out.println("X = " + X);

        // printf - print formatado
        // %d - número inteiro
        // %f - número com decimal
        // .1 - uma casa depois da virgula
        // A + B = X
        // System.out.printf("%d + %d = %.1f\n", A, B, X);

        entrada.close();
    }
}