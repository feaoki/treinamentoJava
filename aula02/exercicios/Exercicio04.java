package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao;

        System.out.println("Digite o valor do salário: ");
        salario = entrada.nextDouble();
        System.out.println("Digite o valor da Prestação: ");
        prestacao = entrada.nextDouble();

        if (prestacao <= salario * 0.3) {
            System.out.println("O emprestimo pode ser concedido.");
        } else {
            System.out.println("O emprestimo NÃO pode ser concedido.");
        }

        entrada.close();
    }
}