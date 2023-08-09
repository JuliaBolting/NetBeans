package exercicioaula16;

import java.util.Arrays;
import java.util.Scanner;

/**
Faça um programa que leia o gabarito de uma prova
composta por 5 questões objetivas. Em seguida, o programa deve ler
o nome de um aluno, suas respostas e apresentar a quantidade de
acertos deste aluno, juntamente com o seu nome. Após processar os
dados de um aluno o programa deve perguntar se o usuário deseja
continuar ou não.
● O programa deve possuir uma função para fazer a leitura do gabarito
e das respostas de cada aluno. Ambas devem ser armazenadas em
um vetor.
● Além disto, o programa deve possuir uma função que recebe os dois
vetores e calcula a quantidade de acertos.
 */
public class Exercicio3 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[] gabarito, respostaAluno;
        String nomeAluno, continuar;
        int acertosAluno;
        
        gabarito = gabaritoQuestoes();
        
        do{
        nomeAluno = nomeAluno();
        respostaAluno = respostaProvaAluno();
        acertosAluno = acertos(gabarito, respostaAluno);
        showResponse(nomeAluno, respostaAluno, acertosAluno);
        
            System.out.println("\nDeseja verificar outro aluno? (s/n)");
            continuar = input.nextLine();
            
        }while("s".equals(continuar));
    }
    
    public static double[] gabaritoQuestoes(){
        double[] gabarito = new double[5];
        for (int i = 0; i <= 4; i++) {
            System.out.println("Informe o gabarito da prova: Questão "+ (i + 1));
            gabarito[i] = Integer.parseInt(input.nextLine());
        }
        return gabarito;
    }
    
    public static String nomeAluno(){
        System.out.println("\nInforme o nome do aluno: ");
        return input.nextLine();
    }
    
    public static double[] respostaProvaAluno(){
        double[] respostas = new double[5];
        for (int i = 0; i <= 4; i++) {
            System.out.println("Informe a resposta da questão "+ (i + 1));
            respostas[i] = Integer.parseInt(input.nextLine());
        }
        return respostas;
    }
    
    public static int acertos(double [] gabarito, double [] respostaAluno){
        int acerto = 0;
        for (int i = 0; i <= 4; i++) {
            if(gabarito[i] == respostaAluno[i]) acerto++;
        }
        return acerto;
    }
    
    public static void showResponse(String nome, double [] respostasAluno, int acertos){
        System.out.println("\nAluno: " + nome);
        System.out.println("Respostas do aluno: " + Arrays.toString(respostasAluno));
        System.out.println("Acertos do aluno: " + acertos);
    }
}
