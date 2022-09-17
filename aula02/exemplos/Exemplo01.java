package exemplos;

public class Exemplo01 {
    public static void main(String[] args) {
        
        int i;
        float f;

        i = 10;
        f = 10;

        //estas atribuições não podem ser feitas
        //i = 2.3f;
        //f = 4.5;

        i = (int)3.4;  //casting - cnversão 'forçada'

        System.out.println(i);
        System.out.println(f);
    }
}
