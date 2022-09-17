package uri;

import java.util.Scanner;

public class Exerc1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, n100, n50, n20, n10, n5, n2, n1;
        int valorInicial;

        valorInicial = entrada.nextInt();
        entrada.close();

        valor = valorInicial;
        n100 = valor / 100;
        valor = valor % 100;
        n50 = valor / 50;
        valor = valor % 50;
        n20 = valor / 20;
        valor = valor % 20;
        n10 = valor / 10;
        valor = valor % 10;
        n5 = valor / 5;
        valor = valor % 5;
        n2 = valor / 2;
        valor = valor % 2;
        n1 = valor;

        System.out.println(valorInicial);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");

    }
}