package exercicioaula6;

import java.util.Scanner;

/**
 * Faça um programa que leia dois números reais diferentes e mostre o maior
 * deles.
 */
public class Exercicio6_2Aula6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1, num2;

        System.out.println("Informe o número 1: ");
        num1 = Float.parseFloat(input.nextLine());

        System.out.println("Informe o número 2: ");
        num2 = Float.parseFloat(input.nextLine());

        if (num1 > num2) {
            System.out.println("O número 1: " + num1 + " é o maior!!");
        } else {
            System.out.println("O número 2: " + num2 + " é o maior!!");
        }
    }

}
