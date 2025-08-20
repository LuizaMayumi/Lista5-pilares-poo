package exercicio2;

public class ContaBancaria implements OperacoesConta {

    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public void tranferir(ContaBancaria destino, double valor) {
        if (saldo < valor){
            System.out.println("Saldo insuficiente");
        } else if (numeroConta.equals(destino.numeroConta)){
            saldo -= valor;
        } else {
            System.out.println("Conta inexistente");
        }
    }
}
