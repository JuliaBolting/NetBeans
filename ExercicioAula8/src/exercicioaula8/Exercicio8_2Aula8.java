package exercicioaula8;

import java.util.Scanner;

/**
 * Faça um programa que leia: – O peso bruto do caminhão em toneladas (peso do
 * caminhão e da carga). – A tara do caminhão em toneladas (peso do caminhão
 * vazio). – O valor pago por tonelada da carga. – O código da região de origem
 * da carga de um caminhão (1 – Sul; 2 – Sudeste; 3 – Centro-Oeste; 4 –
 * Nordeste; 5 – Norte).
 *
 * ● O programa deve calcular e apresentar: – O peso líquido da carga em quilos.
 *
 * – O valor do imposto (Sul - 10% do valor da carga; Sudeste – 12%; Centro-
 * Oeste – 9%; Nordeste – 9.5%; Norte – 8%).
 *
 * – O valor total transportado pelo caminhão, preço da carga mais imposto.
 */
public class Exercicio8_2Aula8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float pesoBruto, tara, valorPorTon, pesoLiq, imposto, valorTotalTransp, carga;
        int codRegiao;

        System.out.println("Informe o peso bruto do caminhão: ");
        pesoBruto = Float.parseFloat(input.nextLine());

        System.out.println("Informe a tara do caminhão: ");
        tara = Float.parseFloat(input.nextLine());

        System.out.println("Insira o valor por tonelada: ");
        valorPorTon = Float.parseFloat(input.nextLine());

        System.out.println("""
                           Insira o código da região: 
                           1 - Sul
                           2 - Sudeste
                           3 - Centro-Oeste
                           4 - Nordeste
                           5 - Norte"""
        );
        codRegiao = Integer.parseInt(input.nextLine());

        pesoLiq = pesoBruto - tara;
        imposto = 0;
        carga = (pesoBruto - tara) * valorPorTon;

        switch (codRegiao) {
            case 1 ->
                imposto = (carga * 10 / 100);
            case 2 ->
                imposto = (carga * 12 / 100);
            case 3 ->
                imposto = (carga * 9 / 100);
            case 4 ->
                imposto = (float) ((float) carga * 9.5 / 100);
            case 5 ->
                imposto = (carga * 8 / 100);
            default ->
                System.out.print("Código da região não encontrado!");
        }
        
        valorTotalTransp = carga + imposto;
        
                System.out.println(
                        "Peso Líquido: " + pesoLiq * 1000
                        + "\nImposto: " + imposto * 1000
                        + "\nValor Total: " + valorTotalTransp * 1000
                );


    }

}
