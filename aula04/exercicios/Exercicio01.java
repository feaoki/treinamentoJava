package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        boolean retorno;

        try {
            System.out.println("Digite um valor inteiro:");
            valor = Integer.parseInt( teclado.nextLine() );

            retorno = ehPar(valor);
        
            if( retorno == true ){
                System.out.println("O valor " + valor + " é par");
            }else{
                System.out.println("O valor " + valor + " não é par");
            }

        } catch (Exception e) {
            System.out.println("Entrada inválida!");
        } finally{
            teclado.close();
        }

    }

    static boolean ehPar(int numero){
        if( numero % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

}
