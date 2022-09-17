package exercicios;

import java.util.Scanner;

public class Exercicio09A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 1, qtdeNumeros, qtdePares, qtdeImpares;
        double mediaPares;

        qtdeNumeros = 0;
        qtdePares = 0;
        qtdeImpares = 0;
        mediaPares = 0;

        while (numero != 0) {
            System.out.println("Digite um valor positivo (0 = fim)");
            numero = in.nextInt();
            
            if (numero != 0) { //zero é ponto de parada e não conta
                qtdeNumeros++;
                if (numero % 2 == 0) {
                    mediaPares += numero;
                    qtdePares++;
                } else {
                    qtdeImpares++;
                }
            }
        }

        System.out.printf("Média pares: %.2f\n", ((double) mediaPares / qtdePares));
        System.out.printf("Porcentagem de impares: %.2f%%\n", ((double) qtdeImpares / qtdeNumeros) * 100);

        in.close();
    }
}
