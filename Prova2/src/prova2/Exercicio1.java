package prova2;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantFitas, fitasEstragadas;
        float precoFita, valorLocacao, receitaAnual, gastoReporFitas, lucroAnual;

        System.out.println("Qual a quantidade de fitas no acervo no início do ano?");
        quantFitas = Integer.parseInt(input.nextLine());

        System.out.println("Qual o preço de uma fita nova?");
        precoFita = Float.parseFloat(input.nextLine());

        System.out.println("Qual o valor de cobrança por locação durante o ano?");
        valorLocacao = Float.parseFloat(input.nextLine());

        receitaAnual = receitaAnual(quantFitas, valorLocacao);
        fitasEstragadas = fitasEstragadas(quantFitas);
        gastoReporFitas = gastoReporFitas(fitasEstragadas, precoFita);
        lucroAnual = lucroAnual(receitaAnual, gastoReporFitas);
        apresentarValores(receitaAnual, fitasEstragadas, gastoReporFitas, lucroAnual);

    }

    public static float receitaAnual(int quantFita, float valorLocacao) {
        float fitasAlocadas = 0;
        fitasAlocadas = (float) (fitasAlocadas + ((quantFita * 20.0) / 100.0));
        fitasAlocadas = (float) ((float) fitasAlocadas + (2 * ((quantFita * 10.0) / 100.0)));
        fitasAlocadas = (float) ((float) fitasAlocadas + (3 * ((quantFita * 15.0) / 100.0)));
        fitasAlocadas = (float) ((float) fitasAlocadas + (4 * ((quantFita * 25.0) / 100.0)));
        fitasAlocadas = (float) ((float) fitasAlocadas + (5 * ((quantFita * 30.0) / 100.0)));
        return (float) (fitasAlocadas * 12.0) * valorLocacao;
    }

    public static int fitasEstragadas(int quantFitas) {
        return (quantFitas * 3) / 100;
    }

    public static float gastoReporFitas(int fitasEstragadas, float precoFita) {
        return (float) (precoFita * Math.floor(fitasEstragadas / 2));
    }

    public static float lucroAnual(float receita, float custoReposicao) {
        return receita - (custoReposicao + (2500 * 12));
    }

    public static void apresentarValores(float receita, int fitasEst, float custoRep, float lucroAnual) {
        System.out.println("A receita anual da empresa é de: R$ " + receita);
        System.out.println("A quantidade de fitas estragadas é de " + fitasEst);
        System.out.println("O gasto para repor as fitas estragadas é de: R$ " + custoRep);
        System.out.println("O lucro anual da empresa é de: R$ " + lucroAnual);

        if (lucroAnual < 0) {
            System.out.println("Situação Fiananceira: PREJUÍSO");
        } else if (lucroAnual < 36000) {
            System.out.println("Situação Fiananceira: LUCRO BAIXO");
        } else {
            System.out.println("Situação Fiananceira: LUCRO ALTO");
        }
    }
}
