package listaexerciciosaula14;

import java.util.Scanner;

/**
Faça um programa que leia um conjunto de números inteiros maiores que zero (quando
o usuário digitar 0 o programa deve ser encerrado), calcule e apresente:
- O maior número digitado;
- O menor número digitado.
 */
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, maiorNum = 0, menorNum = 10000;
        
        do{
        System.out.println("Informe um número inteiro");
        num = Integer.parseInt(input.nextLine());
        if(num != 0){
        maiorNum = Math.max(maiorNum, num);
        menorNum = Math.min(menorNum, num);
        }
        
        }while(num != 0);
        
        System.out.println("Maior número: " + maiorNum);
        System.out.println("Menor número: " + menorNum);
    }
}
