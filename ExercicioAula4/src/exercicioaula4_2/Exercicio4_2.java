package exercicioaula4_2;

import java.util.Scanner;

//Sabe-se que: 1 pé = 12 polegadas; 1 jarda = 3
//pés e 1 milha = 1760. jarda. Faça um programa que receba uma
//medida em pés, faça as conversões a seguir e mostre os
//resultados em: a) polegadas; b) jardas e c) milhas.

public class Exercicio4_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long pes, polegadas, jardas, milhas;

        System.out.println("Informe a primeira nota:");
        pes = Long.parseLong(input.nextLine());

        polegadas = pes * 12;
        jardas = pes / 3;
        milhas = jardas / 1760;

        System.out.println(
                "Você informou " + 
                        pes + " pes, "
                                + "fazendo a conversão, isso dará\n" + 
                        polegadas + " polegadas\n" + 
                        jardas + " jardas\n" + 
                        milhas + " milhas"
        );

    }
}
