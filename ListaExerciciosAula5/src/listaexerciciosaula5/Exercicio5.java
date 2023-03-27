package listaexerciciosaula5;

import java.util.Scanner;

/**
O sistema de avaliação de uma disciplina é composto de duas provas e um trabalho.
Para ser aprovado, o aluno precisa ter nota igual ou superior a sete no trabalho e nota
igual ou superior a seis em pelo menos uma das provas. Observe que não se deve
calcular a média das notas. Faça um programa que leia as três notas do aluno e
apresente se ele deve ser aprovado ou não.
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota1, nota2, nota3;
        boolean aprovado;

        System.out.println("Informe sua primeira nota (Prova 1): ");
        nota1 = Integer.parseInt(input.nextLine());

        System.out.println("Informe sua segunda nota (Prova 2): ");
        nota2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Informe sua terceira nota (Trabalho): ");
        nota3 = Integer.parseInt(input.nextLine());
        
        aprovado = (nota3 >= 7) && (nota1 >= 6 || nota2 >= 6);
        
                        System.out.println(
                "Aprovado: " + aprovado 
        );
    }
    
}
