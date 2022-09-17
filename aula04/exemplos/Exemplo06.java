package exemplos;

public class Exemplo06 {

    public static void main(String[] args) {
        linha(10); 
        System.out.println("inicio do programa");
        char escolha = '*';
        //linha2(20, '*');
        linha2(20, escolha); 
        //linha2(escolha, 20); //isso não funciona pois não obedece a ordem
    }

    //método 'linha' não tem retorno (void) e com um parâmetro (int tamanho)
    static void linha(int tamanho){
        for(int i = 0 ; i < tamanho; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    //método 'linha2' não tem retorno (void) e com dois parâmetros 
    static void linha2(int tamanho, char tipo){
        for(int i = 0 ; i < tamanho; i++){
            System.out.print(tipo);
        }
        System.out.println();
    }
}
