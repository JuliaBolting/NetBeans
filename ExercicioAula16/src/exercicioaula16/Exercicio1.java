package exercicioaula16;

import java.util.Scanner;

/**
 * Refaça o exemplo 1 da aula 15 usando funções. O programa deve ler 20 números
 * reais, calcular a média destes números e apresentar o valor da média e
 * quantos números digitados são maiores ou iguais a média.
 */
public class Exercicio1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double soma, media;
        double[] numeros;
        int count;

        numeros = returnNums();
        soma = calcSoma(numeros);
        media = calcMedia(soma);
        count = countNums(numeros, media);
        showResults(media, count);
    }

    public static double[] returnNums() {
        double[] numeros = new double[20];
        for (int i = 0; i <= 19; i++) {
            System.out.println("Digite o número " + i + " : ");
            numeros[i] = Integer.parseInt(input.nextLine());
        }
        return numeros;
    }

    public static double calcSoma(double[] numeros) {
        double soma = 0;
        for (int i = 0; i <= 19; i++) {
            soma = soma + numeros[i];
        }
        return soma;
    }

    public static double calcMedia(double soma) {
        return soma / 2;
    }

    public static int countNums(double[] numeros, double media) {
        int count = 0;
        for (int j = 0; j <= 19; j++) {
            if (numeros[j] >= media) {
                count++;
            }
        }
        return count;
    }

    public static void showResults(double media, int count) {
        System.out.println("Media: " + media);
        System.out.println("Números maioes ou igual a media: " + count);
    }

}
