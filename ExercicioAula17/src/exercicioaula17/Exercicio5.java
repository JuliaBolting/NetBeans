package exercicioaula17;

import java.util.Scanner;

/**
Faça um programa que leia dois nomes e passe-os
para uma função que deve imprimi-los em ordem alfabética.
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro nome: ");
        String nome1 = input.nextLine();
        System.out.println("Digite o segundo nome: ");
        String nome2 = input.nextLine();
        imprimaOrdemAlfabetica(nome1,nome2);
    }
    
    public static void imprimaOrdemAlfabetica(String nome1,String nome2){
        System.out.println("Nomes em ordem alfabética");
        if (nome1.compareToIgnoreCase(nome2) < 0){
            System.out.println(nome1);
            System.out.println(nome2);       
        }else {
            System.out.println(nome2);
            System.out.println(nome1);   
        }
       
    }
    
}
