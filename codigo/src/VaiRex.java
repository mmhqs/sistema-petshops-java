public class VaiRex extends Petshop {
    private static final int DISTANCIA_CANIL = 1700;

    public VaiRex(String nome, int qtdCachorrosGrandes, int qtdCachorrosPequenos, int ehFimDeSemana) {
        super(nome, qtdCachorrosGrandes, qtdCachorrosPequenos, ehFimDeSemana);
    }

    public double precoDiaUtil(){
        double preco;
        double valorCachorroPequeno = 15.0;
        double valorCachorroGrande = 50.0;
        preco = (valorCachorroPequeno * qtdCachorrosPequenos) + (valorCachorroGrande * qtdCachorrosGrandes);
        return preco;
    }

    public double precoFimDeSemana(){
        double preco;
        double valorCachorroPequeno = 20.0;
        double valorCachorroGrande = 55.0;
        preco = (valorCachorroPequeno * qtdCachorrosPequenos) + (valorCachorroGrande * qtdCachorrosGrandes);
        return preco;
    }

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

    public int retornarDistancia(){
        return DISTANCIA_CANIL;
    }
}
