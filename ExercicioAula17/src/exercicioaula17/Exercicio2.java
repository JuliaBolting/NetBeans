/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula17;

import java.util.Scanner;

/**
Altere o programa da atividade 1 para que ele,
após ler os dados de uma pessoa, pergunte se o usuário deseja
digitar os dados de mais alguém. Se o usuário responder “sim”
o programa deve solicitar os novos dados, caso contrário deve
ser encerrado e a média deve ser apresentada.
 */
public class Exercicio2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nome, continuar;
        int idade, idadeMedia = 0, count = 0;
        
        do{
            System.out.println("\nInforme seu nome: ");
            nome = input.nextLine();
            
            System.out.println("Informe sua idade: ");
            idade = Integer.parseInt(input.nextLine());
            
            idadeMedia = idadeMedia + idade;
            count++;
            
            System.out.println("Quer continuar? ");
            continuar = input.nextLine();
        }while(!continuar.equalsIgnoreCase("sim"));
        
        idadeMedia = idadeMedia / count;
        System.out.println("Idade média: " + idadeMedia);
    }
}
