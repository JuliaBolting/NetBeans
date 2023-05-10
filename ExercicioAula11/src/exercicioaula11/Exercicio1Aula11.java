package exercicioaula11;

import java.util.Scanner;

/**
Faça um programa que receba base, altura, e figura e calcule sua área.
 */
public class Exercicio1Aula11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float base, altura, area;
        char figura;
        
        System.out.println("Informe a figura:\n 1 - Quadrado\n 2 - Triângulo");
        figura = input.nextLine().charAt(0);
        
        System.out.println("Informe a altura");
        altura = Float.parseFloat(input.nextLine());
        
        System.out.println("Informe a base:");
        base = Float.parseFloat(input.nextLine());
        
        if(figura == '1')
            area = (float) Math.rint(base * altura);
        else 
            area = (float) Math.rint(base * altura / 2);
        
        System.out.println("A área é " + area);
    }
    
}
