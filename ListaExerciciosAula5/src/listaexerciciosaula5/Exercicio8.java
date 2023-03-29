package listaexerciciosaula5;

import java.util.Scanner;

/**
Sabendo que a velocidade do som é de 340 m/s, crie um programa para calcular a
distância de onde o raio caiu até a pessoa. Para isto, a pessoa deve informar o tempo que
transcorreu entre ela ter visto o raio e ter ouvido o som do trovão. O tempo deve ser
informado em segundos e deve ser um valor real, pois a pessoa poderá usar um
cronômetro de precisão. Além disto, o programa deve apresentar se o raio representou
algum perigo a pessoa. Um raio representa perigo se ele cair a menos de 200m da
pessoa.
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float tempo, distancia;
        boolean perigo;

        System.out.println("Informe o tempo em segundos de transcrição do raio: ");
        tempo = Float.parseFloat(input.nextLine());
        
        distancia = 340 * tempo;
        perigo = distancia < 200;
        
        
                        System.out.println(
                "Distância em metros: " + distancia + 
                "\nPerigo: " + perigo
        );
    }
    
}
