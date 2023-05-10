package exercicioaula13;

import java.util.Scanner;

/**
 * Crie um programa que calcule o fatorial de dois números inteiros positivos e
 * apresente a soma destes valores.
 */
public class Exercicio4_Aula13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, soma1 = 1, soma2 = 1, somaTotal; 

        System.out.println("Insira o primeiro número inteiro: ");
        num1 = Integer.parseInt(input.nextLine());
        
        for(int i=2; i<=num1; i++){
            soma1 = soma1 * i;
        }

        System.out.println("Insira o segundo número inteiro: ");
        num2 = Integer.parseInt(input.nextLine());
        
        for(int i=2; i<=num2; i++){
            soma2 = soma2 * i;
        }
        
        somaTotal = soma1 + soma2;
        
        System.out.println("Soma: " + somaTotal);

    }
}
