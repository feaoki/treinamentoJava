import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        //Entrada de dados

        System.out.print("Informe a primeira nota:");
        nota1 = entrada.nextDouble();
        System.out.print("Informe a segunda nota:");
        nota2 = entrada.nextDouble();

/*         System.out.println("Informe as notas:");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble(); */

        //Processamento dos dados
        media = (nota1 + nota2) / 2;

        ///Saída da resposta
        System.out.println("A média é " + media);

        entrada.close();
    }
}
