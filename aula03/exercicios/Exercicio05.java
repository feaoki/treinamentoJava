package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor, soma = 0, cont;

        valor = 1;
        cont = 1;
        while (valor != 0) {
            System.out.println("Digite o " + cont + "º número inteiro ( 0 = fim ):");
            valor = in.nextInt();
            soma += valor;
            cont++;
        }

        System.out.println("Soma = " + soma);

        in.close();
    }
}