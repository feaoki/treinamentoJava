package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, soma, positivos;
        double media;
        final int QTDE = 10;

        soma = 0;
        positivos = 0;

        for(int i = 0; i < QTDE; i++){
            System.out.println("Digite o próximo número:");
            numero = in.nextInt();
            soma = soma + numero;
            if( numero >= 0 ){ //se for positivo
                positivos++;    //soma 1 no contador de positivos
            }
        }

        media = (double)soma / QTDE;

        System.out.println("Soma = " + soma);
        System.out.println("A média dos valor é " + media);
        System.out.println("Foram digitados " + positivos + " numeros positivos.");
        System.out.println("Temos " + ( ((double)positivos/QTDE) * 100) + "% de números positivos.");

        in.close();
    }
}