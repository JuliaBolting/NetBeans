package listaexerciciosaula12;

import java.util.Scanner;

/**
 * Faça um programa leia o salário bruto e o número de dependentes de um
 * funcionário e calcule o seu salário líquido. Para calcular o salário líquido,
 * deve-se descontar: • INSS, que é de: ◦ 8%, se o salário bruto for até R$
 * 2.000,00; ◦ 11%, se o salário bruto for maior que R$ 2.000,00; • Imposto de
 * renda, que é de: ◦ 0, se o salário bruto for até R$ 2.500,00; ◦ 7,5% se o
 * salário bruto for de R$ 2.500,01 até R$ 5.000,00%; ◦ 15% se o salário bruto
 * for de R$ 5.000,01 até R$ 10.000,00%; ◦ 27% se o salário bruto for acima de
 * R$ 10.000,00; Após os descontos, deve-se adicionar um auxílio de R$ 250,00
 * por dependente. O programa deve ter uma função para calcular o salário
 * líquido, uma função para calcular o desconto com o imposto de renda e outra
 * para calcular o desconto do INSS.
 */
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salBruto, salLiquido;
        int numDependentes;

        System.out.println("Informe o salário bruto: ");
        salBruto = Float.parseFloat(input.nextLine());

        System.out.println("Informe o número de dependentes: ");
        numDependentes = Integer.parseInt(input.nextLine());

        salLiquido = calcSalLiquido(salBruto, numDependentes);
        System.out.println("Salário Liquido: " + salLiquido);

    }

    public static float calcSalLiquido(float salBruto, int numDepend) {
        float salLiq;
        if (salBruto <= 2000) {
            salLiq = salBruto - (salBruto * 8 / 100);
        } else {
            salLiq = salBruto - (salBruto * 11 / 100);
        }
        if (salBruto > 2500 && salBruto <= 5000) {
            salLiq = (float) (salLiq - (salBruto * 7.5 / 100));
        } else if (salBruto > 5000 && salBruto <= 10000) {
            salLiq = salLiq - (salBruto * 15 / 100);
        } else if (salBruto > 10000) {
            salLiq = salLiq - (salBruto * 27 / 100);
        }
        return salLiq + (250 * numDepend);
    }

}
