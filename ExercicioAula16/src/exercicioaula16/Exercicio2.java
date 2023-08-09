package exercicioaula16;

import java.util.Arrays;
import java.util.Scanner;

/**
Faça um programa que leia um conjunto com N
números inteiros. Em seguida o programa deve apresentar os
números lidos. Por fim, ele deve substituir todos os valores
negativos por 0, apresentar o novo conjunto e indicar quantos
valores foram substituídos dentro dele.
 */
public class Exercicio2 {

    static Scanner input = new Scanner(System.in);
    static int count = 0;

    public static void main(String[] args) {
        int tamCon;
        double[] numeros;
        
        System.out.println("Qual o tamanho do conjunto? ");
        tamCon = Integer.parseInt(input.nextLine());
        
        numeros = returnNums(tamCon);
        showNumbersChoose(numeros);
        numeros = newVector(numeros, tamCon);
        showResults(numeros);
    
    }

    public static double[] returnNums(int tamanho) {
        double[] numeros = new double[tamanho];
        for (int i = 0; i <= (tamanho - 1); i++) {
            System.out.println("Digite o número " + i + " do conjunto: ");
            numeros[i] = Integer.parseInt(input.nextLine());
        }
        return numeros;
    }
    
    public static void showNumbersChoose(double [] numeros){
        System.out.println("\nNumeros Escolhidos: ");
        System.out.println("\n" + Arrays.toString(numeros));
    }
    
    public static double[] newVector(double [] numeros, int tamanho){
        for (int i = 0; i <= (tamanho - 1); i++) {
            if(numeros[i] < 0) {
                numeros[i] = 0;
                countNumNegative();
            }
        }
        return numeros;
    }
    
    public static int countNumNegative(){
        return count++;
    }
    
    public static void showResults(double [] numeros){
        System.out.println("Conjunto: " + Arrays.toString(numeros));
        System.out.println("Quantidade de números substituídos: " + count);
    }
    
}