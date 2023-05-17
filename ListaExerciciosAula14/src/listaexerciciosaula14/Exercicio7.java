package listaexerciciosaula14;

import java.util.Scanner;

/**
Faça um programa que leia um conjunto de números inteiros maiores que zero (quando
o usuário digitar 0 o programa deve ser encerrado), calcule e apresente:
• Quantos números foram digitados (exceto o 0).
• A soma de todos os números.
• A média de todos os números.
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, somaNum = 0, quantNum = 0;
        
        do{
        System.out.println("Informe um número inteiro");
        num = Integer.parseInt(input.nextLine());
        somaNum = somaNum + num;
        if(num != 0) quantNum++;
        
        }while(num != 0);
        
        System.out.println("Soma: " + somaNum);
        System.out.println("Média: " + (somaNum / quantNum));
    }
    
}
