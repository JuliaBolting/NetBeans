package listaexerciciosaula14;

import java.util.Scanner;

/**
Considere que para cada aluno de uma universidade, tenha-se as seguintes
informações: nome do aluno, renda mensal da família, gasto com alimentação, gasto com
aluguel e outros gastos. Faça um programa que leia estes dados, calcule e apresente:
a) Para cada aluno:
- Seu gasto total;
- A proporção de gastos com alimentação em relação a sua renda;
- A proporção de gastos com aluguel em relação a sua renda;
b) O gasto médio com alguel.
c) O gasto total médio dos alunos cuja renda familiar é superior a R$ 2000,00.
O programa deve ler e processar a ficha de um aluno e no final perguntar se
deseja-se registrar mais algum aluno (SIM ou NÃO).
 */
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float rendaFamiliar, gastoAlim, gastoAlu, outrosGastos, gastoTotal, propGastoAli, propGastoAlu, medioAluguel = 0, medioGastoTotal = 0;
        String nomeAluno, registro;
        int numAlunos = 0, numAluSup = 0;
        
        do{
        System.out.println("\nNome do aluno:");
        nomeAluno = input.nextLine();
        
        System.out.println("Renda mensal da família:");
        rendaFamiliar = Float.parseFloat(input.nextLine());
        
        System.out.println("Gasto com alimentação:");
        gastoAlim = Float.parseFloat(input.nextLine());
        
        System.out.println("Gasto com aluguel:");
        gastoAlu = Float.parseFloat(input.nextLine());
        
        System.out.println("Outros gastos:");
        outrosGastos = Float.parseFloat(input.nextLine());
        
        gastoTotal = gastoAlim + gastoAlu + outrosGastos;
        propGastoAli = gastoAlim * 100 / rendaFamiliar;
        propGastoAlu = gastoAlu * 100 / rendaFamiliar;
        medioAluguel = medioAluguel + gastoTotal;
        numAlunos++;
        
        if(rendaFamiliar > 2000){
            medioGastoTotal = medioGastoTotal + gastoTotal;
            numAluSup++;
        }
        
        System.out.println("\nAluno " + nomeAluno);
        System.out.println("Gasto Total: " + gastoTotal);
        System.out.println("Proporção de gastos com alimentação em relação a sua renda: %" + propGastoAli);
        System.out.println("Proporção de gastos com aluguel em relação a sua renda: %" + propGastoAlu);
        
        System.out.println("\nQuer registrar mais algum aluno? (SIM, NÃO)");
        registro = input.nextLine();
            
        }while("SIM".equals(registro));
        
        medioAluguel = medioAluguel / numAlunos;
        medioGastoTotal = medioGastoTotal / numAluSup;
        
        System.out.println("Gasto médio: " + medioAluguel);
        System.out.println("Gasto total médio dos alunos cuja renda familiar é superior a R$ 2000,00: " + medioGastoTotal);
    }
    
}
