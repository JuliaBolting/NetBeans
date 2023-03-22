package exercicioaula5;

import java.util.Scanner;

/**
A figura a seguir apresenta a planta de uma
casa e os sensores de presença instalados. Faça um programa
que receba como entrada um valor para cada sensor, indicando
se ele detectou alguém no ambiente (true) ou não (false). O
programa deve gerar como saída um valor booleano indicando
se o alarme deve ser disparado ou não.
● Para ser disparado, basta que qualquer um dos sensores
detecte a presença de alguém. A única exceção é se os
sensores 1, 5 e 6 forem acionados e os demais não, o que
indica que o gato da casa saiu do quarto e foi até a área de
serviço em sua caixa de areia.
 */
public class Exercicio4Aula5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean num1, num2, num3, num4, num5, num6, detectou, gato, total;
                
        System.out.println("Informe a detecção do sensor 1: ");
        num1 = Boolean.parseBoolean(input.nextLine());
        
        System.out.println("Informe a detecção do sensor 2: ");
        num2 = Boolean.parseBoolean(input.nextLine());
        
        System.out.println("Informe a detecção do sensor 3: ");
        num3 = Boolean.parseBoolean(input.nextLine());
        
        System.out.println("Informe a detecção do sensor 4: ");
        num4 = Boolean.parseBoolean(input.nextLine());
        
        System.out.println("Informe a detecção do sensor 5: ");
        num5 = Boolean.parseBoolean(input.nextLine());
        
        System.out.println("Informe a detecção do sensor 6: ");
        num6 = Boolean.parseBoolean(input.nextLine());
        
        detectou = num1 || num2 || num3 || num4 || num5 || num6;
        gato = num1 && num5 && num6;
        total = !gato && detectou;
        
        System.out.println(
                "Disparou: " + total
        );
    }
    
}
