package listaexerciciosaula12;

import java.util.Scanner;

/**
Faça um programa que leia 3 números inteiros distintos e envie-os para uma função
que retornará o menor deles.
 */
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, maiorNum;
        
        System.out.println("Informe o primeiro número: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Informe o segundo número: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Informe o terceiro número");
        num3 = Integer.parseInt(input.nextLine());
        
        maiorNum = maiorNum(num1, num2, num3);
        showResponse(maiorNum);
    }
    
    public static int maiorNum(int num1, int num2, int num3){
        return Math.min(num3, Math.min(num1, num2));
    }
    
    public static void showResponse(int num){
        System.out.println("O menor número é: " + num);
    }
    
}
