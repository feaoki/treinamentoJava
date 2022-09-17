package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = entrada.nextDouble();

        media = nota1 * 0.4 + nota2 * 0.6;
        
        if( media >= 6 ){
            System.out.printf("Aluno aprovado com média %.1f\n", media);
        }else{
            System.out.printf("Aluno reprovado com média %.1f\n", media);
        }

        entrada.close();
    }
}