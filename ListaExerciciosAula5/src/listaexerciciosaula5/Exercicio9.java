package listaexerciciosaula5;

import java.util.Scanner;

/**
Escreva um programa que leia o valor da compra e o valor pago pelo cliente. O
programa deve calcular e apresentar, o valor da compra, o valor pago pelo cliente, o valor
do troco e a quantidade de notas que deve ser dada de cada tipo para formar este troco.
O troco deve ser dado de forma a minimizar a quantidade de notas distribuídas.
 */
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valorCompra, valorPago, valorTroco;
        int notas100, notas10, notas1;

        System.out.println("Informe o valor da compra: ");
        valorCompra = Float.parseFloat(input.nextLine());
        
        System.out.println("Informe o valor pago: ");
        valorPago = Float.parseFloat(input.nextLine());
        
        valorTroco = valorPago - valorCompra;
        notas100 = (int) (valorTroco / 100);
        notas10 = (int) ((valorTroco % 100) / 10);
        notas1 = (int) (((valorTroco % 100) % 10) / 1);
        
        
                        System.out.println(
                "\nValor da compra: " + valorCompra + 
                "\nValor pago: " + valorPago +
                "\nValor do troco: " + valorTroco +
                "\nNotas de 100: " + notas100 +
                "\nNotas de 10: " + notas10 +
                "\nNotas de 1: " + notas1
        );
    }
    
}
