package exercicioaula7;

import java.util.Scanner;

/**
 * Faça um programa que leia dois números inteiros e apresente uma das três
 * mensagens: – Os números são iguais. – O primeiro número é o maior. – O
 * segundo número é o maior.
 */
public class Exercicio7_1Aula7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("Informe o primeiro número: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Informe o segundo número: ");
        num2 = Integer.parseInt(input.nextLine());

        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else if (num1 > num2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo é maior");
        }

    }

}
