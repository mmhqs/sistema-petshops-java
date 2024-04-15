public class VaiRex extends Petshop {
    private static final int DISTANCIA_CANIL = 1700;

        /**
     * Método construtor da classe.
     * @param nome Nome do petshop.
     * @param qtdCachorrosGrandes Quantidade de cachorros grandes a tomarem banho.
     * @param qtdCachorrosPequenos Quantidade de cachorros pequenos a tomarem banho.
     * @param ehFimDeSemana Inteiro que determina se o banho será realizado no fim de semana ou não.
     */
    public VaiRex(String nome, int qtdCachorrosGrandes, int qtdCachorrosPequenos, int ehFimDeSemana) {
        super(nome, qtdCachorrosGrandes, qtdCachorrosPequenos, ehFimDeSemana);
    }

        /**
     * Método para calcular o preço do banho em dia útil.
     * @return Preço do banho em dia útil.
     */
    public double precoDiaUtil(){
        double preco;
        double valorCachorroPequeno = 15.0;
        double valorCachorroGrande = 50.0;
        preco = (valorCachorroPequeno * qtdCachorrosPequenos) + (valorCachorroGrande * qtdCachorrosGrandes);
        return preco;
    }
    
        /**
     * Método para calcular o preço do banho em fim de semana.
     * @return Preço do banho em fim de semana.
     */
    public double precoFimDeSemana(){
        double preco;
        double valorCachorroPequeno = 20.0;
        double valorCachorroGrande = 55.0;
        preco = (valorCachorroPequeno * qtdCachorrosPequenos) + (valorCachorroGrande * qtdCachorrosGrandes);
        return preco;
    }

        /**
     * Método para obter o preço do banho.
     * @return Preço total do banho, considerando cachorros grandes e pequenos.
     */
    public double preco(){
        double preco;
        if(ehFimDeSemana == 1){
            preco = precoFimDeSemana();
        }
        else{
            preco = precoDiaUtil();
        }
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
