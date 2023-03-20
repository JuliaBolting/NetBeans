package exercicios;

import java.util.Scanner;

/**
 * Uma revendedora de carros paga a seus vendedores um salário fixo equivalente
 * a dois salários-mínimos, mais uma comissão de R$ 150,00 por carro vendido e
 * mais uma comissão de 5% do valor das vendas. Crie um programa que leia o
 * valor do salário- mínimo, quantos carros o vendedor vendeu ao longo do mês e
 * o valor total das vendas. Após ler os dados, o programa deve calcular e
 * apresentar o valor do salário do funcionário.
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salMinimo, valorTotalVendas, salFuncionario;
        int quantCarrosVendidos;

        System.out.println("Digite o valor do salário mínino nessa revendedora: ");
        salMinimo = Float.parseFloat(input.nextLine());
        
        System.out.println("Digite o valor total das vendas: ");
        valorTotalVendas = Float.parseFloat(input.nextLine());

        System.out.println("Digite a quantidade de carros vendidos por esse funcionário: ");
        quantCarrosVendidos = Integer.parseInt(input.nextLine());

        salFuncionario = (float) ((float) (salMinimo * 2) + (150.0 * quantCarrosVendidos) + ((valorTotalVendas * 5) / 100));
        
        System.out.println(
                salFuncionario + " é o salário desse funcionário."
        );
    }
}
