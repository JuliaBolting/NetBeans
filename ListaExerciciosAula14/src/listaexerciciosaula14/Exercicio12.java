package listaexerciciosaula14;

import java.util.Scanner;

/**
 * Faça um programa que leia um número inteiro positivo (N), calcule e apresente
 * o valor de A, que é dado pela seguinte fórmula:
 */
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int div = 1;
        float valorA = 0, num;

        System.out.println("Informe um número inteiro positivo:");
        num = Float.parseFloat(input.nextLine());

        do {
            valorA = valorA + ((float) 1.0 / div);
            div++;
        } while (div != (num+1));

        System.out.println("Valor de A: " + valorA);

    }

}
