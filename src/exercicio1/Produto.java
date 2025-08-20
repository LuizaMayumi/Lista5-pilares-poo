package exercicio1;

public class Produto implements Exibivel{

    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + "\nPreco: " + preco + "\nCategoria: " + categoria);
    }
}
