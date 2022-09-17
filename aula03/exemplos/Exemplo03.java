package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;

        do{
            System.out.println("Digite um valor positivo:");
            valor = in.nextInt();
        }while(valor <= 0);
        System.out.println("Aeeeee!");

/*         valor = -1;
        while(valor <= 0){
            System.out.println("Digite um valor positivo:");
            valor = in.nextInt();
        }
        System.out.println("Aeeeee!"); */

        in.close();

    }
}
