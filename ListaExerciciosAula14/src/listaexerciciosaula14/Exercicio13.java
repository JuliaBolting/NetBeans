package listaexerciciosaula14;

import java.util.Scanner;

/**
 * A série de Fibinacci é formada pela sequência: 0, 1, 1, 2, 3, 5, 8, 13 ...
 * Crie um programa que leia um número inteiro N (entre 3 e 20) e apresente a
 * série de Fibonacci até o enésimo termo. Se o número digitado pelo usuário não
 * estiver entre o intervalo 3 e 20 (inclusive), o programa deve solicitar que
 * ele digite outro número.
 */
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, i = 0;

        do {
            System.out.println("Informe um número inteiro entre 3 e 20");
            num = Integer.parseInt(input.nextLine());
            

            if (num > 20 || num < 3) {
                System.out.println("Número incorreto");
            } else {
                for(i = 0; i < num; i++){
                System.out.println(numFib(i));
                }
            }
        } while (num != i);
    }

    public static int numFib(int num) {
        if(num < 2) return num;
        else return numFib(num - 1) + numFib(num - 2);
    }

}
