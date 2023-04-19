package exercicioaula9;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Exercicio9_3Aula9 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valorLataTinta, raio, altura, area, gasto, lateral, base;
        int latas;

        System.out.println("Informe o valor da lata de tinta: ");
        valorLataTinta = Float.parseFloat(input.nextLine());

        System.out.println("Informe o raio do tanque: ");
        raio = Float.parseFloat(input.nextLine());

        System.out.println("Informe a altura do tanque: ");
        altura = Float.parseFloat(input.nextLine());
        
        lateral = (float) (2 * Math.PI * raio * altura);
        base = (float) (2 * Math.PI * Math.pow(raio, 2));
        area = lateral + base;
        latas =  (int) Math.ceil(area / 12);
        gasto = latas * valorLataTinta;

        System.out.println(
                "area: " + area
                + "\nlatas: " + latas
                + "\ngasta: " + gasto
        );

    }
    
}
