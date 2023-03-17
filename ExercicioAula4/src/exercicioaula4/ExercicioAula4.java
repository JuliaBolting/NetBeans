package exercicioaula4;

import java.util.Scanner;

public class ExercicioAula4 {

    //Utilizando o NetBeans, crie um programa que
    // receba três notas e seus respectivos pesos, calcule e mostre a
    //media ponderada.
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        float nota1, nota2, nota3, media;
        int peso1, peso2, peso3;

        System.out.println("Informe a primeira nota:");
        nota1 = Float.parseFloat(input.nextLine());

        System.out.println("Informe o peso da primeira nota:");
        peso1 = Integer.parseInt(input.nextLine());

        System.out.println("Informe a segunda nota:");
        nota2 = Float.parseFloat(input.nextLine());

        System.out.println("Informe o peso da segunda nota:");
        peso2 = Integer.parseInt(input.nextLine());

        System.out.println("Informe a terceira nota:");
        nota3 = Float.parseFloat(input.nextLine());

        System.out.println("Informe o peso da terceira nota:");
        peso3 = Integer.parseInt(input.nextLine());

        media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
        System.out.println("Sua média entre todas as notas é " + media);

    }

}
