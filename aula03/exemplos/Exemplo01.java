package exemplos;

import java.util.Scanner;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota;

        System.out.println("Informe a nota (0 à 10):");
        nota = in.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
        } else {
            if (nota >= 7) {
                System.out.println("Aluno Aprovado.");
            }
        }

        in.close();
    }
}