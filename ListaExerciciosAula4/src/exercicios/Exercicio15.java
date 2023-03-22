package exercicios;

import java.util.Scanner;

/**
Faça um programa que receba o peso de uma pessoa, calcule e apresente:
a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.
 */
public class Exercicio15 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float peso, engordar, emagrecer;
        
        System.out.println("Qual seu peso? ");
        peso = Float.parseFloat(input.nextLine());
        
        engordar = peso + (peso * 15 / 100);
        emagrecer = peso - (peso * 20 / 100);

        System.out.println(
                "Com o peso de " + peso + 
                        "Kg\n Ao engordar 15%, ficará com " + engordar + 
                        "Kg\n Ao emagrecer 20%, ficará com " + emagrecer + "Kg"
        );
    }
    
}
