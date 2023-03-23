package exercicioaula5;

import java.util.Scanner;

/**
 * Faça um programa que leia o dia, mês e ano atual e o dia, mês e ano do
 * vencimento de uma conta. Os dados que formam a data devem ser lidos
 * separadamente e armazenados em variáveis do tipo int. Em seguida, o programa
 * deve verificar se a conta está vencida ou não.
 */
public class Exercicio3Aula5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int diaAtual, mesAtual, anoAtual, diaVencimento, mesVencimento, anoVencimento;
        boolean vencido;
        String dataAtual, dataVencimento;

        System.out.println("Informe o dia atual: ");
        diaAtual = Integer.parseInt(input.nextLine());

        System.out.println("Informe o mês atual: ");
        mesAtual = Integer.parseInt(input.nextLine());

        System.out.println("Informe o ano atual: ");
        anoAtual = Integer.parseInt(input.nextLine());

        System.out.println("Informe o dia do vencimento: ");
        diaVencimento = Integer.parseInt(input.nextLine());

        System.out.println("Informe o mês do vencimento: ");
        mesVencimento = Integer.parseInt(input.nextLine());

        System.out.println("Informe o ano do vencimento: ");
        anoVencimento = Integer.parseInt(input.nextLine());

        vencido = (anoVencimento < anoAtual) || 
                (anoVencimento == anoAtual && mesVencimento < mesAtual) || 
                (anoVencimento == anoAtual && mesVencimento == mesAtual && diaVencimento < diaAtual);
        
        dataAtual = diaAtual + "/" + mesAtual + "/" + anoAtual;
        dataVencimento = diaVencimento + "/" + mesVencimento + "/" + anoVencimento;

        System.out.println(
                "Para a data atual " + dataAtual + " e a data de vencimento " + dataVencimento
                + "\nO vencimento de sua conta é " + vencido
        );
    }

}
