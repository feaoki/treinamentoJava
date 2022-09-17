package contas;

import java.util.HashMap;

public class GerenciaContas {

    private HashMap<Integer, Conta> listaDeContas;

    public GerenciaContas() {
        listaDeContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        listaDeContas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaPoupanca(int numeroConta) {
        listaDeContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        listaDeContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public boolean depositar(int numeroConta, double valor) {
        if (valor <= 0) {
            return false;
        }

        if (listaDeContas.containsKey(numeroConta)) {
            listaDeContas.get(numeroConta).depositar(valor);
            return true;
        }

        return false;
    }

    public boolean sacar(int numeroConta, double valor) {
        Conta conta = listaDeContas.get(numeroConta);

        if (conta != null) {
            return conta.sacar(valor);
        }
        return false;
    }

    public String listarContas() {
        String saida = "";

        for (Integer key : listaDeContas.keySet() ) {
            saida += listaDeContas.get(key).exibir() + "\n";
        }

        return saida;
    }

}
