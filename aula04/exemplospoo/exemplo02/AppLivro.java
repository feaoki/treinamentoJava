package exemplospoo.exemplo02;

public class AppLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Progração em Java", "Deitel", 437);
        Livro livro2 = new Livro("Engenharia de Software","Tanembaum", 300 );

/*         livro1.titulo = "Progração em Java";
        livro1.autor = "Deitel";
        livro1.numPaginas = 437; */

/*         livro2.titulo = "Engenharia de Software";
        livro2.autor = "Tanembaum";
        livro2.numPaginas = 300; */

        System.out.println( livro1.exibirDados() );
        System.out.println( livro2.exibirDados() );

        System.out.println("Número de páginas: " + livro1.numPaginas());
    }

}
