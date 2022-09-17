import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double KMparaMILHAS = 0.62137f; //define constantes
        final int MILHAparaJARDAS = 1760;
        final int JARDAparaPES = 3;
        final int PESparaPOLEGADA = 12;
        
        double km;

        System.out.println("Quantos KM foram rodados? ");
        km = entrada.nextDouble();

        System.out.println(km + " km");
        System.out.println("Em milhas " + km + "km são " + (km * KMparaMILHAS));
        System.out.println("Em Jardas " + km + "km são " + (km * KMparaMILHAS * MILHAparaJARDAS));
        System.out.println("Em Pés " + km + "km são " + (km * KMparaMILHAS * MILHAparaJARDAS * JARDAparaPES));
        System.out.println("Em Polegadas " + km + "km são " + (km * KMparaMILHAS * MILHAparaJARDAS * JARDAparaPES * PESparaPOLEGADA));

        entrada.close();

    }
}