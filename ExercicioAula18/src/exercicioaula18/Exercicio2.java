package exercicioaula18;

import java.util.Arrays;
import java.util.Scanner;

/**
Uma empresa possui uma planilha com os
registros da conta de energia elétrica de cada uma de suas
filiais. Em cada linha da planilha encontra-se o consumo
dos meses de janeiro a abril de 2021. Considerando que a
empresa possui 3 filiais, faça um programa que leia estes
dados e apresente:
– O consumo total da empresa neste período.
– O consumo de cada filial neste período.
– O consumo da empresa em cada mês deste período.
– O maior consumo da empresa e em qual filial e mês ele
ocorreu.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] meses = new String [] {"Janeiro", "Fevereiro", "Março", "Abril"};
        float [][] matrizConsumo = new float [3][4];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Informe o consumo de " + meses[j] + " na filial " + i);
                matrizConsumo[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        
        System.out.println("\nMatriz digitada: ");
                System.out.print(Arrays.toString(meses));
                System.out.println("");
    
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matrizConsumo[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
