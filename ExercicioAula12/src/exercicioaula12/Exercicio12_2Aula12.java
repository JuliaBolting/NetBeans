package exercicioaula12;

import java.util.Scanner;

/**
 * Elabore um programa que leia um número entre 1 e 12 e passe-o para uma função
 * que apresentará o nome do mês correspondente. Caso o usuário digite um valor
 * fora do intervalo especificado, uma mensagem de erro deve ser emitida.
 */
public class Exercicio12_2Aula12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String mes;

        System.out.println("Insira um número inteiro entre 1 e 12: ");
        num = Integer.parseInt(input.nextLine());

        if (num > 12 || num < 1) {
            System.out.println("Número incorreto");
        } else {
            mes = showMes(num);
            showResults(mes);
        }

    }

    public static String showMes(int num) {
        String nomeMes;
        switch (num) {
            case 1 ->
                nomeMes = "Janeiro";
            case 2 ->
                nomeMes = "Fevereiro";
            case 3 ->
                nomeMes = "Março";
            case 4 ->
                nomeMes = "Abril";
            case 5 ->
                nomeMes = "Maio";
            case 6 ->
                nomeMes = "Junho";
            case 7 ->
                nomeMes = "Julho";
            case 8 ->
                nomeMes = "Agosto";
            case 9 ->
                nomeMes = "Setembro";
            case 10 ->
                nomeMes = "Outubro";
            case 11 ->
                nomeMes = "Novembro";
            default ->
                nomeMes = "Dezembro";
        }
        return nomeMes;
    }

    public static void showResults(String mes) {
        System.out.println("O mês correspondente do número inserido é: " + mes);
    }

}
