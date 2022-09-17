package exemplos;

import java.util.Scanner;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        try{
            System.out.println("Digite um numero inteiro:");
            numero = teclado.nextInt();
            System.out.println(numero);
        }catch(Exception e){
           System.out.println("Entrada inválida.");
        }

        System.out.println("Final do programa.");

        teclado.close();
    }
}