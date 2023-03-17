package exercicioaula4_3;

import java.util.Scanner;

/*
Faça um programa que leia um número no
formato CDU (Centena, Dezena e Unidade) e imprima-o
invertido (UDC Unidade, Dezena e Centena). O numero deverá
ser armazenado em outra variável antes de ser impresso.
 */

public class Exercicio4_3 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cdu, udc, centena, restoCentena, dezena, unidade;

        System.out.println("Informe um número inteiro:");
        cdu = Integer.parseInt(input.nextLine());

        centena = cdu /  100;
        restoCentena = cdu % 100;
        dezena = restoCentena / 10;
        unidade = restoCentena & 10;
        udc = unidade * 100 + dezena * 10 + centena;

        System.out.println(
                "CDU = " + cdu + "\nUDC = " + udc
        );

    }
}
