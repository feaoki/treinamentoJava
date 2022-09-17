package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;
        boolean resultado; //true ou false

        System.out.println("Digite o seu nome:");
        senha = entrada.nextLine();

        resultado = senha.equals("R10p5");

        if( resultado == true ){
            System.out.println("Acesso concedido.");
        }else{
            System.out.println("Acesso negado.");
        }

        entrada.close();
    }
}