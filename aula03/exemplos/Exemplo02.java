package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int cont, soma;

        cont = 0;
        soma = 0;
        while(cont < 6){
            soma = soma + cont; // soma += cont; // -= *= /= 
            cont++; // cont = cont + 1;
            //cont--; cont = cont - 1;
        }
        System.out.println("soma = " + soma);
        
    }
}
