package exercicioaula9;

import java.util.Scanner;

/**
Exercicio para testar ERRO DE NEXTINT e etc
NÃO FUNCIONA
 */
public class Exercicio9_1Aula9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        float peso;
        char genero;

        System.out.println("Informe o nome: ");
        nome = input.nextLine();

        System.out.println("Informe  a idade: ");
        idade =input.nextInt();

        System.out.println("Informe  o peso: ");
        peso = input.nextFloat();
        
        System.out.println("Informe  o genero: ");
        genero = input.nextLine().charAt(0);

        System.out.println(
                "Nome: " + nome
                + "\nidade: " + idade
                + "\npeso: " + peso
                + "\ngenero: " + genero
        );

    }

}
