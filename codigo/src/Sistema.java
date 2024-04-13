import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Sistema {
    static Scanner teclado;

// Programa principal Main
    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);
        menuIniciar();
        cachorrosGrandes();
        cachorrosGrandes();
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
    static void textoIntrodutorio() {
        limparTela();
        System.out.println("Sistema de ranking para petshops");
        System.out.println("========================================");
        System.out.println("Olá! Bem vindo(a)! Vamos realizar a precificação de cada petshop.");
    }

    /**
    * Método para introduzir o sistema e descobrir se o banho está previsto para o fim de semana ou dia útil.
    * @return Se o banho será realizado no fim de semana (1) ou em dia útil (0).
    */
    static int menuIniciar() {
        int banhoEmFimDeSemana;
        textoIntrodutorio();
        System.out.println("Vamos precisar de alguns dados a seguir, tudo bem?");
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

    }
