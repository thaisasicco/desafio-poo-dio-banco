package dio.desafio.banco;

public class Conta {

    protected static final int AGENCIA_PADRAO = 5986;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirExtrato(){
        System.out.println("===== Extrato =====");
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: R$" + getSaldo());
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
