package exercicios;

import java.util.Scanner;

/**
Uma sorveteria vende três tipos de picolés. Sabendo-se que o picolé tipo 1 é vendido
por R$ 1,50, o do tipo 2 por R$ 2,00 e o do tipo 3 por R$ 0,75, faça um programa que leia
a quantidade vendida de cada tipo de picolé e apresente o valor arrecadado com as
vendas de cada tipo de picolé e o valor total das vendas.
 */
public class Exercicio7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantPicole1 ,quantPicole2, quantPicole3;
        float totalPicole1, totalPicole2, totalPicole3, valorTotal;
        
        System.out.println("Digite a quantidade de picolé 1 vendido: ");
        quantPicole1 = Integer.parseInt(input.nextLine());

        System.out.println("Digite a quantidade de picolé 2 vendido: ");
        quantPicole2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Digite a quantidade de picolé 3 vendido: ");
        quantPicole3 = Integer.parseInt(input.nextLine());
        
        totalPicole1 = (float) (1.50 * quantPicole1);
        totalPicole2 = (float) (2.0 * quantPicole2);
        totalPicole3 = (float) (0.75 * quantPicole3);
        valorTotal = totalPicole1 + totalPicole2 + totalPicole3;
        
        System.out.println(
                totalPicole1 + " é o valor total do Picole 1.\n" +
                totalPicole2 + " é o valor total do Picole 2.\n" +
                totalPicole3 + " é o valor total do Picole 3.\n" +
                valorTotal + " é o valor total de todos os picolés!" 
        );
    }
}
