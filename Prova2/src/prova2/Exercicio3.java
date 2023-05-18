package prova2;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valorSalarioMinimo, salBruto, salLiq, salBrutoMedio = 0, maiorSal = 0;
        int quantFunEmpresa, quantFunHoras, quantFunHorasExtras, quantDepFun, num = 0;

        System.out.println("Qual o valor do salário mínimo?");
        valorSalarioMinimo = Float.parseFloat(input.nextLine());

        System.out.println("Qual a quantidade de funcionários na empresa?");
        quantFunEmpresa = Integer.parseInt(input.nextLine());

        do {
            System.out.println("Qual a quantidade de horas trabalhadas desse funcionário?");
            quantFunHoras = Integer.parseInt(input.nextLine());

            System.out.println("Qual a quantidade de horas extras?");
            quantFunHorasExtras = Integer.parseInt(input.nextLine());

            System.out.println("Qual a quantidade de dependentes desse funcionário?");
            quantDepFun = Integer.parseInt(input.nextLine());

            salBruto = salBruto(valorSalarioMinimo, quantFunHoras, quantFunHorasExtras, quantDepFun);
            maiorSal = Math.max(maiorSal, salBruto);
            salBrutoMedio = salBrutoMedio + salBruto;
            System.out.println("O salário bruto desse funcionário é de: R$ " + salBruto);

            salLiq = salLiq(salBruto);
            System.out.println("O valor do salário líquido é de: R$ " + salLiq);

            num++;
        } while (num != quantFunEmpresa);

        salBrutoMedio = salBrutoMedio / quantFunEmpresa;
        System.out.println("\nA média dos salários brutos desses funcionários é de: R$ " + salBrutoMedio);
        System.out.println("O maior dos salários brutos desses funcionários é de: R$ " + maiorSal);
    }

    public static float salBruto(float salMinimo, int horas, int horasExt, int depend) {
        float valorHoraTrab, salario, valorHoraExt;
        valorHoraTrab = salMinimo / 10;
        salario = horas * valorHoraTrab;
        salario = salario + (320 * depend);
        valorHoraExt = valorHoraTrab + (valorHoraTrab / 2);
        salario = salario + (valorHoraExt * horasExt);
        return salario;
    }

    public static float salLiq(float salBruto) {
        float salLiq;
        if (salBruto < 2000) {
            salLiq = salBruto;
        } else if (salBruto > 2000 && salBruto < 3999.99) {
            salLiq = salBruto - ((salBruto * 10) / 100);
        } else if (salBruto > 4000 && salBruto < 7999.99) {
            salLiq = salBruto - ((salBruto * 15) / 100);
        } else {
            salLiq = salBruto - ((salBruto * 20) / 100);
        }

        if (salBruto < 5000) {
            salLiq = salLiq - ((salBruto * 8) / 100);
        } else {
            salLiq = salLiq - ((salBruto * 11) / 100);
        }
        return salLiq;
    }

}
