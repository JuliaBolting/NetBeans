package exercicios;

import java.util.Scanner;

/**
Crie um programa que leia um número inteiro que representa a
quantidade de segundos de um vídeo. O programa deve calcular e apresentar quantas
horas, minutos e segundos dura este vídeo.
 */
public class Exercicio11 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int segundosVideo, horas, minutos, segundos;
        
        System.out.println("Informe o número de segundos do vídeo: ");
        segundosVideo = Integer.parseInt(input.nextLine());
        
        horas = segundosVideo / 3600;
        minutos = (segundosVideo % 3600) / 60;
        segundos = (segundosVideo % 3600) % 60;
        
        System.out.println(
                "Para " + segundosVideo + "segundos, temos:\n" +
                        horas + "h" + minutos + "m" + segundos + "s"
        );
    }
    
}
