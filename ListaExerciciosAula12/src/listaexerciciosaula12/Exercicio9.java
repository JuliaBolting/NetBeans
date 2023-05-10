package listaexerciciosaula12;

import java.util.Scanner;

/**
Uma revendedora de carros paga a seus vendedores um salário fixo equivalente a dois
salários-mínimos, mais uma comissão de R$ 150,00 por carro vendido e mais uma
comissão de 5% do valor das vendas. Crie um programa que leia o valor do salário-
mínimo, quantos carros o vendedor vendeu ao longo do mês e o valor total das vendas.

Após ler os dados, o programa deve calcular e apresentar o valor do salário do
funcionário. O cálculo do salário deve ser realizado por uma função.
 */
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valorSalMinimo, valorTotalVendas, valorFinal;
        int quantCarros;
        
        System.out.println("Qual o valor do salário mínimo?");
        valorSalMinimo = Float.parseFloat(input.nextLine());
    
        System.out.println("Qual a quantidade de carros perdidas?");
        quantCarros = Integer.parseInt(input.nextLine());
        
        System.out.println("Qual o valor total das vendas?");
        valorTotalVendas = Float.parseFloat(input.nextLine());
        
        valorFinal = calcValorSalario(valorSalMinimo, quantCarros, valorTotalVendas);
        showResponse(valorFinal);
    }
    
    public static float calcValorSalario(float valorSalMinimo, int quantCarros, float valorVendas){
        return (valorSalMinimo * 2) + (150 * quantCarros) + (valorVendas * 5 / 100);
    }
    
    public static void showResponse(float valorFinal){
        System.out.println("O valor do salário é de R$ " + valorFinal);
    }
    
}
