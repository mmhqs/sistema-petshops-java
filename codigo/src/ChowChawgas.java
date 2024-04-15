public class ChowChawgas extends Petshop {
    private static final int DISTANCIA_CANIL = 800;

        /**
     * Método construtor da classe.
     * @param nome Nome do petshop.
     * @param qtdCachorrosGrandes Quantidade de cachorros grandes a tomarem banho.
     * @param qtdCachorrosPequenos Quantidade de cachorros pequenos a tomarem banho.
     * @param ehFimDeSemana Inteiro que determina se o banho será realizado no fim de semana ou não.
     */
    public ChowChawgas(String nome, int qtdCachorrosGrandes, int qtdCachorrosPequenos, int ehFimDeSemana) {
        super(nome, qtdCachorrosGrandes, qtdCachorrosPequenos, ehFimDeSemana);
    }

        /**
     * Método para obter o preço do banho.
     * @return Preço total do banho, considerando cachorros grandes e pequenos.
     */
    public double preco(){
        double preco;
        double valorCachorroPequeno = 30.0;
        double valorCachorroGrande = 45.0;
        preco = (valorCachorroPequeno * qtdCachorrosPequenos) + (valorCachorroGrande * qtdCachorrosGrandes);
        return preco;
    }

        /**
     * Método para retornar a distância entre o petshop e o canil.
     * @return Distância entre o petshop e o canil.
     */
    public int retornarDistancia(){
        return DISTANCIA_CANIL;
    }

}
