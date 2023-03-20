package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia dois números, 
 * calcule e apresente a soma dos quadrados 
 * destes números.
 */
public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 ,num2;
        float sum;
        
        System.out.println("Digite o primeiro número inteiro: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Digite o segundo número inteiro: ");
        num2 = Integer.parseInt(input.nextLine());
        
        sum = (num1 * num1) + (num2 * num2);

        System.out.println(
                sum + " é a soma dos quadrados dos números escolhidos."
        );
    }
}
