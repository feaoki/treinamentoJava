package exemplospoo.exemplo01;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "Emerson";
        p2.nome = "Carlos Antônio";

        p1.apresentar();
        p2.apresentar();
    }

}
