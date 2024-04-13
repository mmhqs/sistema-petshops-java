import java.time.LocalDate;

public class ChowChawgas extends Petshop {
    private static final int DISTANCIA_CANIL = 800;

    public ChowChawgas(String nome, int qtdCachorrosGrandes, int qtdCachorrosPequenos, int ehFimDeSemana) {
        super(nome, qtdCachorrosGrandes, qtdCachorrosPequenos, ehFimDeSemana);
    }

    public double preco(){
        double preco;
        double valorCachorroPequeno = 30.0;
        double valorCachorroGrande = 45.0;
        preco = (valorCachorroPequeno * qtdCachorrosPequenos) + (valorCachorroGrande * qtdCachorrosGrandes);
        return preco;
    }


}
