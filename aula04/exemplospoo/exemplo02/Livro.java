package exemplospoo.exemplo02;

public class Livro {
    //atributos da classe (caracteristicas do objeto)
    String titulo;
    String autor;
    int numPaginas;

    //construtor = tem o mesmo nome da classe
    public Livro(String titulo, String autor, int numPaginas){
        this.titulo = titulo;  //this se refere ao próprio objeto - atributos dele
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    //demais métodos da classe (ações sobre/com os objetos)
    String exibirDados(){
        return titulo + " - " + autor + ": " + numPaginas;
    }

    int numPaginas(){
        return numPaginas;
    }

}
