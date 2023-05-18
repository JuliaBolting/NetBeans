package listaexerciciosaula14;

import java.util.Scanner;

/**
A série de RICCI difere da série de FIBONACCI porque os dois primeiros termos são
fornecidos pelo usuário. Os demais termos são gerados da mesma forma que a série de
FIBONACCI. Crie um algoritmo que leia o primeiro termo, o segundo termo e a
quantidade de termos que deve ser apresentada (n). O programa deve calcular e imprimir
os n primeiros termos da série de RICCI e a soma dos termos impressos, sabendo-se que
para existir esta série serão necessários pelo menos três termos. Caso o usuário digite
um valor menor do que três para n, o programa deve solicitar que ele digite o valor
novamente.
 */
public class Exercicio20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum, secondNum, quantTermos;
        
        System.out.println("Informe o primeiro termo: ");
        firstNum = Integer.parseInt(input.nextLine());
        
        System.out.println("Informe o segundo termo: ");
        secondNum = Integer.parseInt(input.nextLine());
        
        System.out.println("Informe o número de termos: ");
        quantTermos = Integer.parseInt(input.nextLine());
        
        System.out.println(firstNum);
        System.out.println(secondNum);
        for(int i = 3; i <= quantTermos; i++){
            System.out.println(numRicc(i));
        }
    }

    public static int numRicc(int num) {
        if(num < 2) return num;
        else return numRicc(num - 1) + numRicc(num - 2);
    }
    
}
