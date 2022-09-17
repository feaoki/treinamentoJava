package uri;

import java.util.Scanner;

public class Exerc1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtde;
        double valor, valorTotal;

        entrada.nextInt();
        qtde = entrada.nextInt();
        valor = entrada.nextDouble();

        valorTotal = valor * qtde;

        entrada.nextInt();
        qtde = entrada.nextInt();
        valor = entrada.nextDouble();

        valorTotal = valorTotal + valor * qtde;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        entrada.close();
    }
}