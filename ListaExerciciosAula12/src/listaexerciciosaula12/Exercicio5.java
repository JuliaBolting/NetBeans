package listaexerciciosaula12;

import java.util.Scanner;

/**
 * Faça um programa que leia um número inteiro N e passe-o por parâmetro para
 * uma função que deve apresentar uma mensagem indicando se N é par ou ímpar.
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String imparPar;

        System.out.println("Informe um número inteiro:");
        num = Integer.parseInt(input.nextLine());
        
        imparPar = parImpar(num);
        showResults(num, imparPar);
        
    }

    public static String parImpar(int num) {
        if (num % 2 == 0) {
            return "PAR";
        } else {
            return "ÍMPAR";
        }
    }
    
    public static void showResults(int num, String parImpar){
        System.out.println("O número " + num + " é " + parImpar);
    }

}
