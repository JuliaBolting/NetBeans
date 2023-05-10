package listaexerciciosaula12;

import java.util.Scanner;

/**
 * Faça um programa que leia dois números inteiros, calcule e apresente: - Soma
 * dos números. - Subtração do primeiro pelo segundo. - Multiplicação dos
 * números. - Divisão do primeiro pelo segundo. Elabore uma função para efetuar
 * cada operação. As funções devem receber por parâmetro os dois números e
 * retornar o resultado usando o comando return.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, soma, sub, mult;
        float div;

        System.out.println("Informe um número inteiro:");
        num1 = Integer.parseInt(input.nextLine());

        System.out.println("Informe outro número inteiro:");
        num2 = Integer.parseInt(input.nextLine());
        
        soma = somaNums(num1, num2);
        sub = subtracaoNums(num1, num2);
        mult = multiNums(num1, num2);
        div = diviNums(num1, num2);
        showResults(num1, num2, soma, sub, mult, div);

    }
    
    public static int somaNums(int num1, int num2){
        return num1 + num2;
    }
    
    public static int subtracaoNums(int num1, int num2){
        return num1 - num2;
    }
    
    public static int multiNums(int num1, int num2){
        return num1 * num2;
    }
    
    public static float diviNums(int num1, int num2){
        return num1 / num2;
    }

    public static void showResults(int num1, int num2, int soma, int sub, int mult, float div) {
        System.out.println(
                "Números escolhidos: " + num1 + " e " + num2
                + "\nSoma: " + soma
                + "\nSubtração: " + sub
                + "\nMultiplicação: " + mult
                + "\nDivisão: " + div
        );
    }

}
