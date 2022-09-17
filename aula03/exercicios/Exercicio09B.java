package exercicios;

import java.util.Scanner;

public class Exercicio09B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtde, num, pares = 0, impares = 0, soma = 0;

        System.out.println("Quantos números serão digitados? ");
        qtde = in.nextInt();

        for (int i = 0; i < qtde; i++) {
            System.out.println("Informe o número:");
            num = in.nextInt();

            if(num >= 0){
                if( num % 2 == 0 ){
                    pares++;
                    soma = soma + num;
                }else{
                    impares++;
                }
            }
        }

        System.out.println("A média dos pares é " + ((double)soma / pares));
        System.out.println("Temos " + (double)impares/qtde * 100 + "% de ímpares");

        in.close();

    }
}