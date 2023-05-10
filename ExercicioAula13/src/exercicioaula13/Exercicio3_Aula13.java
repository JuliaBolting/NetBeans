package exercicioaula13;

import java.util.Scanner;

/**
 * Faça um programa que leia um conjunto com n números inteiros e apresente o
 * maior e o menor número.
 */
public class Exercicio3_Aula13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elementos, maiorEle = 0, menorEle = 10000;

        System.out.println("Insira o número de elementos do conjunto: ");
        elementos = Integer.parseInt(input.nextLine());

        for (int i = 0; i <= (elementos+1); i++) {
            System.out.println("Informe o elemento " + (i + 1));
            elementos = Integer.parseInt(input.nextLine());
            if (maiorEle > elementos) {
                maiorEle = maiorEle;
            } else {
                maiorEle = elementos;
            }
            if (menorEle < elementos) {
                menorEle = menorEle;
            } else {
                menorEle = elementos;
            }
        }
        System.out.println("Maior elemento do conjunto: " + maiorEle);
        System.out.println("Menor elemento do conjunto: " + menorEle);

    }

}
