package exercicioaula15;

import java.util.Scanner;

/**
 * Uma empresa possui 12 vendedores e os identifica por um código de 0 a 11. Ela
 * registra em uma tabela todas as vendas do mês, indicando o código do vendedor
 * e o valor da venda. Faça um programa que leia estes dados e no final
 * apresente o total de vendas no mês de cada um dos vendedores. Para terminar o
 * programa, o usuário deve digitar - 1 como código do vendedor.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorVenda = new int[11];
        int cod;

        for (int i = 0; i < 11; i++) {
            vetorVenda[i] = 0;
        }

        do {
            System.out.println("Informe o código do vendedor que gostaria de registrar: ");
            cod = Integer.parseInt(input.nextLine());

            System.out.println("Informe o valor da venda do vendedor com o código " + cod);
            vetorVenda[cod] = (int) (vetorVenda[cod] + Float.parseFloat(input.nextLine()));
            
        } while (cod != 1);
        
        for(int j = 0; j < 11; j++)
        System.out.println("Valor de venda do vendedor " + j + " é : R$ " + vetorVenda[j]);
    }

}
