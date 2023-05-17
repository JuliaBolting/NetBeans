package listaexerciciosaula14;

import java.util.Scanner;

/**
 * Faça um programa que funcione de forma semelhante a um menu. O programa deve
 * apresentar as opções abaixo na tela e solicitar que o usuário digite a opção
 * desejada: 1 – Inclusão de cliente. 2 – Alteração de cliente. 3 – Exclusão de
 * cliente. 4 – Visualização de cliente. 5 – Sair. Quando o usuário digitar um
 * valor entre 1 e 4, o programa deve apresentar uma mensagem na tela com a
 * função selecionada e apresentar o menu novamente. Se o usuário digitar 5, o
 * programa deve ser encerrado. Se o usuário digitar qualquer outro valor, o
 * programa deve mostrar a mensagem "Opção inválida" e apresentar o menu
 * novamente.
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("""
             \n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                Digite a opção desejada:\n
                1 – Inclusão de cliente.
                2 – Alteração de cliente.
                3 – Exclusão de cliente.
                4 – Visualização de cliente.
                5 – Sair.
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"""
            );
            opcao = Integer.parseInt(input.nextLine());

            if (opcao != 1 || opcao != 2 || opcao != 3 || opcao != 4 || opcao != 5) {
                System.out.println("\nOpção inválida");
            }

            if (opcao == 1) {
                System.out.println("\nOpção escolhida: 1 – Inclusão de cliente");
            }
            if (opcao == 2) {
                System.out.println("\nOpção escolhida: 2 – Alteração de cliente");
            }
            if (opcao == 3) {
                System.out.println("\nOpção escolhida: 3 – Exclusão de cliente");
            }
            if (opcao == 4) {
                System.out.println("\nOpção escolhida: 4 – Visualização de cliente");
            }
        } while (opcao != 5);
    }
}
