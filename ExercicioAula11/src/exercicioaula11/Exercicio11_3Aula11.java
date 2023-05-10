package exercicioaula11;

import java.util.Scanner;

/**
 * Crie um programa que leia três números inteiros. Este programa deve possuir
 * uma função que recebe um número inteiro por vez e calcula o dobro do valor.
 * Após calcular o dobro dos três valores, os resultados devem ser enviados para
 * uma função responsável por apresentá-los.
 */
public class Exercicio11_3Aula11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, num3, dobro;

        System.out.println("Insira o primeiro número: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Insira o segundo número: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Insira o segundo número: ");
        num3 = Integer.parseInt(input.nextLine());

        dobro = calculoDobro(num1);
        showNumbers(num1, dobro);
        
        dobro = calculoDobro(num2);
        showNumbers(num2, dobro);
        
        dobro = calculoDobro(num3);
        showNumbers(num3, dobro);

    }

    public static int calculoDobro(int numero) {
        int dobro = numero + numero;
        return dobro;
    }

    public static void showNumbers(int numero, int dobro) {
        System.out.println("O dobro de " + numero + " é: " + dobro);
    }

}
