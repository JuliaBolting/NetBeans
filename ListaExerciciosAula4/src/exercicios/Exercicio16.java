package exercicios;

/**
João recebeu seu salário de R$ 1500,00 e precisa pagar duas contas 
(C1=R$ 200,00 e C2=R$120,00). 
Como as contas estão atrasadas, João terá de pagar multa de 2% sobre
cada conta. Faça um programa que calcule e mostre quanto restará do salário do João.
 */
public class Exercicio16 {
    
    public static void main(String[] args) {
        float restoSalario;
        
        restoSalario = (float) ((float) 1500 - ((200.0 + (200.0 * 2 / 100)) + (120 + (120.0 * 2 /100))));

        System.out.println(
                restoSalario + " é o que sobrará do salário de João."
        );
    }
    
}
