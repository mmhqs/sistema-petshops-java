import java.time.LocalDate;

public class MeuCaninoFeliz extends Petshop {
    private static final int DISTANCIA_CANIL = 2000;
    private static final double TAXA_FDS = 0.2;

    public MeuCaninoFeliz(String nome, int qtdCachorrosGrandes, int qtdCachorrosPequenos) {
        super(nome, qtdCachorrosGrandes, qtdCachorrosPequenos);
    }

    public double precoDiaUtil(){
        double preco;
        double valorCachorroPequeno = 20.0;
        double valorCachorroGrande = 40.0;
        preco = (valorCachorroPequeno * qtdCachorrosPequenos) + (valorCachorroGrande * qtdCachorrosGrandes);
        return preco;
    }

    public double precoFimDeSemana(){
        double preco;
        double valorCachorroPequeno = 20.0 + (TAXA_FDS * 20.0);
        double valorCachorroGrande = 40.0 + (TAXA_FDS * 40.0);
        preco = (valorCachorroPequeno * qtdCachorrosPequenos) + (valorCachorroGrande * qtdCachorrosGrandes);
        return preco;
    }
}

