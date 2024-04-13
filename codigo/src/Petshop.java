import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Petshop {
    protected String nome;
    protected int qtdCachorrosGrandes;
    protected int qtdCachorrosPequenos;

    public Petshop(String nome, int qtdCachorrosGrandes, int qtdCachorrosPequenos){
        this.nome = nome;
        this.qtdCachorrosGrandes = qtdCachorrosGrandes;
        this.qtdCachorrosPequenos = qtdCachorrosPequenos;
    }
    
}
