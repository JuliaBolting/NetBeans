package prova2;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Exercicio2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int termos, num1, num2;

        termos = quantTermos();
        num1 = primeirosTermos(1, 0);
        num2 = primeirosTermos(2, num1);
        gerarSerie(termos, num1, num2);
    }

    public static int quantTermos() {
        int termos;
        do {
            System.out.println("Qual a quantidade de números que deve ser gerado na série? (entre 3 e 100)");
            termos = Integer.parseInt(input.nextLine());

            if (termos > 100 || termos < 3) {
                System.out.println("Valor incorreto");
            }
        } while (termos > 100 || termos < 3);
        return termos;
    }

    public static int primeirosTermos(int termo, int num1) {
        int termos;
        boolean repet = false;

        do {
            System.out.println("Informe o termo " + termo);
            termos = Integer.parseInt(input.nextLine());
            if (termo == 1 && termos < 0) {
                repet = true;
                System.out.println("O primeiro termo deve ser maior que 0");
            }
            if (termo == 2 && termos < num1) {
                repet = true;
                System.out.println("O segundo termos deve ser maior que o primeiro.");
            }
        } while (repet == true);
        return termos;
    }
    
    public static void gerarSerie(int numTermos, int termo1, int termo2){
        int nextTerm, lastTermoPar = termo2, lastTermoImpar = termo1;
        System.out.println("Termos:");
        System.out.println("Termo 1:" + termo1);
        System.out.println("Termo 2:" + termo2);
        
        for(int i = 3; i <= numTermos; i++){
            if(i % 2 == 0){
                nextTerm = lastTermoImpar - lastTermoPar;
                lastTermoPar = nextTerm;
            }else{
                nextTerm = lastTermoImpar + lastTermoPar;
                lastTermoImpar = nextTerm;
            }
        System.out.println("Termo " +i + ":" + nextTerm);
        }
    }

}
