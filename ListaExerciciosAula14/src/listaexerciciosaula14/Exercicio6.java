package listaexerciciosaula14;

import java.util.Scanner;

/**
Uma empresa dará um aumento de salário aos seus funcionários de acordo com a
categoria de cada empregado. O aumento seguirá a seguinte regra:
• Funcionários da categoria A ganharão 10% de aumento sobre o salário;
• Funcionários da categoria B ganharão 12% de aumento sobre o salário;
• Funcionários da categoria C ganharão 14% de aumento sobre o salário;
• Funcionários da categoria D ganharão 16% de aumento sobre o salário;
• Funcionários da categoria E ganharão 18% de aumento sobre o salário;
• Funcionários da categoria F ganharão 20% de aumento sobre o salário;
• Funcionários da categoria G ganharão 22% de aumento sobre o salário;
• Funcionários da categoria H ganharão 24% de aumento sobre o salário;
• Funcionários da categoria I ganharão 26% de aumento sobre o salário;
• Funcionários da categoria J ganharão 28% de aumento sobre o salário;
• Funcionários das demais categorias ganharão 30% de aumento sobre o salário.
Faça um programa que leia quantos funcionários a empresa possui, o nome de
cada funcionário, sua categoria e salário atual e imprima, para cada funcionário, o seu
nome, categoria e salário reajustado. O cálculo do reajuste deve ser feito em uma função.
 */
public class Exercicio6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numFun;
        String nome;
        char categoria;
        float salario;
        
            System.out.println("Informe a quantidade de funcionários: ");
            numFun = Integer.parseInt(input.nextLine());

        do {
            System.out.println("\nInforme o nome do funcionário: ");
            nome = input.nextLine();
            
            System.out.println("Informe a categoria de " + nome + ": ");
            categoria = input.nextLine().charAt(0);
            
            System.out.println("Informe o salário de " + nome + ": ");
            salario = Float.parseFloat(input.nextLine());
            
            salario = novoSalario(salario, categoria);
            
            System.out.println("O novo salario de " + nome + " é R$ " + salario);
            
        } while (numFun <= 100);
    }
    
    public static float novoSalario(float salarioAtual, char categoria){
        salarioAtual = switch (categoria) {
            case 'A' -> salarioAtual + (salarioAtual * 10 / 100);
            case 'B' -> salarioAtual + (salarioAtual * 12 / 100);
            case 'C' -> salarioAtual + (salarioAtual * 14 / 100);
            case 'D' -> salarioAtual + (salarioAtual * 16 / 100);
            case 'E' -> salarioAtual + (salarioAtual * 18 / 100);
            case 'F' -> salarioAtual + (salarioAtual * 20 / 100);
            case 'G' -> salarioAtual + (salarioAtual * 22 / 100);
            case 'H' -> salarioAtual + (salarioAtual * 24 / 100);
            case 'I' -> salarioAtual + (salarioAtual * 26 / 100);
            case 'J' -> salarioAtual + (salarioAtual * 28 / 100);
            default -> salarioAtual + (salarioAtual * 30 / 100);
        };
        return salarioAtual;
    }
    
}
