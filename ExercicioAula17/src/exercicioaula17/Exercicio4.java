/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula17;

import java.util.Scanner;

/**
Faça um programa que leia uma mensagem e
criptografe-a trocando as seguintes letras:
– A por X e vice-versa;
– E por Y e vice-versa;
– I por W e vice-versa;
– O por K e vice-versa;
– U por Z e vice-versa.
● O programa deve imprimir a mensagem original e a
criptografada que será escrita toda com letras maiúsculas.
 */
public class Exercicio4 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        char [] message;
        
        System.out.println("Informe uma mensagem: ");
        message = input.nextLine().toUpperCase().toCharArray();
        
        for(int i = 0; i < message.length; i++){
            switch (message[i]) {
                case 'A':
                    message[i] = 'X';
                    break;
                case 'E':
                    message[i] = 'Y';
                    break;
                case 'I':
                    message[i] = 'W';
                    break;
                case 'O':
                    message[i] = 'K';
                    break;
                case 'U':
                    message[i] = 'Z';
                    break;
                case 'X':
                    message[i] = 'A';
                    break;
                case 'Y':
                    message[i] = 'E';
                    break;
                case 'W':
                    message[i] = 'I';
                    break;
                case 'K':
                    message[i] = 'O';
                    break;
                case 'Z':
                    message[i] = 'U';
                    break;
                default:
                    break;
            }
        }
        
        System.out.println(message);
    }
}
