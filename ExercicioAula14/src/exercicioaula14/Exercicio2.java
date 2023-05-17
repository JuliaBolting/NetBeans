package exercicioaula14;

import java.util.Scanner;

/**
Um hotel cobra R$ 150,00 por diária e mais uma
taxa de serviços, que é de:
● R$ 45,00 por diária, se o número de diárias for < 10.
● R$ 25,50 por diária, se o número de diárias for de 10 a 15.
● R$ 10,00 por diária, se o número de diárias for > 15.
Faça um programa que leia o nome e a quantidade de diárias
dos hóspedes que estão saindo do hotel em um dia. Este
programa deve calcular e imprimir o nome e o valor da conta de
cada hóspede, bem como o total a ser recebido pelo hotel neste
dia. O programa deve ser terminado quando o usuário digitar 0
para a quantidade de diárias.
 */
public class Exercicio2 {
    
    static float hotelAReceber;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int quantDiaria;

        do{
        System.out.println("\nInsira o nome do hóspede: ");
        nome = input.nextLine();
        
        System.out.println("Insira a quantidade de diárias: ");
        quantDiaria = Integer.parseInt(input.nextLine());
        
        hotelAReceber = hotelAReceber + contaHospede(nome, quantDiaria);
        
        System.out.println("Valor total do Hotel à receber: " + hotelAReceber);
        }while(quantDiaria != 0);
    }
    
    public static float contaHospede(String nomeHospede, int quantDiaria){
        float aReceber;
        if(quantDiaria < 10)
            aReceber = quantDiaria * 45;
        else if(quantDiaria <= 15)
            aReceber = (float) (quantDiaria * 25.5);
        else
            aReceber = quantDiaria * 10;
        aReceber = aReceber + (150 * quantDiaria);
        System.out.println("\nValor do Hóspede " + nomeHospede + ": " + aReceber);
        return aReceber;
    }
    
}
