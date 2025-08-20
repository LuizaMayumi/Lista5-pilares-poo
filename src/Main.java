import com.sun.tools.jconsole.JConsoleContext;
import exercicio1.Produto;
import exercicio2.ContaBancaria;
import exercicio3.Tarefa;
import exercicio4.ItemBiblioteca;
import exercicio4.Livro;
import exercicio4.Revista;
import exercicio5.ProdutoDigital;
import exercicio5.ProdutoFisico;

public class Main {
    public static void main(String[] args) {

//          1
//        Produto prod1 = new Produto("Polo", 130000, "Automovel");
//        prod1.exibirDetalhes();

//        2
//        ContaBancaria conta1 = new ContaBancaria("1234", 25.09);
//        conta1.depositar(00.45);
//        conta1.sacar(00.54);
//        System.out.println(conta1.consultarSaldo());

//        3
//        Tarefa tarefa1 = new Tarefa("Fazendo lista";
//        tarefa1.estaConcluida();
//        tarefa1.exibirStatus();
//        tarefa1.concluir();
//        tarefa1.exibirStatus();

//        4
//        ItemBiblioteca item1 = new ItemBiblioteca();
//
//        item1.titulo = "A menina que roubava livros";
//        item1.anoPublicado = 2005;
//
//        Livro livro1 = new Livro("Markus Zusak");
//        Revista revista1 = new Revista();
//        revista1.edicao = 1;
//        System.out.println(livro1.exibirInfo());
//        System.out.println(item1.exibirInfo());
//        System.out.println(revista1.exibirInfo());

//        5
        ProdutoDigital digital1 = new ProdutoDigital(149.90,800);
        System.out.println(digital1.calcularPrecoFinal());

        ProdutoDigital digital2 = new ProdutoDigital(25.40,40);
        System.out.println(digital2.calcularPrecoFinal());

        ProdutoFisico prod3 = new ProdutoFisico(49.30,7.50);
        System.out.println(prod3.calcularPrecoFinal());
    }
}


