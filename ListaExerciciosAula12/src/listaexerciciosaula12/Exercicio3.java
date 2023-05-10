package listaexerciciosaula12;

import java.util.Scanner;

/**
 * Crie uma função que receba dois números reais como parâmetro e retorne o
 * maior deles. Elabore um programa que leia dois valores e apresente o maior,
 * usando esta função.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1, num2, maior;

        System.out.println("Informe um número:");
        num1 = Float.parseFloat(input.nextLine());

        System.out.println("Informe outro número:");
        num2 = Float.parseFloat(input.nextLine());

        if (num1 == num2) {
            System.out.println("Números iguais");
        } else {
            maior = maiorValor(num1, num2);
            System.out.println("Número " + maior + " é o maior.");

        }
    }

    public static float maiorValor(float num1, float num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

}
