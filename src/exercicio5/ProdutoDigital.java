package exercicio5;

public class ProdutoDigital implements Vendavel {
    private double preco;
    private int tamanhoArquivoMB;

    public ProdutoDigital(double preco, int tamanhoArquivoMB) {
        this.preco = preco;
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    @Override
    public double calcularPrecoFinal() {
        if (tamanhoArquivoMB > 600) {
            return preco - (preco * 0.15);
        } else {
            return preco;
        }


    }
}
