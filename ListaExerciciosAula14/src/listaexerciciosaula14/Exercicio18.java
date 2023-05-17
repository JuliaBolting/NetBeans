package listaexerciciosaula14;

import java.util.Scanner;

/**
 * Uma empresa realizou uma pesquisa sobre a audiência de canal de TV em várias
 * casas de uma cidade. Para cada casa consultada foi informado o número do
 * canal (4, 5, 7 ou 12) que estavam assistindo e o número de pessoas que
 * estavam em frente a TV naquele momento. Se a televisão estivesse desligada,
 * nada era notado, ou seja, essa casa não entrava na pesquisa. Faça um programa
 * que leia um número indeterminado de respostas (número do canal e número de
 * pessoas que estavam assistindo), calcule e mostre a porcentagem de audiência
 * de cada canal. Para encerrar a entrada de dados, digite o número do canal -1.
 */
public class Exercicio18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCanal, numPessoas = 0;
        float percAudi4 = 0, percAudi5 = 0, percAudi7 = 0, percAudi12 = 0, total = 0;

        do {
            System.out.println("Informe o número do canal: ");
            numCanal = Integer.parseInt(input.nextLine());

            System.out.println("Informe o número de pessoas assistindo: ");
            numPessoas = Integer.parseInt(input.nextLine());

            if (numCanal == 4) {
                percAudi4++;
            }
            if (numCanal == 5) {
                percAudi5++;
            }
            if (numCanal == 7) {
                percAudi7++;
            }
            if (numCanal == 12) {
                percAudi12++;
            }

            total = percAudi4 + percAudi5 + percAudi7 + percAudi12;

        } while (numCanal != (-1));

        System.out.println("Percentual de audiência canal 4: " + ((percAudi4 * 100) / total));
        System.out.println("Percentual de audiência canal 5: " + ((percAudi5 * 100) / total));
        System.out.println("Percentual de audiência canal 7: " + ((percAudi7 * 100) / total));
        System.out.println("Percentual de audiência canal 12: " + ((percAudi12 * 100) / total));
    }

}
