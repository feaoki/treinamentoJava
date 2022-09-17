package exercicio02;

import java.util.Scanner;

public class TesteApp {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        GerenciaContas contas = new GerenciaContas();

        ContaPoupanca.setTaxa(0.1); // ajusta a taxa de operação da poupança

        int numeroConta;
        double limite;
        double valor;

        do {
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Poupança");
            System.out.println("4-Fazer depósito");
            System.out.println("5-Fazer saque");
            System.out.println("6-Exibir as contas");
            System.out.println("7-Sair");
            System.out.print("-->");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Criando uma conta corrente.");
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;
                case 2:
                    System.out.println("Criando uma conta especial.");
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite:");
                    limite = teclado.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite);
                    break;
                case 3:
                    System.out.println("Criando uma conta corrente.");
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;
                case 4:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("informe o valor do depósito:");
                    valor = teclado.nextDouble();

                    if(contas.depositar(numeroConta, valor)){
                        System.out.println("Deposito realizado");
                    }else{
                        System.out.println("Falha na operação");
                    }

                    break;
                case 5:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("informe o valor do saque:");
                    valor = teclado.nextDouble();

                    if(contas.sacar(numeroConta, valor)){
                        System.out.println("Saque realizado");
                    }else{
                        System.out.println("Falha na operação");
                    }

                    break;
                case 6:
                    System.out.println(contas.listarContas());
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 7);

        teclado.close();
    }
}
