package listaexerciciosaula14;

import java.util.Scanner;

/**
 * Sem utilizar a operação de multiplicação, escreva um algoritmo que
 * multiplique dois números inteiros, usando somas sucessivas.
 */
public class Exercicio17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, mult = 0;

        System.out.println("Informe o número 1");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Informe o número 2");
        num2 = Integer.parseInt(input.nextLine());

        do {
            mult = mult + num1;
            num2--;
        } while (num2 != 0);
        
        System.out.println("Multiplicação: " + mult);
    }

}
