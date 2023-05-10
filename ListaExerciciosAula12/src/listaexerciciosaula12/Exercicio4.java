package listaexerciciosaula12;

import java.util.Scanner;

/**
Escreva um programa que leia a temperatura em graus Celsius e apresente a
temperatura correspondente em graus Fahrenheit, usando a fórmula abaixo. Crie uma
função para fazer a conversão.
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float celsius, fahren;
        
        System.out.println("Informe a temperatura em graus celsius: ");
        celsius = Float.parseFloat(input.nextLine());
        
        fahren = returnFahrenheit(celsius);
        showResponse(celsius, fahren);
    }
    
    private static float returnFahrenheit(float celsius){
        return (((float)9 / 5) * celsius) + 32;
    }
    
    private static void showResponse(float celsius, float fahren){
        System.out.println("Celsius: " + celsius + "\nFahrenheit: " + fahren);
    }
    
}
