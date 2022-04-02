package dio.desafio.banco;

public class Main {

    public static void main(String[] args) {

        Endereco thaisaEnd = new Endereco("Rua Blablaba", "200", "sem complemento", "Parque Jurema", "São Paulo", "13345-890");
        Cliente thaisa = new Cliente("Thaisa", "9987-5566", "123456789-10", thaisaEnd);

        thaisa.dadosCliente();

        Conta thaisaCC = new ContaCorrente(thaisa);
        Conta thaisaCP = new ContaPoupanca(thaisa);

        thaisaCC.depositar(2500);
        thaisaCC.sacar(500);
        thaisaCC.transferir(100, thaisaCP);

        thaisaCC.imprimirExtrato();
        thaisaCP.imprimirExtrato();

    }

}
