package exercicios;

import java.util.Scanner;

/**
 * Crie um programa que leia as medidas da base e altura de um retângulo,
 * calcule e apresente a área e o perímetro deste retângulo.
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base, altura, area, perimetro;

        System.out.println("Digite a base do retângulo: ");
        base = Float.parseFloat(input.nextLine());

        System.out.println("Digite a altura do retângulo: ");
        altura = Float.parseFloat(input.nextLine());

        perimetro = 2 * base + 2 * altura;
        area = base * altura;

        System.out.println(
                "Para um retângulo de base " + base
                + " e altura " + altura
                + "\nA área é de " + area
                + "\nE o perimetro é de " + perimetro
        );
    }

}
