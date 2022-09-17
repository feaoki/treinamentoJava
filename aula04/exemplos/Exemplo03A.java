package exemplos;

import java.util.Scanner;

public class Exemplo03A {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        String nome;
        
        System.out.println("Digite sua idade:");
        idade = teclado.nextInt();
        teclado.nextLine(); //limpar o buffer
        System.out.println("Digite o seu nome:");
        nome = teclado.nextLine();
        
        System.out.println("Seus dados: " + nome + ":" + idade);

        teclado.close();
    }
}
