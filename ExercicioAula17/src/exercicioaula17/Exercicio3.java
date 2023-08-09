/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula17;

import java.util.Scanner;

/**
Faça um programa que leia uma frase, calcule e
apresente a quantidade de vogais existentes nesta frase. O
programa deve contar tanto as vogais maiúsculas quanto as
minúsculas.
 */
public class Exercicio3 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        char [] frase;
        int vogais = 0;
        
        System.out.println("Digite sua frase: ");
        frase = input.nextLine().toUpperCase().toCharArray();
        
        for(int i = 0; i < frase.length; i++){
        if(frase[i] == 'A') vogais++;
        if(frase[i] == 'E') vogais++;
        if(frase[i] == 'I') vogais++;
        if(frase[i] == 'O') vogais++;
        if(frase[i] == 'U') vogais++;
        
    }
        
        System.out.println("Vogais: " + vogais);
    }
}
