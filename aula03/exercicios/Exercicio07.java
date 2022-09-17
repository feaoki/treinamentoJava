package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor, maior, menor;
        final int QTDE_NUMEROS = 10;

        maior = Integer.MIN_VALUE; // menor valor possível para um inteiro
        menor = Integer.MAX_VALUE; // maior valor possível para um inteiro

        // poderia pegar o primeiro valor digitado para inicializa a variável
        /*
         * System.out.println("Digite o número inteiro:"); 
         * maior = in.nextInt();
         * menor = maior;
         */

        for (int i = 0; i < QTDE_NUMEROS; i++) {
            System.out.println("Digite o valor:");
            valor = in.nextInt();
            if(valor > maior){
                maior = valor;
            }
            if(valor < menor){
                menor = valor;
            }
        }

        System.out.println("O maior valor digitado foi " + maior);
        System.out.println("O menor valor digitado foi " + menor);
        
        in.close();
    }
}