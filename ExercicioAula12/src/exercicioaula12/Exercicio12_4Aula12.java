package exercicioaula12;

import java.util.Scanner;

/**
Elabore um programa que leia um número
inteiro e passe-o para uma função que calculará a sua raiz
quadrada. A função deve retornar true se a raiz for um
número inteiro e false se o resultado não for inteiro. Em
seguida, o programa deve apresentar uma mensagem
indicando se o valor da raiz é um número inteiro ou não.
 */
public class Exercicio12_4Aula12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean raizInteira;

        System.out.println("Insira um número inteiro: ");
        num = Integer.parseInt(input.nextLine());
        
        raizInteira = returnRaiz(num);
        showResults(raizInteira);
        
    }
    
    public static boolean returnRaiz(int numero){
        float raiz = (float) Math.sqrt(numero);
        return raiz % 2 == 0;
    }

    public static void showResults(boolean raiz) {
        System.out.println("É uma raiz inteira: " + raiz);
    }
    
}
