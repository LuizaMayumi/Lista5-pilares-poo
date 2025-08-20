package exercicio4;

import java.math.BigDecimal;

public class Revista extends ItemBiblioteca {
    private int edicao;

    @Override
    public String exibirInfo() {
        String info = super.exibirInfo();
        return info + "\nEdicao: " + edicao;
    }
}
