package exemplo;

//import pasta.Pessoa;

public class app {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        p.setIdade(19);
        p.setIdade(-9);

        System.out.println(p.getIdade());

        p.setNome("Emerson");
        p.setNome("Eme5s0n");

        System.out.println(p.getNome());
    }
}
