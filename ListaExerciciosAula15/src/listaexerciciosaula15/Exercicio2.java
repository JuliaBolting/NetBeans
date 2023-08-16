package listaexerciciosaula15;

import java.util.Arrays;
import java.util.Scanner;

/**
Faça um programa que leia 10 números inteiros e armazene-os em um vetor A. Em
seguida, ele deve ler outros 10 números inteiros e armazená-los em um vetor B. Por fim, o
programa deve gerar e apresentar o vetor C, com 20 posições. Este vetor vai armazenar
os valores de A e B intercalados, ou seja, na primeira posição de C deve ser armazenado
o primeiro elemento de A, na segunda posição de C deve-se armazenar o primeiro
elemento de B, na terceira posição de C deve-se armazenar o segundo elemento de A e
assim por diante. O programa deve possuir uma função que fará a leitura de cada um dos
vetores (um vetor por vez), uma função para calcular e retornar o vetor C e, por fim, uma
função para apresentar o vetor C.
 */
public class Exercicio2 {
        static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        int [] vetorC = new int[20];
        int number = 0;
        int count = 1;
        
        for(int i = 0; i < 10; i++){
            number = readNumbersA(i);
            vetorA[i] = number;
        }
                
        for(int i = 0; i < 10; i++){
            number = readNumbersB(i);
            vetorB[i] = number;
        }
                
        for(int i = 0; i < 10; i++){
            vetorC[(i*2)] = vetorA[i];
        }
                
        for(int i = 0; i < 10; i++){
            vetorC[(i+count)] = vetorB[i];
            count++;
        }
        
        System.out.println("Vetor A: "+ Arrays.toString(vetorA));
        System.out.println("Vetor B: "+ Arrays.toString(vetorB));
        System.out.println("Vetor C: "+ Arrays.toString(vetorC));
    }
    
    public static int readNumbersA(int index){
        System.out.println("Qual o número da posição "+ index+ " o vetor A?");
        return Integer.parseInt(input.nextLine());
    }
    
    public static int readNumbersB(int index){
        System.out.println("Qual o número da posição "+ index+ " no vetor B?");
        return Integer.parseInt(input.nextLine());
    }
    
}
