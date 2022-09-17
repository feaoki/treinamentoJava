package exemplos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Fila {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            fila.add( rnd.nextInt(11) ); //adiciona na fila valores aleatórios de 0 à 10
        }

        System.out.println(fila);

        while (! fila.isEmpty()) {
            System.out.print( String.format("%02d ", fila.remove()) );
        }
        System.out.println();
        System.out.println(fila);
    }
}
