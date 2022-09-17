import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Valor da base:");
        base = entrada.nextDouble();
        System.out.println("Valor da altura:");
        altura = entrada.nextDouble();

        area = base * altura / 2;

        System.out.println("Área = " + area);

        entrada. close();
    }
}