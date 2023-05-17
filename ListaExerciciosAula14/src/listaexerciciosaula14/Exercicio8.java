package listaexerciciosaula14;

import java.util.Scanner;

/**
Melhore o programa da questão 7 para que ele não aceite que o usuário digite números
menores que 0. Quando isto acontecer, o programa deve solicitar que o usuário digite
novamente o valor e não deve considerar o número negativo nos cálculos.
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, somaNum = 0, quantNum = 0;
        
        do{
        System.out.println("Informe um número inteiro");
        num = Integer.parseInt(input.nextLine());
        if(num >= 0){
        somaNum = somaNum + num;
        if(num != 0) quantNum++;
        }else{
            System.out.println("Número inváido. Tente novamente!");
        }
        
        }while(num != 0);
        
        System.out.println("Soma: " + somaNum);
        System.out.println("Média: " + (somaNum / quantNum));
    }
}
