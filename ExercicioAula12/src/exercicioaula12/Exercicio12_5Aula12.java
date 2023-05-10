package exercicioaula12;

import java.util.Scanner;

/**
 * Um número é denominado palíndromo se a leitura de frente para trás ou de trás
 * para frente for a mesma. Faça um programa que leia um número entre 0 e 9999 e
 * informe se ele é palíndromo ou não. A verificação deve ser feita em uma
 * função que retornará um valor true ou false. Se o usuário digitar um número
 * com menos de 4 dígitos, considere que os primeiros dígitos são 0. Exemplo: –
 * 1 = 0001 – 25 = 0025 – 654 = 0654
 */
public class Exercicio12_5Aula12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num;
        int numLength;
        boolean isPol;

        System.out.println("Insira um número inteiro entre 0 e 9999: ");
        num = input.nextLine();

        //for (int i = 0; num.length() < 4; i++) {
        //    num = "0" + num;
        //}
        if (num.length() > 4) {
            System.out.println("Número inválido!!");
            return;

        }
        if (num.length() != 4) {
            numLength = num.length();
            num = switch (numLength) {
                case 1 ->
                    "000" + num;
                case 2 ->
                    "00" + num;
                default ->
                    "0" + num;
            };
        }
        System.out.println(num);
        isPol = isPolindromo(num);
        returnResponse(isPol);

    }

    public static boolean isPolindromo(String num) {
        return((num.charAt(0) == num.charAt(3)) && (num.charAt(2) == num.charAt(1)));
    }

    public static void returnResponse(boolean isPol) {
        System.out.println("O número é polídromo: " + isPol);

    }

}
