package exercicioaula18;

import java.util.Scanner;

/**
Faça um programa que leia uma matriz [3][4]
de números reais, calcule e apresente:
– A soma de todos os elementos da matriz.
– O maior elemento da matriz e a sua posição.
– A soma de cada linha da matriz.
– A soma de cada coluna da matriz.
● Crie uma função para ler a matriz, mais uma função para
calcular e apresentar cada um dos valores solicitados.
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] matriz = new int [3][4];
        int [] posicaoMaior = new int [2];
        int soma = 0, maior = 0;
    
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Informe a linha " + i + " na coluna " + j);
                matriz[i][j] = Integer.parseInt(input.nextLine());
                soma = soma + matriz[i][j];
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                    posicaoMaior[0] = i;
                    posicaoMaior[1] = j;
                }
            }
        }
        
        System.out.println("\nMatriz digitada: ");
    
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Soma: " + soma);
        System.out.println("Maior elemento: " + maior + " Posição: linha "+ posicaoMaior[0] + " coluna "+ posicaoMaior[1]);
        somaLinhaMatriz(matriz);
        somaColunaMatriz(matriz);
    }
    
    public static void somaLinhaMatriz(int[][] matriz){
        double soma;
        
        for (int[] matriz1 : matriz) {
            soma = 0;
            for (int i = 0; i < matriz[0].length; i++) {
                soma = soma + matriz1[i];
            }
            System.out.println("Soma da Linha: "+ soma);
        }
    }
    
    public static void somaColunaMatriz(int[][] matriz){
        double soma;
        
        for(int i = 0; i < matriz[0].length; i++){
        soma = 0;
            //for(int j = 0; j < matriz.length; j++){
            for (int[] matriz1 : matriz) {
                soma = soma + matriz1[i];
            }
            System.out.println("Soma da Coluna: "+ soma);
        }
    }
    
}
