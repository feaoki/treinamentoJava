package exemplos;

public class Exemplo07 {
    public static void main(String[] args) {
        int resultado;
        int x, y;
        x = 10;
        y = 50;
        resultado = soma(x, y); //a variável 'resultado' recebe o retorno do método

        System.out.println("Resultado = " + resultado);
    }

    static int soma(int n1, int n2){
        int resp;

        resp = n1 + n2;

        return resp; //devolve o valor da variável resp para quem chamou o método
    }

}
