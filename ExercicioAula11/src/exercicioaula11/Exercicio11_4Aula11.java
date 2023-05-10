package exercicioaula11;

import java.util.Scanner;

/**
Sabe-se que não existe raiz quadrada de
números negativos no domínio dos números reais. Por isto,
associa-se este valor a um número imaginário. Crie um
programa que leia um número inteiro e calcule a sua raiz
quadrada. Caso o valor digitado seja negativo, o programa deve
imprimir uma mensagem “Imaginário”
 */
public class Exercicio11_4Aula11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        float raiz;

        System.out.println("Insira um número inteiro positivo: ");
        num = Integer.parseInt(input.nextLine());
        
        raiz = returnRaiz(num);
        showResponse(num, raiz);
                
    }
    
    public static float returnRaiz(int numero){
        float raiz = (float) Math.sqrt(numero);
        return raiz;
    }

    public static void showResponse(int number, float raiz) {
        String num;
        if(number < 0)
            num = "Imaginário";
        else
            num = Float.toString(raiz);
        System.out.println("A raiz de " + number + " é: " + num);
    }
    
}
