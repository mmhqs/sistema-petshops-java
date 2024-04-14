import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class Sistema {
    static Scanner teclado;

// Programa principal Main
    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);

        menuIniciar();

        // Obtendo do usuário a data prevista para o banho
        String dataString = obterStringData();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(dataString);
        // Convertendo para o objeto Calendar pra verificar dias de semana
        Calendar dataCalendario = Calendar.getInstance(); 
        dataCalendario.setTime(data);
        // Verificando se o banho vai ser no fim de semana ou não
        int banhoEmFimDeSemana = verificarFimDeSemana(dataCalendario);

        // Obtendo do usuário a quantidade de banhos para cada porte de cachorrinho
        int qtdCachorrosGrandes = cachorrosGrandes();
        int qtdCachorrosPequenos = cachorrosPequenos();

        // Criando os objetos em cada petshop
        MeuCaninoFeliz novoBanho1 = new MeuCaninoFeliz("Meu Canino Feliz", qtdCachorrosGrandes, qtdCachorrosPequenos, banhoEmFimDeSemana);
        VaiRex novoBanho2 = new VaiRex("Vai Rex", qtdCachorrosGrandes, qtdCachorrosPequenos, banhoEmFimDeSemana);
        ChowChawgas novoBanho3 = new ChowChawgas("Chow Chawgas", qtdCachorrosGrandes, qtdCachorrosPequenos, banhoEmFimDeSemana);

        double orcamento1 = novoBanho1.preco();
        double orcamento2 = novoBanho2.preco();
        double orcamento3 = novoBanho3.preco();

        System.out.println("=======================================================================================================");
        System.out.println("Orçamento do preço total do(s) banho(s)");
        System.out.println("=======================================================================================================\n");
        System.out.println("Data do banho: "+formato.format(data)+".");
        System.out.println("Nº de banhos em cachorros de grande porte: "+qtdCachorrosGrandes+".");
        System.out.println("Nº de banhos em cachorros de pequeno porte: "+qtdCachorrosPequenos+".\n");

        System.out.println("Petshop Meu Canino Feliz: R$ "+orcamento1+".");
        System.out.println("Petshop Vai Rex: R$ "+orcamento2+".");
        System.out.println("Petshop Chow Chawgas: R$ "+orcamento3+".\n");

        double melhorOrcamento = compararOrcamento(orcamento1,orcamento2,orcamento3);

        if(melhorOrcamento == orcamento1){
            System.out.println("Considerando preços e distâncias, o melhor petshop é o "+novoBanho1.nome+", com o orçamento de R$ "+melhorOrcamento+" e a distância de "+novoBanho1.retornarDistancia()+" metros até o canil.\n");
        }
        if(melhorOrcamento == orcamento2){
            System.out.println("Considerando preços e distâncias, o melhor petshop é o "+novoBanho2.nome+", com o orçamento de R$ "+melhorOrcamento+" e a distância de "+novoBanho2.retornarDistancia()+" metros até o canil.\n");
        }
        if(melhorOrcamento == orcamento2){
            System.out.println("Considerando preços e distâncias, o melhor petshop é o "+novoBanho2.nome+", com o orçamento de R$ "+melhorOrcamento+" e a distância de "+novoBanho3.retornarDistancia()+" metros até o canil.\n");
        }

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
        System.out.println("Sistema de seleção de petshops");
        System.out.println("=======================================================================================================\n");
        System.out.println("Olá! Bem vindo(a)! Vamos realizar a precificação de cada petshop.");
        System.out.println("Vamos precisar de alguns dados a seguir, tudo bem?\n");
    }

    /**
     * Método para obter uma string de data do banho do usuário.
     * @return Data do banho em formato String.
     */
    static String obterStringData(){
        String dataBanho;
        System.out.println("Qual dia você quer dar banho no seu cachorro? Digite a data prevista (DD/MM/AAAA).");
        dataBanho = teclado.nextLine();
        return dataBanho;
    }

    /**
     * Método para verificar se a data lida é um sábado ou domingo.
     * @param data
     * @return Número inteiro igual a 0 caso seja dia útil e igual a 1 caso seja fim de semana (sábado ou domingo).
     */
    static int verificarFimDeSemana(Calendar data) {
        int banhoEmFimDeSemana = 0;

        // Se o dia do banho for sábado
        if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            banhoEmFimDeSemana = 1;
        }

        // Se o dia do banho for domingo
        if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            banhoEmFimDeSemana = 1;
        }

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

/**
 * Método para obter o menor entre três números diferentes entre si.
 * @param numero1 Primeiro número a ser avaliado.
 * @param numero2 Segundo número a ser avaliado.
 * @param numero3 Terceiro número a ser avaliado.
 * @return Menor número entre três números diferentes entre si.
 */

    static double menorNumero(double numero1, double numero2, double numero3){
    double menor;
    if (numero1 < numero2 && numero1 < numero3) {
        menor = numero1;
    }
    else if(numero2 < numero1 && numero2 < numero3) {
        menor = numero2;
    }
    else {
        menor = numero3;
    }
    return menor;
    }

    static double compararOrcamento(double orcamento1, double orcamento2, double orcamento3){
        double melhorOrcamento = 0.0;

        if ((orcamento1 != orcamento2) && (orcamento2 != orcamento3) && (orcamento3 != orcamento1)) { // Todos os orçamentos diferentes
            melhorOrcamento = menorNumero(orcamento1,orcamento2,orcamento3);
        }

        if ((orcamento1 == orcamento2) && (orcamento2 == orcamento3) ){ // Todos os orçamentos iguais
            melhorOrcamento = orcamento3; //Chow Chawgas (Orçamento 3) possui apenas 800 m de distância
        }

        if (orcamento1 == orcamento2){ // Meu Canino Feliz e Vai Rex iguais
            if (orcamento1 > orcamento3){ // Meu Canino Feliz e Vai Rex ambos mais caros que Chow Chawgas
                melhorOrcamento = orcamento3; // Retorna o menor valor (Chow Chawgas)
            }

            if (orcamento1 < orcamento3){ // Meu Canino Feliz e Vai Rex ambos mais baratos que Chow Chawgas > avaliar a menor distância
            melhorOrcamento = orcamento2; // Retorna a menor distância: Vai Rex (Orçamento 2) possui 1,7 km de distância, menor que Meu Canino Feliz
            }
        }

        if (orcamento2 == orcamento3){ // Vai Rex e Chow Chawgas iguais
            if(orcamento2 > orcamento1){ // Vai Rex e Chow Chawgas ambos mais caros que Meu Canino Feliz
                melhorOrcamento = orcamento1; // Retorna o menor valor (Meu Canino Feliz)
            }

            if(orcamento2 < orcamento1){ // Vai Rex e Chow Chawgas ambos mais baratos que Meu Canino Feliz > avaliar a menor distância
                melhorOrcamento = orcamento3; // Retorna a menor distância: Chow Chawgas (Orçamento 3) possui apenas 800 m de distância, menor que Vai Rex
            }
        }

        if (orcamento3 == orcamento1){ // Chow Chawgas e Meu Canino Feliz iguais
            if(orcamento3 > orcamento2) { // Chow Chawgas e Meu Canino Feliz ambos mais caros que Vai Rex
                melhorOrcamento = orcamento2; // Retorna o menor valor (Vai Rex)
            } 

            if (orcamento3 < orcamento2){  // Chow Chawgas e Meu Canino Feliz ambos mais baratos que Vai Rex > avaliar a menor distância
                melhorOrcamento = orcamento3; // Retorna a menor distância: Chow Chawgas (Orçamento 3) possui apenas 800 m de distância, menor que Meu Canino Feliz
            }
        }
        
        return melhorOrcamento;
    }
}
