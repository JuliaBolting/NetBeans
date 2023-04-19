package exercicioaula7;

import java.util.Scanner;

/**
Um vendedor de um plano de saúde
apresentou a tabela a seguir. Crie um programa que leia o
nome e a idade de uma pessoa e imprima o nome e o valor
que ela deverá pagar:
– até 10 anos -R$ 80,00
– acima de 10 até 29 anos - R$ 120,00
– acima de 29 até 45 anos - R$ 210,00
– acima de 45 até 59 anos - R$ 350,00
– acima de 59 - R$ 450,00
 */
public class Exercicio7_3Aula7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        float valor;

        System.out.println("Informe o seu nome: ");
        nome = input.nextLine();
        
        System.out.println("Informe sua idade: ");
        idade = Integer.parseInt(input.nextLine());

        if (idade <= 10) {
            valor = 80;
        } else if (idade <= 29) {
            valor = 120;
        } else if (idade <= 45) {
            valor = 210;
        } else if(idade <= 59) {
            valor = 450;
        } else {
            valor = 450;
        }
        System.out.println(
                "Nome: " + nome
                + "\nIdade: " + idade
                + "\nValor: " + valor
        );

    }
    
}
