public class prova {
    public static void main(String[] args) {
        int vetor[] = {1,2,3,4,5,6};
        System.out.println("resultado= " + somaPares(vetor));


    }

    public int somaPares(int vetorEntrada[]){
        int resultado;

        for (int index = 0; index < vetorEntrada.length; index++) {
           if (vetorEntrada[index]%2==0 ) {
            resultado = vetorEntrada[index] + resultado;
           }
           return resultado;
        }

    }


}
