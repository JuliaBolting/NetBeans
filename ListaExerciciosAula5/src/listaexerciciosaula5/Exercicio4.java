package listaexerciciosaula5;

import java.util.Scanner;

/**
Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros), calcule e
imprima o seu índice de massa corporal, usando a seguinte fórmula: IMC = Peso / Altura2
Além do IMC, o programa deve mostrar se a pessoa está acima do peso ideal (IMC > 25).
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float peso, altura, imc;
        boolean acimaPeso;

        System.out.println("Informe seu peso: ");
        peso = Float.parseFloat(input.nextLine());

        System.out.println("Informe sua altura: ");
        altura = Float.parseFloat(input.nextLine());
        
        imc = peso / (altura * altura);
        acimaPeso = imc > 25;
        
                        System.out.println(
                "Seu IMC é: " + imc +
                        "\nEstá acima do peso? " + acimaPeso
        );
    }
    
}
