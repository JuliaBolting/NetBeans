package exercicioaula13;

import java.util.Scanner;

/**
Faça um programa que leia a quantidade de
alunos de uma turma e idade de cada aluno. Por fim, o
programa deve calcular a idade média da turma, que deve
ser passada para uma função que imprimirá a idade média e
a seguinte mensagem:
– Turma de adultos, se a idade média for igual ou maior que 18
anos.
– Turma de jovens, se a idade média estiver entre 15 e 17 anos.
– Turma de adolescentes, se a idade média estiver entre 12 e
14 anos.
– Turma de crianças, se a idade média for menor que 12 anos.
 */
public class Exercicio2_Aula13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numAlunos, idades;
        float media, somaIdades = 0;

        System.out.println("Insira a quantidade de alunos: ");
        numAlunos = Integer.parseInt(input.nextLine());
        
        for(int i = 0; i < numAlunos; i++){
        System.out.println("Informe a idade do aluno " + (i + 1) );
        idades = Integer.parseInt(input.nextLine());
        somaIdades = somaIdades + idades;
        }
        media = (float) Math.rint(somaIdades / numAlunos);
        
        if(media >= 18){
            System.out.println("Média: " + media + "\nTurma de adultos");
        } else if(media >= 15 && media <= 17){
            System.out.println("Média: " + media + "\nTurma de jovens");
        }else if(media >= 12 && media <= 14){
            System.out.println("Média: " + media + "\nTurma de adolescentes");
        } else {
            System.out.println("Média: " + media + "\nTurma de crianças");
        }
    }
    
}
