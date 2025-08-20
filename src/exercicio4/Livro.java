package exercicio4;

public class Livro extends ItemBiblioteca {
    private String autor;

    @Override
    public String exibirInfo() {
        String info = super.exibirInfo();

        return info + "\nAutor:" + autor;
    }
}
