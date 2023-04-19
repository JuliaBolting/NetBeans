package exercicioaula7;

import java.util.Scanner;

/**
 * Uma empresa de vendas oferece para seus clientes um desconto de acordo com o
 * valor da compra. Esse desconto é de 20% se o valor da compra for maior que R$
 * 5.000,00, 15% se o valor da compra for maior ou igual a R$ 3.000,00 e menor
 * que R$ 5.000,00 e de 10% caso o valor da compra seja inferior a R$ 3.000,00.
 * Faça um programa que leia o valor da compra e apresente o desconto obtido e o
 * valor final da compra.
 */
public class Exercicio7_2Aula7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valorCompra, desconto, valorFinal;

        System.out.println("Informe o primeiro número: ");
        valorCompra = Float.parseFloat(input.nextLine());

        if (valorCompra > 5000) {
            desconto = valorCompra * 20 / 100;
        } else if (valorCompra >= 3000) {
            desconto = valorCompra * 15 / 100;
        } else {
            desconto = valorCompra * 10 / 100;
        }
        valorFinal = valorCompra - desconto;
        System.out.println(
                "Valor da Compra: " + valorCompra
                + "\nValor do desconto: " + desconto
                + "\nValor com desconto: " + valorFinal
        );

    }

}
