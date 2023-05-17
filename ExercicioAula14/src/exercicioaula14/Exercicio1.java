package exercicioaula14;

import java.util.Scanner;

/**
Faça um programa que leia o nome e a
idade de uma pessoa e apresente quantos anos esta
pessoa terá daqui cinco anos. A idade digitada deve
ser um valor entre 0 e 100, caso contrário o programa
deve solicitar que o usuário digite a idade novamente.
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Insira seu nome: ");
        nome = input.nextLine();

        do{
        System.out.println("Insira sua idade: ");
        idade = Integer.parseInt(input.nextLine());
        }while(idade < 0 || idade > 100);
        
        System.out.println("A idade de " + nome + " daqui a 5 anos: " + (idade + 5));
        
        
    }
    
}
