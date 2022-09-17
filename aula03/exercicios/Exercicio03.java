package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limite, cont;

        System.out.print("Informe o limite: ");
        limite = in.nextInt();

        // *** Solução 1 ***

        cont = 1;
        while (cont <= limite) {
            System.out.print(cont + " ");
            cont *= 2; // isso é o mesmo que: cont = cont * 2;
        }
        System.out.println();


        // *** Solução 2 usando das vírgulas ***

        cont = 1;
        while (cont <= limite / 2) {
            System.out.print(cont + ", ");
            cont *= 2; 
        }
        if(cont <= limite){
            System.out.println(cont);
        }

        // *** Outra colução usando virgulas, porém mais "elegante" ***

        cont = 2;
        System.out.print(1);
        while (cont <= limite) {
            System.out.print(", " + cont);
            cont *= 2; 
        }
        
        in.close();
    }
}