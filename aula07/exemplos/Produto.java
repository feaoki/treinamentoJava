package exemplos;

public class Produto {
    private int codigo;
    private String nome;

    public Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo(){
        return codigo;
    }
    
    //toString é chamado automaticamente quando precisa transformar o objeto em String
    @Override
    public String toString() {
        return codigo + ":" + nome;
    }

}
