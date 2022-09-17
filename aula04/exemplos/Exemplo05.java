package exemplos;

public class Exemplo05 {

    public static void main(String[] args) {
        linha(); //chamada do método linha
        System.out.println("inicio do programa");
        linha(); //chamada do método linha
    }

    //método 'linha' não tem retorno (void) e não tem parâmetro ()
    static void linha(){
        System.out.println("-------------------");
    }

}
