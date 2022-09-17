package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Informe o salario:");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("Isento");
        } else {
            if (salario <= 1200) {
                System.out.println("Imposto de 20%: " + salario * 0.2);
            } else {
                if (salario <= 2000) {
                    System.out.println("Imposto de 25%: " + salario * 0.25);
                } else {
                    System.out.println("Imposto de 30%: " + salario * 0.3);
                }
            }
        }

        entrada.close();
        
    }
}