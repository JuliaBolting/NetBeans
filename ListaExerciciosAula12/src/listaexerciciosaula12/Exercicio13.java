package listaexerciciosaula12;

import java.util.Scanner;

/**
Escreva um programa que tome como entradas as coordenadas de um ponto
(abscissa e ordenada) e as envie para uma função que deve imprimir em que quadrante
(1, 2, 3 ou 4) o ponto está localizado.
 */
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float abscissa, ordenada;
        int quadrante;
        
        System.out.println("Informe as coordenadas da abscissa: ");
        abscissa = Float.parseFloat(input.nextLine());
        
        System.out.println("Informe as coordenadas da ordenada: ");
        ordenada = Float.parseFloat(input.nextLine());
        
        quadrante = calcQuadrante(abscissa, ordenada);
        showResponse(quadrante);
    }
    
    public static int calcQuadrante(float ab, float ord){
        if(ab > 0 && ord > 0)
            return 1;
        else if(ab < 0 && ord > 0)
            return 2;
        else if(ab < 0 && ord < 0)
            return 3;
        else 
            return 4;
    }
    
    public static void showResponse(int quadrante){
        System.out.println("É o " + quadrante + " quadrante.");
    }
    
}

