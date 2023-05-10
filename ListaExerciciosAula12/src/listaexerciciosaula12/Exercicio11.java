package listaexerciciosaula12;

import java.util.Scanner;

/**
O sistema de avaliação de uma disciplina é composto de duas provas e um trabalho.
Para ser aprovado, o aluno deve ter nota igual ou superior a sete no trabalho e nota igual
ou superior a seis em, pelo menos, uma das provas. Observe que não se deve calcular a
média das notas. Faça um programa que leia as três notas do aluno e passe-as para uma
função que deve apresentar se ele deve ser aprovado ou não.
 */
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota1Pro, nota2Pro, notaTrab;
        boolean aprovado;
        
        System.out.println("Informe a nota da primeira prova: ");
        nota1Pro = Integer.parseInt(input.nextLine());
        
        System.out.println("Informe a nota da segunda prova: ");
        nota2Pro = Integer.parseInt(input.nextLine());

        System.out.println("Informe a nota do trabalho");
        notaTrab = Integer.parseInt(input.nextLine());
        
        aprovado = aprovacao(nota1Pro, nota2Pro, notaTrab);
        showResponse(aprovado);
    }
    
    public static boolean aprovacao(int nota1Pro, int nota2Pro, int notaTrab){
        return notaTrab >= 7 && (nota1Pro >= 6 || nota2Pro >= 6);
    }
    
    public static void showResponse(boolean aprovacao){
        System.out.println("Aprovado: " + aprovacao);
    }
    
}
