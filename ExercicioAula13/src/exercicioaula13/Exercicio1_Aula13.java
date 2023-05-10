package exercicioaula13;

import java.util.Scanner;

/**
Faça um programa que peça para o usuário
digitar um número inteiro positivo (n) e imprima a
mensagem bom dia n vezes, da seguinte forma:
 */
public class Exercicio1_Aula13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Insira um número inteiro: ");
        num = Integer.parseInt(input.nextLine());
        
        for(int i = 0; i< num; i++){
        System.out.println(i + 1 + " - Bom dia");
        }
    }
    
}
