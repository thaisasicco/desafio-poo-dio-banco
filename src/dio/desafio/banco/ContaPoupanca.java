package dio.desafio.banco;

public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 70000;

    public ContaPoupanca(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

}
