package exercicio6;

public class FuncionarioFreelancer extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    @Override
    public double calcularPegamento(){
        return valorHora * horasTrabalhadas;
    }
}
