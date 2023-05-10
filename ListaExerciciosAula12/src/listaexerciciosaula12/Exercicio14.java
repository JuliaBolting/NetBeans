package listaexerciciosaula12;

import java.util.Scanner;

/**
 * Faça um programa que, para uma conta bancária, leia o seu número, o saldo
 * atual, o tipo de operação a ser realizada (1 - depósito ou 2 - saque) e o
 * valor da operação. Após, o programa deve calcular e apresentar o novo saldo.
 * Se o novo saldo ficar negativo, deve ser mostrada, também, a mensagem “conta
 * estourada”. O programa deve possuir duas funções, uma para realizar os
 * depósitos e outra os saques. As demais tarefas devem ser feitas no programa
 * principal.
 */
public class Exercicio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numConta, saldoAtual, valorFinal;
        int tipoOperacao;

        System.out.println("Informe o número da conta: ");
        numConta = Float.parseFloat(input.nextLine());

        System.out.println("Informe o saldo atual da conta: ");
        saldoAtual = Float.parseFloat(input.nextLine());

        System.out.println("Informe o tipo de operação: \n1 - depósito \n2 - saque");
        tipoOperacao = Integer.parseInt(input.nextLine());

        if (tipoOperacao == 1) {
            valorFinal = deposito(saldoAtual);
        } else {
            valorFinal = saque(saldoAtual);
        }

        if (valorFinal < 0) {
            System.out.println("Conta Estourada!!!");
        }

    }

    public static float deposito(float saldoAtual) {
        Scanner input = new Scanner(System.in);
        float valorDeposito, valorFinal;

        System.out.println("Informe o valor do depósito: ");
        valorDeposito = Float.parseFloat(input.nextLine());

        valorFinal = saldoAtual + valorDeposito;
        System.out.println("Valor atual com o depósito: " + valorFinal);
        return valorFinal;
    }

    public static float saque(float saldoAtual) {
        Scanner input = new Scanner(System.in);
        float valorSaque, valorFinal;

        System.out.println("Informe o valor de saque: ");
        valorSaque = Float.parseFloat(input.nextLine());

        valorFinal = saldoAtual - valorSaque;
        System.out.println("Valor atual com o saque: " + valorFinal);
        return valorFinal;
    }

}
