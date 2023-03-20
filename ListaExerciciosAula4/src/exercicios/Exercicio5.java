package exercicios;

import java.util.Scanner;

/**
 * Crie um programa que leia as medidas da base e altura de um retângulo,
 * calcule e apresente a área e o perímetro deste retângulo.
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base, altura, area, perimetro, ladoAdjacente, ladoOposto;
        String tipoTriangulo;

        System.out.println("Digite a base do triângulo: ");
        base = Float.parseFloat(input.nextLine());

        System.out.println("Digite a altura do triângulo: ");
        altura = Float.parseFloat(input.nextLine());

        System.out.println("É um triângulo equilátero? S / N");
        tipoTriangulo = input.nextLine();

        if ("S".equals(tipoTriangulo)) {
            perimetro = base * 3;
        } else if (!"S".equals(tipoTriangulo) && !"N".equals(tipoTriangulo)) {
            System.out.println("Não foi possível encontrar sua resposta, tente novamente!");
            return;
        } else {
            System.out.println("Informe a medida do lado adjacente: ");
            ladoAdjacente = Float.parseFloat(input.nextLine());

            System.out.println("Informe a medida do lado oposto: ");
            ladoOposto = Float.parseFloat(input.nextLine());

            perimetro = base + ladoAdjacente + ladoOposto;
        }

        area = ((base * altura) / 2);
        
        System.out.println(
                "Para um triângulo de base " + base
                + " e altura " + altura
                + "\nA área é de " + area
                + "\nE o perimetro é de " + perimetro
        );
    }

}
