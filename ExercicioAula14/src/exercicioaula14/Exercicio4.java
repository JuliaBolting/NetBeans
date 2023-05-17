package exercicioaula14;

import java.util.Scanner;

/**
 * Especialistas estimam que a população de uma cidade fictícia aumenta em 4.000
 * habitantes por ano. Faça um programa que leia a população atual desta cidade
 * e calcule quantos anos ela levará para atingir 500.000 habitantes.
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int popAtual;
        float anos;

        System.out.println("Insira a população atual: ");
        popAtual = Integer.parseInt(input.nextLine());

        anos = (float) Math.ceil((500000 - popAtual) / 4000.0);
        System.out.println("População com 500.000 hab levará " + anos);

    }

}
