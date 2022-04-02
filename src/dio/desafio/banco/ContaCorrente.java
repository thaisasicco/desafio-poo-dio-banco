package dio.desafio.banco;

public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 10000;

    public ContaCorrente(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }
}
