package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario, novoSalario;
        String percentual;

        salario = in.nextDouble();

        if(salario <= 400){
            novoSalario = salario * 1.15;
            percentual = "15 %";
        }else{
            if(salario <= 800){
                novoSalario = salario * 1.12;
                percentual = "12 %";
            }else{
                if(salario <= 1200){
                    novoSalario = salario * 1.1;
                    percentual = "10 %";
                }else{
                    if(salario <= 2000){
                        novoSalario = salario * 1.07;
                        percentual = "7 %";
                    }else{
                        novoSalario = salario * 1.04;
                        percentual = "4 %";                        
                    }                    
                }
            }            
        }

        System.out.printf("Novo Salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", novoSalario - salario );
        System.out.println("Em percentual: " + percentual);

        in.close();
    }
}
