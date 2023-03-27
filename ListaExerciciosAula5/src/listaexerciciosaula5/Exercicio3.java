package listaexerciciosaula5;

import java.util.Scanner;

/**
Crie uma nova versão do programa da questão 2 para que ele mostre uma mensagem
indicando se a residência está com consumo elevado de energia. A empresa considera
consumo elevado de energia, se a residência consumir mais de de 70 quilowatts.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quilowatt;
        float preco, valorNoDia, valorAtraso, porcentagemAtraso;
        boolean consumoElevado;

        System.out.println("Informe o quilowatt: ");
        quilowatt = Integer.parseInt(input.nextLine());

        System.out.println("Informe o preço do quilowatt: ");
        preco = Float.parseFloat(input.nextLine());
        
        valorNoDia = quilowatt * preco;
        porcentagemAtraso = valorNoDia * 10 / 100;
        valorAtraso = (quilowatt * preco) + porcentagemAtraso;
        consumoElevado = quilowatt > 70;
        
                        System.out.println(
                "Ao pagar no dia, o valor será: " + valorNoDia +
                        "\nAo pagar atrasado, o valor será: " + valorAtraso +
                        "\nConsumo elevado: " + consumoElevado
        );
    }
    
}
