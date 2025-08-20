package exercicio4;

public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(String autor) {
        this.autor = autor;
    }

    @Override
    public String exibirInfo() {
        if (!autor.isEmpty()) {
            return "Autor: " + autor;
        } else {
            return "Autor precisa ser informado";
        }
    }
}
