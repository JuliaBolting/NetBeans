package listaexerciciosaula15;

import java.util.Arrays;
import java.util.Scanner;

/**
Faça um programa que leia um vetor A (20) e troque o 1o elemento com o último, o 2o
com o penúltimo etc. até o 9o com o 10o. Por fim, o programa deve imprimir os dados do
vetor na nova ordem. Observe que não basta imprimir o vetor na ordem inversa, os
valores devem ser trocados de posição dentro do vetor. Além disto, não se deve usar um
segundo vetor, todo o processo deve ser feito utilizando um único vetor. O programa deve
ter uma única função que fará a troca dos elementos de posição.
 */
public class Exercicio3 {
        static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int [] vetorA = new int[20];
        int number = 0;
        
        for(int i = 0; i < 10; i++){
            number = readNumbersA(i);
            vetorA[i] = number;
        }
        
        System.out.println("Vetor A: "+ Arrays.toString(vetorA));
    }
    
    public static int readNumbersA(int index){
        System.out.println("Qual o número da posição "+ index+ " o vetor A?");
        return Integer.parseInt(input.nextLine());
    }
    
}
