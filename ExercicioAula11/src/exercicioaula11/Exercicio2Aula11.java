package exercicioaula11;

import java.util.Scanner;

/**
Faça um programa que leia dois números inteiros e mostre a diferença positiva entre eles
 */
public class Exercicio2Aula11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2, diferenca;
        
        System.out.println("Informe o primeiro número:");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Informe o segundo número:");
        num2 = Integer.parseInt(input.nextLine());
        
        if(num1 > num2)
            diferenca = num1 - num2;
        else 
            diferenca = num2 - num1;
        
        System.out.println(""
                + "A diferença entre " + num1
                + " e " + num2 + " é: " + diferenca
        );
    }
    
}
