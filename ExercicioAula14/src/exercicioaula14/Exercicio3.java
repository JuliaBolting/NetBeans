package exercicioaula14;

import java.util.Scanner;

/**
Crie uma nova versão do programa elaborado
na atividade 2. Nesta versão, após ler, calcular e apresentar
os dados de um cliente, o programa deve perguntar se o
usuário deseja continuar calculando a conta de outros
hóspedes ou não. A resposta do usuário deve ser S ou N.
 */
public class Exercicio3 {
    
    static float hotelAReceber;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int quantDiaria;
        char continuar;

        do{
        System.out.println("\nInsira o nome do hóspede: ");
        nome = input.nextLine();
        
        System.out.println("Insira a quantidade de diárias: ");
        quantDiaria = Integer.parseInt(input.nextLine());
        
        hotelAReceber = hotelAReceber + contaHospede(nome, quantDiaria);
        
        System.out.println("Valor total do Hotel à receber: " + hotelAReceber);
        System.out.println("\nDeseja continuar o calculo dos outros hóspedes? ");
        continuar = input.nextLine().toUpperCase().charAt(0);
        if(continuar != 'S') quantDiaria = 0;
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
