package exercicioaula16;

import java.util.Arrays;
import java.util.Scanner;

/**
Refaça o programa da atividade 2, para que o n
possa ser lido dentro da função de leitura de dados e não no
main. Além disto, o valor de n não deve ser retornado para a
função main.
 */
public class Exercicio2b {

    static Scanner input = new Scanner(System.in);
    static int count = 0;

    public static void main(String[] args) {
        double[] numeros;
        
        numeros = returnNums();
        showNumbersChoose(numeros);
        numeros = newVector(numeros);
        showResults(numeros);
    
    }

    public static double[] returnNums() {
        int tamCon;
        System.out.println("Qual o tamanho do conjunto? ");
        tamCon = Integer.parseInt(input.nextLine());
        
        double[] numeros = new double[tamCon];
        for (int i = 0; i <= (tamCon - 1); i++) {
            System.out.println("Digite o número " + i + " do conjunto: ");
            numeros[i] = Integer.parseInt(input.nextLine());
        }
        return numeros;
    }
    
    public static void showNumbersChoose(double [] numeros){
        System.out.println("\nNumeros Escolhidos: ");
        System.out.println("\n" + Arrays.toString(numeros));
    }
    
    public static double[] newVector(double [] numeros){
        int tamanho = numeros.length;
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
