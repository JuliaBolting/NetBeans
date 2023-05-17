package listaexerciciosaula14;

import java.util.Scanner;

/**
O seno de um ângulo A, expresso em radianos, pode ser calculado pela série abaixo:

Faça um programa que leia o valor do ângulo em graus, converta-o para radianos e
calcule o seu seno, utilizando os oito primeiros termos da série acima.
 */
public class Exercicio16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int termos = 0, i = 3;
        float seno, angulo;
        
        System.out.println("Informe o valor do ângulo em graus");
        angulo = Float.parseFloat(input.nextLine());
        angulo = (float) (angulo * (Math.PI / 180));
        
        do{
            seno = (float) (angulo - (Math.pow(angulo, i) / fat(i)));
            i = i + 2;
            termos++;
        }while(termos != 8);
        
        System.out.println("O seno é: " + seno);
    }
    
    public static int fat(int num){
        int fac = num-1;
        do{
            num = num * fac;
            fac--;
        }while(fac != 0);
        return num;
    }
    
}
