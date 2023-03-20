package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia dois números, 
 * calcule e apresente o quadrado da soma
 * destes números.
 */
public class Exercicio4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 ,num2;
        float sum, quadrado;
        
        System.out.println("Digite o primeiro número inteiro: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Digite o segundo número inteiro: ");
        num2 = Integer.parseInt(input.nextLine());
        
        sum = (num1 + num2);
        quadrado = sum * sum;

        System.out.println(
                quadrado + " é o quadrado da soma dos números escolhidos."
        );
    }
    
}
