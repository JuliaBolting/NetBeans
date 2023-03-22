package exercicios;

import java.util.Scanner;

/**
 * Uma pessoa foi ao supermercado e comprou: Q quilos de café, cujo custo
 * unitário é X; L litros de leite, cujo custo unitário é Y; B pacotes de
 * bolacha, cujo custo unitário é Z. Faça um programa que leia estes dados e
 * imprima, para cada produto: nome do produto, total gasto com ele. Além disto,
 * ele deve apresentar o total gasto na compra.
 */
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float quilosCafe, litrosLeite, pacotesBolacha, precoCafe, precoLeite, precoBolacha,
                total, totalCafe, totalLeite, totalBolacha;
        

        System.out.println("Digite quantos quilos de café foi comprado: ");
        quilosCafe = Float.parseFloat(input.nextLine());

        System.out.println("Digite o valor de cada quilo de café: ");
        precoCafe = Float.parseFloat(input.nextLine());

        totalCafe = quilosCafe * precoCafe;
        

        System.out.println("Digite quantos litros de leite foi comprado: ");
        litrosLeite = Float.parseFloat(input.nextLine());

        System.out.println("Digite o valor de cada litro de leite: ");
        precoLeite = Float.parseFloat(input.nextLine());

        totalLeite = litrosLeite * precoLeite;
        

        System.out.println("Digite quantos pacotes de bolacha foi comprado: ");
        pacotesBolacha = Float.parseFloat(input.nextLine());

        System.out.println("Digite o valor de cada pacote de bolacha: ");
        precoBolacha = Float.parseFloat(input.nextLine());

        totalBolacha = pacotesBolacha * precoBolacha;
        total = totalCafe + totalLeite + totalBolacha;

        System.out.println(
                "Para " + quilosCafe + " quilos de café, ao preço de R$"+ precoCafe + ", o gasto em café foi R$" + totalCafe + " reais" +
                "\nPara " + litrosLeite + " litros de leite, ao preço de R$"+ precoLeite + ", o gasto em leite foi R$" + totalLeite + " reais" +
                "\nPara " + pacotesBolacha + " pacotes de bolacha, ao preço de R$"+ precoBolacha + ", o gasto em bolacha foi R$" + totalBolacha + " reais" +
                "\nAo todo, foi gasto R$" + total + " reais!"
        );
    }

}
