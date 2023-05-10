package exercicioaula11;

import java.util.Scanner;

/**
 Crie um programa que leia os preços antigo e
atual de um produto e chame uma função que determine o
percentual de acréscimo entre esses valores. O resultado deve
ser mostrado no programa principal.
● Suponha que o usuário sempre digitará um valor maior para o
preço atual do que para o preço antigo.
 */
public class Exercicio11_1Aula11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float lPrecoAntigo, lPrecoAtual, lAcrescimo;

        System.out.println("Informe a o preço antigo: ");
        lPrecoAntigo = Float.parseFloat(input.nextLine());

        System.out.println("Informe a o preço atual: ");
        lPrecoAtual = Float.parseFloat(input.nextLine());

        lAcrescimo = calculoAcrescimo(lPrecoAntigo, lPrecoAtual);

        System.out.println("O acréscimo é de: " + lAcrescimo + " %");

    }

    public static float calculoAcrescimo(float aPrecoAntigo, float aPrecoAtual) {
        float lDiferenca = aPrecoAtual - aPrecoAntigo;
        
        return lDiferenca * 100 / aPrecoAntigo;
    }

}
