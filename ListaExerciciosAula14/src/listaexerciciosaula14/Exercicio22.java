package listaexerciciosaula14;

import java.util.Scanner;

/**
Crie um algoritmo que controle o saldo bancário de um cliente. O algoritmo deve ler o
valor do saldo inicial e em seguida as operações realizadas na conta (código e valor da
operação). As operações podem ser as seguintes:
- Saque em dinheiro (código = 10);
- Depósito (código = 33);
- Pagamento com cartão (código = 4)
Ao ler as operações o algoritmo deve realizar as atualizações na conta, imprimindo uma
mensagem ao usuário com o saldo atual. Quando um pagamento é feito com cartão, uma
taxa de 1.5% é cobrada do cliente.
O algoritmo deve continuar a leitura até que o código de operação seja 0 (zero). Códigos
diferentes dos definidos devem ser ignorados e uma mensagem de erro apresentada. Ao
final do processamento o algoritmo deverá imprimir o saldo e um mensagem indicando se
o cliente está com saldo negativo ou não.
 */
public class Exercicio22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float saldoInicial, operacao, taxa = 0;
        int cod = 0;
        
            System.out.println("Informe o saldo inicial: ");
            saldoInicial = Float.parseFloat(input.nextLine());
        
        do{
            System.out.println("""
                               Informe o código:
                               10 - Saque
                               33 - Deposito
                               04 - Pagamento com cartão""");
            cod = Integer.parseInt(input.nextLine());
            
            System.out.println("Informe o valor da operação: ");
            operacao = Float.parseFloat(input.nextLine());
            
            if(cod == 10){
                saldoInicial = saldoInicial - operacao;
            }
            if(cod == 33){
                saldoInicial = saldoInicial + operacao;
            }
            if(cod == 4){
                taxa = (float) ((operacao * 1.5) / 100);
                saldoInicial = saldoInicial - (operacao + taxa);
            }
            
            System.out.println("Saldo: "+ saldoInicial);
        }while(cod != 0);
    }
    
}
