package exercicios;

import java.util.Scanner;

/**
Escreva um programa que receba um horário (horas, minutos e segundos) e
determine quantos segundos já se passaram desde que o dia começou.
 */
public class Exercicio13 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horasAtual ,minutoAtual, segundoAtual, segundosTotal;
        
        System.out.println("Digite a hora atual: ");
        horasAtual = Integer.parseInt(input.nextLine());

        System.out.println("Digite o minuto atual: ");
        minutoAtual = Integer.parseInt(input.nextLine());
        
        System.out.println("Digite o segundo atual: ");
        segundoAtual = Integer.parseInt(input.nextLine());
        
        segundosTotal = (horasAtual * 3600) + (minutoAtual * 60) + segundoAtual;

        System.out.println(
                segundosTotal + " é o total se segundos para o horário" + horasAtual + "h" + minutoAtual + "m" + segundoAtual + "s"
        );
    }
    
}
