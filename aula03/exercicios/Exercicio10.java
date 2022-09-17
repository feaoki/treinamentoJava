package exercicios;

import java.util.Scanner;

//rascunho:
        /*
            ler as notas de 5 alunos{

                para cada nota validar se está no intervalo
                um laço para cada nota

                //calcular e exibir a média do aluno
                //acumular a média da sala

            }
            //calcular e exibir a média da sala

        */


public class Exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1, nota2, mediaClasse = 0, mediaAluno;
        final int TOTAL_ALUNOS = 5;

        for (int i = 1; i <= TOTAL_ALUNOS; i++) {
            do{
                System.out.println("Digite a primeira nota do aluno "+ i);
                nota1 = in.nextDouble();
            }while(nota1 < 0 || nota1 > 10);

            do{
                System.out.println("Digite a segunda nota do aluno "+ i);
                nota2 = in.nextDouble();
            }while(nota2 < 0 || nota2 > 10);

            mediaAluno = (nota1 + nota2)/2;
            System.out.println("Média do aluno " + i + ": " + mediaAluno);
            mediaClasse += mediaAluno;
        }
        System.out.println("\nMédia da classe: " + mediaClasse / TOTAL_ALUNOS);
    
        in.close();
    }
}
