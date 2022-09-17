package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner inNumber = new Scanner(System.in);
        Scanner inString = new Scanner(System.in);
        int idade;
        String nome;

        System.out.println("Digite sua idade:");
        idade = inNumber.nextInt();

        System.out.println("Digite o seu nome:");
        nome = inString.nextLine();

        System.out.println("Seus dados: " + nome + ":" + idade);

        inNumber.close();
        inString.close();
    }
}
