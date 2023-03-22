package exercicioaula5;

import java.util.Scanner;

/**
Crie um programa que leia um determinado
ano e apresente se ele é um ano bissexto ou não. Sabe-se
que para um ano ser bissexto ele deve ser divisível por
quatro, mas não pode ser divisível por 100, a menos que
ele também seja divisível por 400.
 */
public class Exercicio2Aula5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ano;
        boolean bissexto;
        
        //Se não é divisível por 4 mais sim por 100, verificar o 400
        
        System.out.println("Informe um ano: ");
        ano = Integer.parseInt(input.nextLine());
        
        bissexto = (ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0);
        
        System.out.println(
                "O ano " + ano + " é bissexto? " + bissexto
        );
    }
    
}
