package exercicioaula5;

import java.util.Scanner;

/**
Altere o programa anterior e pergunte se o
aluno possui atestado para abonar suas faltas. Se o aluno
tiver mais de 25 faltas, mas tiver um atestado para aboná-
las, ele também será aprovado.
 */
public class ExercicioAula5c {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        boolean aprovacao, atestado;
        int faltas;

        System.out.println("Informe a primeira nota: ");
        nota1 = Float.parseFloat(input.nextLine());

        System.out.println("Informe a segunda nota: ");
        nota2 = Float.parseFloat(input.nextLine());

        System.out.println("Informe a terceira nota: ");
        nota3 = Float.parseFloat(input.nextLine());

        System.out.println("Informe a quantidade de faltas: ");
        faltas = Integer.parseInt(input.nextLine());
        
        System.out.println("Possui atestado para abonar as faltas? Responda com true e false");
        atestado = Boolean.parseBoolean(input.nextLine());

        media = (nota1 + nota2 + nota3) / 3;
        aprovacao = (media >= 6.0) && ((faltas <= 25) || (atestado));

        System.out.println(
                "Sua média é: " + media
                + "\nCom a quantidade de " + faltas + " faltas"
                + "\nSua aprovação é: " + aprovacao
        );

    }
    
}
