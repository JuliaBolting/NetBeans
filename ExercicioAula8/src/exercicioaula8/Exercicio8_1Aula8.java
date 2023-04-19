package exercicioaula8;

import java.util.Scanner;

/**
 * Faça um programa que apresente o menu abaixo e leia o número correspondente à
 * opção selecionada pelo usuário. Em seguida o programa deve apresentar uma
 * mensagem indicando qual foi a opção selecionada. – 1 - Cadastrar cliente – 2
 * - Editar cliente – 3 - Cadastrar produto – 4 - Editar produto – 5 - Efetuar
 * venda – 6 - Sair – Digite a opção desejada
 */
public class Exercicio8_1Aula8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcaoMenu;

        System.out.println("""
                           1 - Cadastrar cliente
                           2 - Editar cliente
                           3 - Cadastrar produto
                           4 - Editar produto
                           5 - Efetuar venda
                           6 - Sair""");

        System.out.println("Selecione uma opção: ");
        opcaoMenu = Integer.parseInt(input.nextLine());

        switch (opcaoMenu) {
            case 1 -> System.out.print("Você escolheu o '1 - Cadastrar cliente'");
            case 2 -> System.out.print("Você escolheu o '2 - Editar cliente'");
            case 3 -> System.out.print("Você escolheu o '3 - Cadastrar produto'");
            case 4 -> System.out.print("Você escolheu o '4 - Editar produto'");
            case 5 -> System.out.print("Você escolheu o '5 - Efetuar venda'");
            case 6 -> System.out.print("Você escolheu o '6 - Sair'");
            default -> System.out.print("Comando não encontrado!");
        }

    }

}
