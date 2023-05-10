package listaexerciciosaula12;

import java.util.Scanner;

/**
 * Faça um programa que leia o peso de uma pessoa (Kg) e sua altura (Metros),
 * calcule e imprima o seu índice de massa corporal, usando a seguinte fórmula:
 * IMC = Peso / Altura2. Além do IMC, o programa deve mostrar se a pessoa está
 * acima do peso ideal (IMC > 25). O cálculo do IMC deve ser feito por uma
 * função.
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float peso, altura, imc;
        String acimaPeso;

        System.out.println("Qual o seu peso?");
        peso = Float.parseFloat(input.nextLine());

        System.out.println("Qual a sua altura?");
        altura = Float.parseFloat(input.nextLine());

        imc = calcIMC(peso, altura);
        if (imc > 25) {
            acimaPeso = "Sim";
        } else {
            acimaPeso = "Não";
        }
        showResponse(imc, acimaPeso);
    }

    public static float calcIMC(float peso, float altura) {
        return peso / (altura * altura);
    }

    public static void showResponse(float imc, String acimaPeso) {
        System.out.println("Seu IMC é: " + imc + "\nEstá acima do peso ideal? " + acimaPeso);
    }

}
