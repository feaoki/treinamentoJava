package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, cont;

        System.out.print("Qual tabuada? ");
        n = Integer.parseInt(in.nextLine());
        
        cont = 0;
        while ( cont <= 10 ) {
            System.out.println(n + " x " + cont + " = " + (cont * n));
            cont++;
        }
        
        in.close();
    }
}