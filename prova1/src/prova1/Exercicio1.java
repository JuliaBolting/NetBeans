package prova1;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String produto;
        int quantItens;
        float preco, precoUnit, total;

        System.out.println("Informe o produto: ");
        produto = input.nextLine();

        System.out.println("Informe a quantidade de itens: ");
        quantItens = Integer.parseInt(input.nextLine());

        System.out.println("Informe o preço total: ");
        preco = Float.parseFloat(input.nextLine());

        precoUnit = preco - (preco * 8 / 100);
        total = quantItens * precoUnit;

        System.out.println(
                "\nProduto: " + produto +
                "\nQuantidade: " + quantItens +
                "\nPreço: " + preco +
                "\nPreço unitário: " + precoUnit +
                "\nTotal a pagar: " + total 
        );

    }

}
