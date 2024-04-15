public class Petshop {
    protected String nome;
    protected int qtdCachorrosGrandes;
    protected int qtdCachorrosPequenos;
    protected int ehFimDeSemana;

        /**
     * Método construtor da classe.
     * @param nome Nome do petshop.
     * @param qtdCachorrosGrandes Quantidade de cachorros grandes a tomarem banho.
     * @param qtdCachorrosPequenos Quantidade de cachorros pequenos a tomarem banho.
     * @param ehFimDeSemana Inteiro que determina se o banho será realizado no fim de semana ou não.
     */
    public Petshop(String nome, int qtdCachorrosGrandes, int qtdCachorrosPequenos, int ehFimDeSemana){
        this.nome = nome;
        this.qtdCachorrosGrandes = qtdCachorrosGrandes;
        this.qtdCachorrosPequenos = qtdCachorrosPequenos;
        this.ehFimDeSemana = ehFimDeSemana;
    }
    
}
