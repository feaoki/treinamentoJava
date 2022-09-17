//package pasta;

package exemplo;

public class Pessoa {
   private String nome;
   private int idade;

   public int getIdade() {
      return idade;
   }

   public void setIdade(int idade) {
      if (idade > 0) {
         this.idade = idade;
      }
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      if (nome != null && nome.length() > 0) {
         nome = nome.toUpperCase();
         for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) < 'A' || nome.charAt(i) > 'Z') {
               return;
            }
         }
         this.nome = nome;
      }
   }

}