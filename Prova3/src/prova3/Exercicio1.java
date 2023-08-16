/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova3;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Exercicio1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n;

        do {
            n = returnSizeMatriz();
        } while (n < 2);

        int[][] matrizA;
        int[][] matrizB;

        matrizA = returnMatrizA(n);
        matrizB = returnMatrizB(matrizA, n);

        showResponse(matrizA, matrizB, n);
    }

    public static int returnSizeMatriz() {
        System.out.println("Informe o tamanho da matriz quadrada maior que 1: ");
        return Integer.parseInt(input.nextLine());
    }

    public static int[][] returnMatrizA(int size) {
        int[][] matrizA = new int[size][size];
            for (int j = 0; j < size; j++) {
        for (int i = 0; i < size; i++) {
                System.out.println("Informe o valor da posição " + i + " na linha " + j);
                matrizA[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        return matrizA;
    }

    public static int[][] returnMatrizB(int[][] matrizA, int size) {
        int[][] matrizB = new int[size][size];
        int linha = 0, coluna = 0;
        for (int i = 0; i < size; i++) {
            for (int j = (size-1); j >= 0; j--) {
                matrizB[i][coluna] = matrizA[i][j];
                coluna++;
            }
            linha++;
            coluna = 0;
        }
        return matrizB;
    }

    public static void showResponse(int[][] matrizA, int[][] matrizB, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrizA[i][j]);
            }
            System.out.println(" ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrizB[i][j]);
            }
            System.out.println(" ");
        }
    }

}
