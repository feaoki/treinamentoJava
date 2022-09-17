package exercicios;

import java.util.Scanner;

/*
    Escreva um método em Java que encontre o menor entre três números inteiros fornecidos como parâmetros.
*/

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, menor;

        System.out.println("Digite 3 números inteiros:");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();

        menor = encontraMenor(n1, n2, n3);

        System.out.println("O menor valor é " + menor);

        teclado.close();
    }

    public static int encontraMenor(int a, int b, int c) {
        int menor;

        if (a <= b && a <= c) { // a é menor que o b e o c?
            menor = a;
        } else {
            if (b <= a && b <= c) {
                menor = b;
            } else {
                menor = c;
            }
        }
        return menor;
    }

    public static int encontraMenor2(int a, int b, int c) {
        int menor = a;

        if (b < menor) { 
            menor = b;
        }

        if (c < menor) { 
            menor = c;
        }         

        return menor;
    }
}