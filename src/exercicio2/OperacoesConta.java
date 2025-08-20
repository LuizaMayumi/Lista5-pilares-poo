package exercicio2;

public interface OperacoesConta {

    void depositar(double valor);
    void sacar(double valor);
    double consultarSaldo();
    void tranferir(ContaBancaria destino, double valor);
}
