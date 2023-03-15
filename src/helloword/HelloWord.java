package helloword;

import java.util.Scanner;

public class HelloWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, year, weight, genere, matriculate, isMatriculate;
        char firstWordGenere;

        System.out.println("Digite seu nome: ");
        name = input.nextLine();

        System.out.println("Digite sua idade: ");
        year = input.nextLine();

        System.out.println("Digite seu peso: ");
        weight = input.nextLine();

        System.out.println("Digite seu gênero: ");
        genere = input.nextLine();
        firstWordGenere = genere.charAt(0);

        System.out.println("Você está matriculado no curso de informática?");
        matriculate = input.nextLine();

        if ("Sim".equals(matriculate)
                || "sim".equals(matriculate)
                || "S".equals(matriculate)
                || "s".equals(matriculate)) {
            isMatriculate = "";
        } else {
            isMatriculate = "não ";
        }
        if ("f".equals(firstWordGenere)) {
            firstWordGenere = "F";
        }

        System.out.println(
                name + ", sua idade é de " + year
                + ", com o peso de " + weight
                + ", e gênero " + genere + "(" + firstWordGenere + ")"
                + "\nVocê " + isMatriculate + "está matriculado no curso."
        );

    }

}
