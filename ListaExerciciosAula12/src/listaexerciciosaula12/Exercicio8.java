package listaexerciciosaula12;

import java.util.Scanner;

/**
 * Faça um programa que leia o valor de uma venda e a condição de pagamento,
 * conforme opções abaixo. O programa deve enviar estes dados para uma função
 * que calcula e retorna o valor final da venda, que deve ser apresentado pelo
 * programa. 1 - Venda a Vista - desconto de 10%. 2 - Venda a Prazo 30 dias -
 * desconto de 5%. 3 - Venda a Prazo 60 dias - mesmo preço. 4 - Venda a Prazo 90
 * dias - acréscimo de 5%. 5 - Venda com cartão de débito - desconto de 7%. 6 -
 * Venda com cartão de crédito - desconto de 5%.
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valorVenda, valorFinal;
        int condPag;

        System.out.println("Informe o valor da venda: ");
        valorVenda = Float.parseFloat(input.nextLine());

        System.out.println("""
                           Informe a condição de pagamento: 
                           1 - Venda a Vista - desconto de 10%.
                           2 - Venda a Prazo 30 dias - desconto de 5%.
                           3 - Venda a Prazo 60 dias - mesmo preço.
                           4 - Venda a Prazo 90 dias - acréscimo de 5%.
                           5 - Venda com cartão de débito - desconto de 7%.
                           6 - Venda com cartão de crédito - desconto de 5%.""");
        condPag = Integer.parseInt(input.nextLine());
        
        valorFinal = calcValorFinal(valorVenda, condPag);
        showResults(condPag, valorVenda, valorFinal);
    }

    public static float calcValorFinal(float valor, int condicao) {
        return switch (condicao) {
            case 1 ->
                valor - (valor * 10 / 100);
            case 2 ->
                valor - (valor * 5 / 100);
            case 3 ->
                valor;
            case 4 ->
                valor + (valor * 5 / 100);
            case 5 ->
                valor - (valor * 7 / 100);
            default ->
                valor - (valor * 5 / 100);
        };
    }

    public static void showResults(int pag, float valorVenda, float valorFinal) {
        System.out.println(
                "Valor da venda: " + valorVenda
                + "\nCondição de pagamento escolhida: " + pag
                + "\nValor final: " + valorFinal
        );
    }

}
