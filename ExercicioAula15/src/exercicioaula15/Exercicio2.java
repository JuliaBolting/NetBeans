package exercicioaula15;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Faça um programa que leia um vetor A contendo 10 números inteiros diferentes.
 * Após ler todos os números, o programa deve solicitar que o usuário digite um
 * número a ser pesquisado no vetor. O programa deve verificar se o número
 * existe no vetor e informar uma das seguintes mensagens: O número está
 * cadastrado na posição “X” do vetor; O número NÃO está cadastrado no vetor.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[10];
        int num;
        boolean inVetor = false;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um número para a posição " + i + " do vetor A:");
            vetorA[i] = Integer.parseInt(input.nextLine());
        }

        System.out.println("\nInforme um número para ser pesquisado no vetor: ");
        num = Integer.parseInt(input.nextLine());

        for (int j = 0; j < 10; j++) {
            if (vetorA[j] == num) {
                System.out.println("O número está cadastrado na posição " + j + " do vetor");
                inVetor = true;
            }
        }
        
        if(!inVetor)
            System.out.println("O número NÃO está cadastrado no vetor.");
    }

}
