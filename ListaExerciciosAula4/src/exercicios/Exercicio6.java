package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa que leia a temperatura em graus Celsius e apresente
 * atemperatura correspondente em graus Fahrenheit, usando a fórmula abaixo.
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float celsius, fahren;

        System.out.println("Digite a temperatura em grau celsius: ");
        celsius = Integer.parseInt(input.nextLine());

        fahren = (float) (((9.0 / 5.0) * celsius) + 32);

        System.out.println(
                celsius + " em Celsius é\n"
                + fahren + " em Fahrenheit"
        );
    }
}
