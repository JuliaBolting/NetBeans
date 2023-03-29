package prova1;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valorCompra, valorPago, valorTroco;
        int notas100, notas10, notas1;

        System.out.println("Informe o valor da compra: ");
        valorCompra = Float.parseFloat(input.nextLine());
        
        System.out.println("Informe o valor pago: ");
        valorPago = Float.parseFloat(input.nextLine());

        valorTroco = valorPago - valorCompra;
        notas100 = (int) valorTroco / 100;
        notas10 = (int) (valorTroco % 100) / 10;
        notas1 = (int) ((valorTroco % 100) % 10) / 1;

        System.out.println(
                "\nValor da compra: " + valorCompra +
                "\nValor pago: " + valorPago +
                "\nValorTroco: " + valorTroco +
                "\nNotas de 100: " + notas100 +
                "\nNotas de 10: " + notas10 +
                "\nNotas de 1: " + notas1 
        );

    }
    
}
