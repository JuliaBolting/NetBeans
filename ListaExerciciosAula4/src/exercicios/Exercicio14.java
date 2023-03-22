package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa que receba um horário (horas, minutos e segundos) e
 * determine quantos segundos ainda faltam para terminar o dia (considere o dia
 * com 24 horas).
 */
public class Exercicio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horasAtual, minutoAtual, segundoAtual, segundosTotal, segundosAoTodo, segundosFaltantes;

        System.out.println("Digite a hora atual: ");
        horasAtual = Integer.parseInt(input.nextLine());

        System.out.println("Digite o minuto atual: ");
        minutoAtual = Integer.parseInt(input.nextLine());

        System.out.println("Digite o segundo atual: ");
        segundoAtual = Integer.parseInt(input.nextLine());

        segundosTotal = (horasAtual * 3600) + (minutoAtual * 60) + segundoAtual;
        segundosAoTodo = 24 * 3600;
        segundosFaltantes = segundosAoTodo - segundosTotal;

        System.out.println(
                "Com o horário atual " + + horasAtual + "h" + minutoAtual + "m" + segundoAtual + "s\n" 
                + segundosFaltantes + " é o total se segundos para o acabar o dia."
        );
    }

}
