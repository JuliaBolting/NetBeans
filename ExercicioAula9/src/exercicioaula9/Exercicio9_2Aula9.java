/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula9;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Exercicio9_2Aula9 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coeficienteA, coeficienteB, coeficienteC;
        float x, x1, x2;

        System.out.println("Informe o coeficiente A: ");
        coeficienteA = Integer.parseInt(input.nextLine());

        System.out.println("Informe o coeficiente B: ");
        coeficienteB = Integer.parseInt(input.nextLine());

        System.out.println("Informe  o coeficiente C: ");
        coeficienteC = Integer.parseInt(input.nextLine());
        
        x = (float) Math.sqrt(Math.pow(coeficienteB, 2) - (4 * coeficienteA * coeficienteC));
        x1 = (- coeficienteB + x) / (2 * coeficienteA);
        x2 = (- coeficienteB - x) / (2 * coeficienteA);

        System.out.println(
                "x1: " + x1
                + "\nx2: " + x2
        );

    }
    
}
