package exercicioaula12;

import java.util.Scanner;

/**
Elabore um programa que leia um número
inteiro e armazene-o em uma variável global. Em seguida,
o programa deve ler outro número inteiro, o qual deve ser
passado por parâmetro por uma função que fará a soma
dos dois números lidos. Por fim, o programa deve
apresentar a soma dos valores.
 */
public class Exercicio12_1Aula12 {

    static int num;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num2, soma;
        
        System.out.println("Insira um número inteiro: ");
        num = Integer.parseInt(input.nextLine());
        
        System.out.println("Insira um outro número inteiro: ");
        num2 = Integer.parseInt(input.nextLine());
        
        soma = soma(num, num2);
        showResults(soma);
    }
    
    public static int soma(int num1, int num2){
        return num1 + num2;
    }
    
    public static void showResults(int numero){
        System.out.println("A soma dos dois números é: " + numero);
    }
    
}
