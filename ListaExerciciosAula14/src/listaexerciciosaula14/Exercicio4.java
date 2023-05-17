package listaexerciciosaula14;

import java.util.Scanner;

/**
Faça um programa que leia um número inteiro e apresente a sua tabuada.
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numTabu, num = 0;
        
        System.out.println("Informe um número e mostrarei sua tabuada: ");
        numTabu = Integer.parseInt(input.nextLine());

        do {
            System.out.println(numTabu * num);
            num++;
        } while (num <= 10);

    }
    
}
