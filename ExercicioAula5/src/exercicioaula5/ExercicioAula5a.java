package exercicioaula5;

import java.util.Scanner;

/**
 * Faça um programa que leia as três notas de um aluno (float), calcule sua
 * média final (média aritmética) e apresente uma mensagem indicando se o aluno
 * foi aprovado ou não. Para ser aprovado o aluno deve ter média igual ou
 * superior a 6.
 */
public class ExercicioAula5a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        boolean aprovacao;

        System.out.println("Informe a primeira nota: ");
        nota1 = Float.parseFloat(input.nextLine());

        System.out.println("Informe a segunda nota: ");
        nota2 = Float.parseFloat(input.nextLine());

        System.out.println("Informe a terceira nota: ");
        nota3 = Float.parseFloat(input.nextLine());

        media = (nota1 + nota2 + nota3) / 3;
        aprovacao = media >= 6.0;

        System.out.println(
                "Sua média é: " + media
                + "\nSua aprovação é: " + aprovacao
        );

    }

}
