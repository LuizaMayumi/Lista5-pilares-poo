package exercicio3;

public class Tarefa implements Concluivel{

    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    @Override
    public void concluir() {
        System.out.println("Concluido");
    }

    @Override
    public boolean estaConcluida() {
        return concluida = true;
    }

    public void exibirStatus(){
        if (concluida){
            System.out.println("Descricao: " + descricao +"\nStatus: Concluida");
        } else {
            System.out.println("Descricao: " + descricao +"\nStatus: Pendente");
        }
    }
}
