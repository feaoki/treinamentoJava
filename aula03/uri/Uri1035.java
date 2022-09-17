package uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, c, b, d;
        boolean valido; 

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();

        valido = (b > c) && (d > a) && (c + d > a + b) && (c > 0 && d > 0) && (a % 2 == 0);

        if (valido) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        in.close();
    }
}