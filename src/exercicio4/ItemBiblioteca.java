package exercicio4;

public class ItemBiblioteca {
    public String titulo;
    public int anoPublicado;

    public String exibirInfo() {
        if (!titulo.isEmpty() || anoPublicado != 0) {
            String info = "Titulo: " + titulo +"\nAno publicado: " + anoPublicado;
            return info;
        } else {
            return "Ano e titulo precisam ser informados";
        }

    }
}
