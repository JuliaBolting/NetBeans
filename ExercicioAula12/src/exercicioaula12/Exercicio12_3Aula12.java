package exercicioaula12;

import java.util.Scanner;

/**
 * Elabore um programa que leia um caractere e passe-o para uma função que
 * retornará 1 se o caractere lido for uma vogal e 0 se for qualquer outra
 * símbolo. Em seguida, o programa deve apresentar uma mensagem indicando se o
 * caractere lido é uma vogal ou não.
 */
public class Exercicio12_3Aula12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char carac;
        boolean isVogal;

        System.out.println("Informe um caractere: ");
        carac = input.nextLine().charAt(0);
        
        isVogal = verifyIfIsAVogal(carac);
        showResults(isVogal, carac);
        
    }

    public static boolean verifyIfIsAVogal(char caractere) {
        return caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u'
                || caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U';
    }

    public static void showResults(boolean vogal, char carac) {
        System.out.println("O caractere " + carac + " é vogal: " + vogal);
    }

}
