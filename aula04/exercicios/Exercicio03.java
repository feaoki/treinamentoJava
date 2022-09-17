package exercicios;

public class Exercicio03 {
    public static void main(String[] args) {
        int numVogais = contaVogais("Boa tarde! Vamos programar.");

        System.out.println("Foram encontradas " + numVogais + " vogais");
    }

    static int contaVogais(String frase){
        String aux = frase.toLowerCase(); //altera todos os caracteres para minusculo
        int cont = 0;

        for (int i = 0; i < aux.length(); i++) { //length retorna o tamanho da frase
            if( aux.charAt( i ) == 'a' || 
                aux.charAt( i ) == 'e' || 
                aux.charAt( i ) == 'i' || 
                aux.charAt( i ) == 'o' ||
                aux.charAt( i ) == 'u') 
                {
                    cont++;
                }
        }

        return cont;
    }

}
