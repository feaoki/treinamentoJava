package exemplos;

import java.util.Scanner;

public class Exemplo03B {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        String nome;
        //String entrada;
        
        System.out.println("Digite sua idade:");
        //entrada = teclado.nextLine();
        //idade = Integer.parseInt(entrada); 
        //ler como String porque o buffer guarda com um <ENTER> quando leio o int
        idade = Integer.parseInt(teclado.nextLine()); //ler como string e converter para inteiro

        System.out.println("Digite o seu nome:");
        nome = teclado.nextLine();
        
        System.out.println("Seus dados: " + nome + ":" + idade);

        teclado.close();
    }
}
