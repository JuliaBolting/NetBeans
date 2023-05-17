package listaexerciciosaula14;

import java.util.Scanner;

/**
 * Para uma turma de 45 alunos, construa um programa que leia a idade e a altura
 * de cada aluno e determine: a) Quanto alunos tem menos de 18 anos. b) A idade
 * média dos alunos com menos de 1,70m de altura. c) A altura média dos alunos
 * com mais de 20 anos.
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1, idade, quantIdade = 0, idadeTotal = 0, numAlunos = 45;
        float altura, alturaTotal = 0;

        do {

            System.out.println("Informe a idade: ");
            idade = Integer.parseInt(input.nextLine());

            System.out.println("Informe a altura: ");
            altura = Float.parseFloat(input.nextLine());

            if (idade < 18) {
                quantIdade++;
            }
                idadeTotal = idadeTotal + idade;
                alturaTotal = alturaTotal + altura;
            num++;
        } while (num <= numAlunos);

        System.out.println("Alunos menos de 18: " + quantIdade);
        System.out.println("Idade média: " + (idadeTotal / numAlunos));
        System.out.println("Altura média: " + (alturaTotal / numAlunos));

    }

}
