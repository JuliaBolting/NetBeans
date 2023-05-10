package exercicioaula11;

import java.util.Scanner;

/**
 * Elabore um programa que leia as três notas de um aluno e o tipo de média a
 * ser calculada (A – Aritmética, P – Ponderada e G – Geométrica). O programa
 * deve conter uma função que receba as três notas e a letra indicando o tipo de
 * média a ser calculada. A média calculada deve ser retornada ao programa
 * principal para, então, ser mostrada. Se o usuário optar por média ponderada,
 * deve-se usar os pesos: 1, 2 e 2, respectivamente. ● Suponha que o usuário
 * sempre digitará uma das opções corretas para o tipo de média. ● Crie o
 * conjunto de testes para este programa.
 */
public class Exercicio11_5Aula11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nota1, nota2, nota3;
        char tipoMedia;
        float media;

        System.out.println("Insira a primeira nota: ");
        nota1 = Integer.parseInt(input.nextLine());

        System.out.println("Insira a segunda nota: ");
        nota2 = Integer.parseInt(input.nextLine());

        System.out.println("Insira a terceira nota: ");
        nota3 = Integer.parseInt(input.nextLine());

        System.out.println("Qual média quer calcular? \nA – Aritmética, P –Ponderada e G – Geométrica");
        tipoMedia = input.nextLine().charAt(0);

        switch (tipoMedia) {
            case 'A' ->
                media = returnMediaAritmetica(nota1, nota2, nota3);
            case 'P' ->
                media = returnMediaPonderada(nota1, nota2, nota3);
            case 'G' ->
                media = returnMediaGeometrica(nota1, nota2, nota3);
            default -> {
                System.out.println("Média não encontrada, tente novamente!");
                return;
            }
        }

        showResults(media);

    }

    public static float returnMediaAritmetica(int n1, int n2, int n3) {
        float media = (n1 + n2 + n3) / 3;
        return media;
    }

    public static float returnMediaPonderada(int n1, int n2, int n3) {
        float media = ((n1 * 1) + (n2 * 2) + (n3 * 2)) / (1 + 2 + 2);
        return media;
    }

    public static float returnMediaGeometrica(int n1, int n2, int n3) {
        float media = (float) Math.cbrt(n1 * n2 * n3);
        return media;
    }

    public static void showResults(float media) {
        System.out.println("A média é: " + media);
    }

}
