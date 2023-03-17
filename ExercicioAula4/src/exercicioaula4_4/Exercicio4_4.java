package exercicioaula4_4;

import java.util.Scanner;

/*
Todo restaurante, normalmente cobra 10%
para o garçom. Faça um algoritmo que leia o valor gasto com
despesas realizadas em um restaurante e imprima o valor total
com a gorjeta.
 */
public class Exercicio4_4 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float valorDespesa, totalGorjeta, total;

        System.out.println("Informe o valor de despesa:");
        valorDespesa = Float.parseFloat(input.nextLine());

        totalGorjeta = (valorDespesa * 10) / 100;
        total = valorDespesa + totalGorjeta;
        
        System.out.println(
                "O valor da despesa foi de " + valorDespesa + 
                        "\nO valor dos 10% de gorjeta seria " + totalGorjeta +
                        "\nAo todo, ficou " + total
        );

    }
}
