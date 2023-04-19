package exercicioaula6;

import java.util.Scanner;

/**
 * Crie um programa que leia o preço do quilowatt de energia, a quantidade gasta
 * de quilowatts em uma residência e se a conta está sendo paga em atraso (S) ou
 * não (N). O programa deve calcular e imprimir o valor a ser pago pela
 * residência. Caso a conta seja paga em atraso deve-se acrescentar 10% sobre o
 * valor da conta.
 */
public class Exercicio6_4Aula6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float precoQuil, totalPago;
        int quantGastaQuil;
        char pagaAtraso;

        System.out.println("Informe o preço do quilowatt: ");
        precoQuil = Float.parseFloat(input.nextLine());

        System.out.println("Informe a quantidade gasta de quilowatts: ");
        quantGastaQuil = Integer.parseInt(input.nextLine());

        System.out.println("A conta está sendo paga em atraso? (S/N)");
        pagaAtraso = input.nextLine().charAt(0);

        totalPago = precoQuil * quantGastaQuil;
        
        if (pagaAtraso == 'S' || pagaAtraso == 's') {
            totalPago = totalPago + totalPago * 10 / 100;
        }
            System.out.println("O valor da conta é de: " + totalPago);
        
    }

}
