package listaexerciciosaula14;

import java.util.Scanner;

/**
Suponha que a cidade A possui 120 mil habitantes e a cidade B possui 80 mil
habitantes. A população da cidade A cresce a uma taxa de 1,5% ao ano e a cidade B a
uma taxa de 3,5% ao ano. Faça um programa que calcule e apresente em quantos anos a
população da cidade B vai ultrapassar a população da cidade A.
 */
public class Exercicio15 {

    public static void main(String[] args) {
        float cidadeB = 80000, cidadeA = 120000;
        int anos = 0;
        
        do{
            cidadeA = (float) (cidadeA * 1.5);
            cidadeB = (float) (cidadeB * 3.5);
            anos++;
        }while(cidadeB <= cidadeA);
        
        System.out.println(anos);
    }
    
}
