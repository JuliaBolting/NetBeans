package exercicioaula16;

import java.util.Scanner;

/**
 * Pesquisadores entrevistaram os habitantes de uma região. Para cada pessoa
 * foram coletados os seguintes dados: idade, gênero (M/F) e salário. Faça um
 * programa que leia a quantidade de entrevistados, os dados de cada um, calcule
 * e apresente: a) a média salarial do grupo. b) a maior e a menor idade do
 * grupo. c) a quantidade de mulheres com salário acima da média. Crie uma
 * função para ler todos os dados e mais uma função para cada item solicitado. O
 * programa deve verificar se a idade digitada está entre 18 e 65 (inclusive),
 * pois esta é a faixa de idade alvo da pesquisa. Se o usuário digitar um valor
 * fora deste intervalo, o programa deve solicitar que ele digite novamente. ● O
 * programa deve verificar se o valor digitado para o gênero é M ou F. Se o
 * usuário digitar um valor diferente, o programa deve solicitar que ele digite
 * novamente. ● O programa deve verificar se o valor digitado está entre R$
 * 1.000,00 e R$ 20.000,00 (inclusive), pois esta é a faixa salarial alvo da
 * pesquisa. Se o usuário digitar um valor fora deste intervalo, o programa deve
 * solicitar que ele digite novamente.
 */
public class Exercicio5 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int quantEntrevistados, idade, count = 0, maiorIdade = 0, menorIdade = 99, women = 0;
        float salario, mediaSalario = 0;
        char genero;

        System.out.println("Informe a quantidade de entrevistados: ");
        quantEntrevistados = Integer.parseInt(input.nextLine());
        double[] womenVector = new double[quantEntrevistados];

        do {
            idade = idade();
            salario = salario();
            genero = genero();

            mediaSalario = mediaSalario + salario;
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (genero == 'F') {
                womenVector[count] = salario;
            }
            count++;
        } while (count != quantEntrevistados);

        mediaSalario = mediaSalario / quantEntrevistados;
        women = womenPower(womenVector, quantEntrevistados, mediaSalario);
        showResponse(mediaSalario, maiorIdade, menorIdade, women);
    }

    public static int idade() {
        int idade;
        do {
            System.out.println("Informe a idade: ");
            idade = Integer.parseInt(input.nextLine());
        } while (idade < 18 || idade > 65);
        return idade;
    }

    public static float salario() {
        float salario;
        do {
            System.out.println("Informe o salario: ");
            salario = Float.parseFloat(input.nextLine());
        } while (salario < 1000 || salario > 20000);
        return salario;
    }

    public static char genero() {
        char genero;
        do {
            System.out.println("Informe o genero: ");
            genero = input.nextLine().charAt(0);
        } while (genero != 'M' && genero != 'F');
        return genero;
    }

    public static int womenPower(double[] womenVector, int quantEnt, float media) {
        int count = 0;
        for (int i = 0; i <= (quantEnt - 1); i++) {
            if (womenVector[i] > media) {
                count++;
            }
        }
        return count;
    }

    public static void showResponse(float media, int maior, int menor, int women) {
        System.out.println("Media salarial: " + media);
        System.out.println("Maior idade: " + maior);
        System.out.println("Menor idade: " + menor);
        System.out.println("Quantidade de mulheres power: " + women);
    }

}
