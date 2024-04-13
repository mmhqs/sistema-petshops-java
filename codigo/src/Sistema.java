import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Sistema {
    static Scanner teclado;

// Programa principal Main
    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);
        menuIniciar();
        int banhoEmFimDeSemana = ehFimDeSemana();
        int qtdCachorrosGrandes = cachorrosGrandes();
        int qtdCachorrosPequenos = cachorrosPequenos();
        double orcamento1 = orcamentoPetshop1(qtdCachorrosGrandes, qtdCachorrosPequenos, banhoEmFimDeSemana);
        double orcamento2 = orcamentoPetshop2(qtdCachorrosGrandes, qtdCachorrosPequenos, banhoEmFimDeSemana);
        double orcamento3 = orcamentoPetshop3(qtdCachorrosGrandes, qtdCachorrosPequenos, banhoEmFimDeSemana);
        System.out.println("O preço total dos banhos no Petshop Meu Canino Feliz é R$"+orcamento1+", no Petshop Vai Rex é R$"+orcamento2+", e no Petshop Chow Chawgas é R$"+orcamento3+".");
        teclado.close();
    }

// Métodos

    /**
    * Artifício para "limpar" a tela com um comandinho popular no Linux que imprime na tela uma sequência longa.
    */
    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Introdução do sistema no console.
     */
    static void menuIniciar() {
        limparTela();
        System.out.println("Sistema de ranking para petshops");
        System.out.println("=================================================================\n");
        System.out.println("Olá! Bem vindo(a)! Vamos realizar a precificação de cada petshop.");
        System.out.println("Vamos precisar de alguns dados a seguir, tudo bem?\n");
    }

    /**
    * Método para descobrir se o banho está previsto para o fim de semana ou dia útil.
    * @return Se o banho será realizado no fim de semana (1) ou em dia útil (0).
    */
    static int ehFimDeSemana() {
        int banhoEmFimDeSemana;
        System.out.println("Seu banho será realizado no fim de semana ou em dia útil? Se for no fim de semana, digite 1. Se não, digite 0.");
        banhoEmFimDeSemana = Integer.parseInt(teclado.nextLine());
        return banhoEmFimDeSemana;
    }

    /**
     * Método para obter quantos cachorros de grande porte estão previstos para banho.
     * @return Número de cachorros de grande porte que irão tomar banho.
     */
    static int cachorrosGrandes() {
        int caesGrandes;
        System.out.println("OK. Agora vamos precisar de mais alguns dados.");
        System.out.println("Quantos cachorros de GRANDE porte vão tomar banho?");
        caesGrandes = Integer.parseInt(teclado.nextLine());
        return caesGrandes;
    }
    
        /**
     * Método para obter quantos cachorros de pequeno porte estão previstos para banho.
     * @return Número de cachorros de pequeno porte que irão tomar banho.
     */
    static int cachorrosPequenos() {
        int cachorrosPequenos;
        System.out.println("Quantos cachorros de PEQUENO porte vão tomar banho?");
        cachorrosPequenos = Integer.parseInt(teclado.nextLine());
        return cachorrosPequenos;
    }

    static double orcamentoPetshop1(int qtdCachorrosGrandes, int qtdCachorrosPequenos, int ehFimDeSemana){
        MeuCaninoFeliz banho = new MeuCaninoFeliz("Meu Canino Feliz", qtdCachorrosGrandes, qtdCachorrosPequenos, ehFimDeSemana);
        double preco = banho.preco();
        return preco;
    }

    static double orcamentoPetshop2(int qtdCachorrosGrandes, int qtdCachorrosPequenos, int ehFimDeSemana){
        VaiRex banho = new VaiRex("Vai Rex", qtdCachorrosGrandes, qtdCachorrosPequenos, ehFimDeSemana);
        double preco = banho.preco();
        return preco;
    }

    static double orcamentoPetshop3(int qtdCachorrosGrandes, int qtdCachorrosPequenos, int ehFimDeSemana){
        ChowChawgas banho = new ChowChawgas("Chow Chawgas", qtdCachorrosGrandes, qtdCachorrosPequenos, ehFimDeSemana);
        double preco = banho.preco();
        return preco;
    }

    static double maiorNumero(double numero1, double numero2, double numero3){
    double maior;
    if (numero1 > numero2 && numero1 > numero3) {
        maior = numero1;
    }
    else if(numero2 > numero1 && numero2 > numero3) {
        maior = numero2;
    }
    else {
        maior = numero3;
    }
    return maior;
    }

    static double compararOrcamento(double orcamento1, double orcamento2, double orcamento3){
        double melhorOrcamento = 0.0;
        if ((orcamento1 != orcamento2) && (orcamento2 != orcamento3) && (orcamento3 != orcamento1)) {
            melhorOrcamento = maiorNumero(orcamento1,orcamento2,orcamento3);
        }
        return melhorOrcamento;
    }

    }
