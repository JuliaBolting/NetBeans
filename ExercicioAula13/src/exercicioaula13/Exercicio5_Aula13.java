package exercicioaula13;

import java.util.Scanner;

/**
 * Crie um programa que calcule a quantidade de combinações que podem ser feitas
 * considerando um conjunto de n elementos agrupados p a p.
 */
public class Exercicio5_Aula13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eleN, eleP, somaN = 1, somaP = 1, ele, somaEle = 1, Total;

        System.out.println("Insira um números de elementos total N: ");
        eleN = Integer.parseInt(input.nextLine());

        System.out.println("Insira um números de elementos do conjunto P: ");
        eleP = Integer.parseInt(input.nextLine());

        for (int i = 2; i <= eleN; i++) {
            somaN = somaN * i;
        }

        for (int i = 2; i <= eleP; i++) {
            somaP = somaP * i;
        }

        ele = eleN - eleP;

        for (int i = 2; i <= ele; i++) {
            somaEle = somaEle * i;
        }

        Total = somaN / (somaP * somaEle);
        System.out.println("Quantidade de combinações: " + Total);

    }

}
