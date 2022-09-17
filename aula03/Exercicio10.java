import java.util.Scanner;

//rascunho:
/*
    ler as duas notas de 5 alunos{

        para cada nota validar se está no intervalo
        um laço para cada nota

        //calcular e exibir a média do aluno
        //acumular a média da sala

    }
    //calcular e exibir a média da sala

*/

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, mediaAluno, mediaClasse = 0;
        final int NUM_ALUNOS = 5; //define NUM_ALUNOS como uma constante

        for (int aluno = 1; aluno <= NUM_ALUNOS; aluno++) {

            do {
                System.out.println("Digite a primeira nota (0 à 10) do aluno " + aluno + " :");
                nota1 = teclado.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.println("Digite a segunda nota (0 à 10) do aluno " + aluno + " :");
                nota2 = teclado.nextDouble();
            } while (nota2 < 0 || nota2 > 10);
            
            mediaAluno = (nota1 + nota2) / 2;
            mediaClasse = mediaClasse + mediaAluno;
            System.out.println("Média do aluno " + aluno + ": " + mediaAluno);
        }
        System.out.println("\nMédia da classe: " + mediaClasse / NUM_ALUNOS);

        teclado.close();
    }
}
