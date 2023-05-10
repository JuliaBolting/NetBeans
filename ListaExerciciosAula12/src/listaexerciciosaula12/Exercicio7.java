package listaexerciciosaula12;

import java.util.Scanner;

/**
Faça um programa que leia o saldo da conta de um cliente e a taxa de juros de um
determinado mês. O programa deve ter uma função que recebe como parâmetro estes
valores, calcula e retorna o novo saldo. Por fim, o programa deve apresentar o novo saldo
da conta após o recebimento do valor correspondente aos juros daquele mês.
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float saldoConta, taxaJuros, newSaldo;
        
        System.out.println("Informe o saldo da sua conta: ");
        saldoConta = Float.parseFloat(input.nextLine());
        
        System.out.println("Informe a taxa de juros: ");
        taxaJuros = Float.parseFloat(input.nextLine());
        
        newSaldo = calcNewSaldo(saldoConta, taxaJuros);
        showResponse(saldoConta, taxaJuros, newSaldo);
    }
    
    public static float calcNewSaldo(float saldo, float taxa){
        float retirar = saldo * taxa / 100;
        return saldo - retirar;
    }
    
    public static void showResponse(float saldo, float taxa, float newSaldo){
        System.out.println("Saldo antigo: " + saldo + "\nTaxa: " + taxa + "\nSaldo após taxa: " + newSaldo);
    }
    
}
