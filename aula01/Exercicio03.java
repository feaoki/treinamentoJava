import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //ler o salário
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;

        //entrada dos dados
        System.out.println("Digite o valor do salário:");
        salario = entrada.nextDouble();

        //calcular  salario + 25%
        novoSalario = salario + salario * 0.25; // salario * 1.25;

        //exibir a resposta
        System.out.println("Novo salário: " + novoSalario);

        entrada.close();
    }
}