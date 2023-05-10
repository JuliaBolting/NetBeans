package listaexerciciosaula12;

import java.util.Scanner;

/**
 * Crie um programa que leia as medidas da base e altura de um retângulo,
 * calcule e apresente a área e o perímetro deste retângulo. Crie uma função
 * para calcular a área e outra para calcular o perímetro.
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base, altura, area, perimetro;
        
        System.out.println("Qual a base do retângulo? ");
        base = Float.parseFloat(input.nextLine());
        
        System.out.println("Qual a altura do retângulo? ");
        altura = Float.parseFloat(input.nextLine());
        
        area = calcArea(base, altura);
        perimetro = calcPerimetro(base, altura);
        showResults(base, altura, area, perimetro);

    }

    public static float calcArea(float base, float altura) {
        return base * altura;
    }

    public static float calcPerimetro(float base, float altura) {
        return 2 * (base + altura);
    }

    public static void showResults(float base, float altura, float area, float perimetro) {
        System.out.println(
                "O retângulo com base " + base
                + " e altura " + altura
                + " tem a área de " + area
                + " e o perímetro de " + perimetro
        );
    }

}
