package exercicio4;

public class Revista extends ItemBiblioteca {
    public int edicao;

    @Override
    public String exibirInfo() {
        if (edicao != 0) {
            return "Edicao: " + edicao;
        } else {
            return "Edicao do livro, precisa ser informada";
        }
    }
}
