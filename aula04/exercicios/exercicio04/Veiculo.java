package exercicios.exercicio04;

public class Veiculo {
    String marca, modelo;
    double consumo;

    Veiculo(String marca, String modelo, double consumo){
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    String exibir(){
        return modelo + " marca: " + marca;
    }

    double consumo(){
        return consumo;
    }
    
}