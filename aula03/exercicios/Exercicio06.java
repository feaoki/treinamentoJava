package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, soma = 0;

        valor = 1;
        while( valor != 0 ){
            System.out.println("Digite o número (0=fim): ");
            valor = teclado.nextInt();

            if(valor > 0){
                soma = soma + valor;
            }
        }

        System.out.println("A soma dos valores é " + soma);

        teclado.close();
    }
}