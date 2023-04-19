package exercicioaula6;

import java.util.Scanner;

/**
 * Faça um programa que leia o preço de um produto e a quantidade comprada. O
 * programa deve calcular e imprimir o valor total da compra. Caso o usuário
 * digite um valor negativo para a quantidade comprada ou para o preço do
 * produtor, programa deve apresentar uma mensagem de erro.
 */
public class Exercicio6_3Aula6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float precoProd, totalCompra;
        int quant;

        System.out.println("Informe o preço do produto: ");
        precoProd = Float.parseFloat(input.nextLine());

        System.out.println("Informe a quantidade do produto: ");
        quant = Integer.parseInt(input.nextLine());

        if (precoProd < 0 || quant < 0) {
            System.out.println("Valores negativos não são permitidos!!");
        } else {
            totalCompra = precoProd * quant;
            System.out.println("O valor total da compra é de: " + totalCompra);
        }
    }

}
