package listaexerciciosaula5;

import java.util.Scanner;

/**
Crie um programa que leia o preço do quilowatt de energia e a quantidade gasta de
quilowatts em uma residência. O programa deve calcular e imprimir o valor a ser pago
pela residência caso a conta seja paga no dia e o valor a ser pago caso a conta seja paga
em atraso. Caso a conta seja paga em atraso, deve-se acrescentar 10% sobre o valor da
conta. O programa não deve perguntar se a conta será paga em atraso ou não, ele deve
sempre calcular e apresentar os dois valores, para que o usuário analise a diferença e
decida se vai pagar a conta em dia ou não.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quilowatt;
        float preco, valorNoDia, valorAtraso, porcentagemAtraso;

        System.out.println("Informe o quilowatt: ");
        quilowatt = Integer.parseInt(input.nextLine());

        System.out.println("Informe o preço do quilowatt: ");
        preco = Float.parseFloat(input.nextLine());
        
        valorNoDia = quilowatt * preco;
        porcentagemAtraso = valorNoDia * 10 / 100;
        valorAtraso = (quilowatt * preco) + porcentagemAtraso;
        
                        System.out.println(
                "Ao pagar no dia, o valor será: " + valorNoDia +
                        "\nAo pagar atrasado, o valor será: " + valorAtraso
        );
    }
}
