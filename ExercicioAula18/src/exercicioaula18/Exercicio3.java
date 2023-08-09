package exercicioaula18;

import java.util.Arrays;
import java.util.Scanner;

/**
Faça um programa que leia:
– Um vetor com 3 posições, contendo nomes de lojas;
– Um vetor com quatro posições, com nomes de
produtos;
– Uma matriz com os preços de todos os produtos em
cada loja.

● O programa deverá mostrar uma lista com todas as
relações (nome do produto — nome da loja) em que o
preço não ultrapasse R$ 120,00.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] lojas = new String[3];
        String[] produtos = new String[4];
        float[][] precos = new float[3][4];
        
            for(int j = 0; j < 3; j++){
                System.out.println("Informe o nome da loja " + j);
                lojas[j] = input.nextLine();
            }
            System.out.println(Arrays.toString(lojas));
            
            for(int j = 0; j < 4; j++){
                System.out.println("Informe o nome do produto " + j);
                produtos[j] = input.nextLine();
            }
            System.out.println(Arrays.toString(produtos));
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Informe o preco do " + produtos[j] + " na loja " + lojas[i]);
                precos[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        
        System.out.println("\nMatriz digitada: ");
    
        for(int i = 0; i < 3; i++){
        System.out.print(lojas[i] + " - ");
            for(int j = 0; j < 4; j++){
                if(precos[i][j] < 120){
                System.out.print(produtos[j] + " - " + precos[i][j] + " / ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
