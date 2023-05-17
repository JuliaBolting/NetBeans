package listaexerciciosaula14;

import java.util.Scanner;

/**
Uma empresa classifica seus funcionários em três níveis de acordo com um índice de
produtividade. São eles:
(1) Excelente
(2) Bom
(3) Regular.
Cada nível acrescenta um abono ao salário-base do funcionário, de acordo com a
seguinte tabela:
Excelente - 80% do salário-base.
Bom - 50% do salário-base.
Regular 30% do salário-base.
O algoritmo deve ler a matrícula do funcionário, seu salário base, seu nível e calcular o
salário a ser pago. O algoritmo deve fornecer também a matrícula do funcionário de maior
abono e a média do abono para os funcionários classificados como "Regular". O algoritmo
termina ao ler um valor de matrícula negativo.
 */
public class Exercicio21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long matricula;
        float salBase = 0, salPagar = 0, salMedia = 0;
        int nivel, quantReg = 0;
        
        do{
        System.out.println("Informe a matrícula do funcionário: ");
        matricula = Long.parseLong(input.nextLine());
        
        System.out.println("Informe o nível do funcionário (1, 2 ou 3): ");
        nivel = Integer.parseInt(input.nextLine());
        
        System.out.println("Informe o salário base do funcionário: ");
        salBase = Float.parseFloat(input.nextLine());
        
        if(nivel == 1) {
            salPagar = (salBase * 80) / 100;
        }
        if(nivel == 2) {
            salPagar = (salBase * 50) / 100;
        }
        if(nivel == 3) {
            salPagar = (salBase * 30) / 100;
            salMedia = salMedia + salPagar;
            quantReg++;
        }
        
            System.out.println("Salário a ser pago: " + (salBase + salPagar));
        }while(matricula >= 0);
        
        System.out.println("Média dos abonos dos funcionários 'Regulares': "+ (salMedia / quantReg));
        
    }
    
}
