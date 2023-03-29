  package listaexerciciosaula5;

import java.util.Scanner;

/**
Crie um programa para auxiliar engenheiros a calcular a quantidade de piso a ser
utilizado em uma sala retangular, a quantidade de tinta a ser gasta nas paredes, bem
como a potência do ar-condicionado. Para isto, o programa deve ler o comprimento, a
largura e a altura da sala, calcular e imprimir a área de piso da sala, a área total das
paredes e o volume da sala. O programa deve mostrar também o tamanho do aparelho de
ar-condicionado a ser instalado. Um pequeno deve ser instalado se o volume da sala for
inferior a 100 m3; um aparelho médio deve ser instalado se o volume da sala estiver entre 100 e 500 m3; 
e um aparelho grande deve ser instalado caso o volume seja superior a 500 m3
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float comprimento, largura, altura, areaPiso/*, areaTotal*/, volume;
        boolean arPequeno, arMedio, arGrande;

        System.out.println("Informe o comprimento da sala: ");
        comprimento = Float.parseFloat(input.nextLine());

        System.out.println("Informe a largura da sala: ");
        largura = Float.parseFloat(input.nextLine());
        
        System.out.println("Informe a altura da sala: ");
        altura = Float.parseFloat(input.nextLine());
        
        volume = comprimento * largura * altura;
        areaPiso = comprimento * largura;
        //areaTotal = ; FAZER
        arPequeno = volume < 100;
        arMedio = 100 < volume && volume < 500;
        arGrande = volume > 500;
        
        
                        System.out.println(
                "Volume: " + volume + 
                "\nÁrea do piso: " + areaPiso + 
                "\nAr condicionado pequeno: " + arPequeno + 
                "\nAr condicionado médio: " + arMedio + 
                "\nAr condicionado grande: " + arGrande
        );
    }
    
}
