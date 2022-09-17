package uri;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double valor;

        System.out.println("Digite o número:"); 
        valor = in.nextDouble();

        //solução 1

        if(valor >= 0 && valor <= 25 ){
            System.out.println("Intervalo [0,25]");
        }else{
            if(valor > 25 && valor <= 50 ){
                System.out.println("Intervalo (25,50]");
            }else{
                if(valor > 50 && valor <= 75 ){
                    System.out.println("Intervalo (50,75]");
                }else{
                    if(valor > 75 && valor <= 100 ){
                        System.out.println("Intervalo (75,100]");
                    }else{
                        System.out.println("Fora de intervalo");
                    }
                }
            }           
        }

        //solução 2

        if(valor < 0 || valor > 100 ){
            System.out.println("Fora de intervalo");
        }else{
            if(valor <= 25 ){
                System.out.println("Intervalo [0,25]");
            }else{
                if(valor <= 50 ){
                    System.out.println("Intervalo (25,50]");
                }else{
                    if(valor <= 75 ){
                        System.out.println("Intervalo (50,75]");
                    }else{
                            System.out.println("Intervalo (75,100]");
                    }
                }
            }
        }

        in.close();

    }

}
