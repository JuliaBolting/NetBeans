package exercicios;

import java.util.Scanner;

/**
Faça um programa que leia um número inteiro e apresente o quociente e o resto da
divisão deste número por 2.
 */
public class Exercicio10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 ,divisao, resto;
        
        System.out.println("Digite um número inteiro: ");
        num1 = Integer.parseInt(input.nextLine());
        
        divisao = num1 / 2;
        resto = num1 % 2;
        
        System.out.println(
                "Para o número " + num1 + " seu quociente é " + divisao + " e seu resto é " + resto
        );
    }
    
}
