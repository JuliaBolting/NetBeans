package exercicioaula17;

import java.util.Scanner;

/**
Faça um programa que leia o nome e a idade de
várias pessoas e apresente a idade média destas pessoas. O
programa deve ser repetido até que o usuário digite “fim”
como nome (o programa deve ser terminado caso o usuário
digite a palavra fim com letras maiúsculas ou minúsculas). O
programa não deve perguntar a idade da pessoa “fim”.
 */
public class Exercicio1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nome;
        int idade, idadeMedia = 0, count = 0;
        
        do{
            System.out.println("\nInforme seu nome: ");
            nome = input.nextLine();
            if(!nome.equalsIgnoreCase("fim")){
            System.out.println("Informe sua idade: ");
            idade = Integer.parseInt(input.nextLine());
            
            idadeMedia = idadeMedia + idade;
            count++;
            }
        }while(!nome.equalsIgnoreCase("fim"));
        
        idadeMedia = idadeMedia / count;
        System.out.println("Idade média: " + idadeMedia);
    }
    
}
