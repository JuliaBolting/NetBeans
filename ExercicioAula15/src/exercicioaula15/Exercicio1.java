package exercicioaula15;

import java.util.Arrays;
import java.util.Scanner;

/**
Elabore um programa que leia 8 números inteiros
e armazene-os em um Vetor A. O programa deve gerar um
Vetor B, de mesmo tamanho que A, para armazenar o dobro de
cada um dos valores armazenados em A. Por fim, o programa
deve apresentar os valores armazenados em A e em seguida os
valores armazenados em B.
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[8];
        int[] vetorB = new int[8];
        
        for(int i = 0; i < 8; i++){
            System.out.println("Informe um número para a posição "+ i +" do vetor A:");
            vetorA[i] = Integer.parseInt(input.nextLine());
            
            vetorB[i] = vetorA[i] + vetorA[i];
        }
        
        System.out.println("\n");
        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));
    }
    
}
