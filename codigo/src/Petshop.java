import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Petshop {
    protected String nome;
    protected int qtdCachorrosGrandes;
    protected int qtdCachorrosPequenos;
    protected int ehFimDeSemana;

    public Petshop(String nome, int qtdCachorrosGrandes, int qtdCachorrosPequenos, int ehFimDeSemana){
        this.nome = nome;
        this.qtdCachorrosGrandes = qtdCachorrosGrandes;
        this.qtdCachorrosPequenos = qtdCachorrosPequenos;
        this.ehFimDeSemana = ehFimDeSemana;
    }
    
}
