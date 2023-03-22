package exercicios;

import java.util.Scanner;

/**
Um restaurante a quilo cobra R$39,00 por quilo de refeição. Escreva um programa
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. 
Obs.O prato vazio pesa 450 gramas.
 */
public class Exercicio12 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float quilosPrato, total;
        
        System.out.println("Qual o peso do prato do cliente em quilos? ");
        quilosPrato = Float.parseFloat(input.nextLine());
        
        total = (float) (0.450 + quilosPrato) * 39;
        
        System.out.println(
                total + " é o valor a pagar do prato."
        );
    }
    
}
