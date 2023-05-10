package exercicioaula11;

import java.util.Scanner;

/**
 * Crie uma nova versão do programa anterior, com uma função que verifique se o
 * preço novo é maior ou igual ao antigo e retorne um valor lógico. Se o preço
 * novo for menor, a função deve apresentar uma mensagem de erro e o programa
 * não deve calcular o valor do acréscimo. ● Nesta versão o valor do acréscimo
 * deve ser apresentado por uma função.
 */
public class Exercicio11_2Aula11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float lPrecoAntigo, lPrecoAtual, lAcrescimo;

        System.out.println("Informe a o preço antigo: ");
        lPrecoAntigo = Float.parseFloat(input.nextLine());

        System.out.println("Informe a o preço atual: ");
        lPrecoAtual = Float.parseFloat(input.nextLine());

        lAcrescimo = calculoAcrescimo(lPrecoAntigo, lPrecoAtual);

        if (!verificarMaiorValor(lPrecoAntigo, lPrecoAtual)) {
            System.out.println("O acréscimo é de: " + Math.rint(lAcrescimo) + " %");
        } else {
            System.out.println("Erro");
        }

    }

    public static float calculoAcrescimo(float aPrecoAntigo, float aPrecoAtual) {
        float lDiferenca = aPrecoAtual - aPrecoAntigo;

        return lDiferenca * 100 / aPrecoAntigo;
    }

    public static boolean verificarMaiorValor(float aPrecoAntigo, float aPrecoAtual) {
        return aPrecoAntigo >= aPrecoAtual;
    }

}
