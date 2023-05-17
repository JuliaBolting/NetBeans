package listaexerciciosaula14;

import java.util.Scanner;

/**
Para um inteiro positivo N informado pelo usuário, construa um algoritmo que informe
se esse valor é primo ou não. Um número inteiro positivo N é primo se não for divisível
exatamente por nenhum valor , exceto o 1 e ele mesmo.
 */
public class Exercicio23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean isDivisivel;
        
        System.out.println("Informe um número inteiro positivo: ");
        num = Integer.parseInt(input.nextLine());
        
        isDivisivel = verifyIfIsDivisivel(num);
        System.out.println("É primo: " + isDivisivel);
        
    }
    
    public static boolean verifyIfIsDivisivel(int num){
        boolean div1 = false, divIt = false;
        if(num % 1 == 0) div1 = true; 
        if(num % num == 0) divIt = true; 
        if(div1 == true && divIt == true){
            for(int i = num; i <= (num + 100); i++){
                if(num % i == 0) return false;
            }
        }else {
            return false;
        }
        return true;
    }
    
}
