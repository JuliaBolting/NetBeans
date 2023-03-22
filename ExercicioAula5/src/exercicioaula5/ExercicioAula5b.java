package exercicioaula5;

import java.util.Scanner;

/**
 * Altere o programa anterior e pergunte a quantidade de faltas do aluno
 * (inteiro). Para ser aprovado, além de possuir média igual ou superior a 6 o
 * aluno deve ter no máximo 25 faltas.
 */
public class ExercicioAula5b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        boolean aprovacao;
        int faltas;

        System.out.println("Informe a primeira nota: ");
        nota1 = Float.parseFloat(input.nextLine());

        System.out.println("Informe a segunda nota: ");
        nota2 = Float.parseFloat(input.nextLine());

        System.out.println("Informe a terceira nota: ");
        nota3 = Float.parseFloat(input.nextLine());

        System.out.println("Informe a quantidade de faltas: ");
        faltas = Integer.parseInt(input.nextLine());

        media = (nota1 + nota2 + nota3) / 3;
        aprovacao = (media >= 6.0) && (faltas <= 25);

        System.out.println(
                "Sua média é: " + media
                + "\nCom a quantidade de " + faltas + " faltas"
                + "\nSua aprovação é: " + aprovacao
        );

    }

}
