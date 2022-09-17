package exercicios;

/*
Escreva um programa que recebe os 3 comprimentos de lados a, b, c. Determine a seguir o tipo de triângulo formado:
Se a > b+c (para cada lado vale o mesmo) não formam triângulo algum. 
Se forem todos iguais formam um triângulo equilátero. 
Se a=b ou b=c ou a=c então formam um triângulo isósceles.
Caso contrário forma um triângulo escaleno.
 */

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        int lado1, lado2, lado3;
        boolean ehTriagulo;

        System.out.println("Digite o primeiro lado");
        lado1 = entrada.nextInt();
        System.out.println("Digite o segundo lado");
        lado2 = entrada.nextInt();
        System.out.println("Digite o terceiro lado");
        lado3 = entrada.nextInt();

        ehTriagulo = (lado1 <= lado2 + lado3) && 
                     (lado2 <= lado1 + lado3) && 
                     (lado3 <= lado1 + lado2);

        if (ehTriagulo) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Equilátero");
            } else {
                if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Escaleno");
                }
            }
        } else {
            System.out.println("Não é um triângulo.");
        }

        entrada.close();
    }
}