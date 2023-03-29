package prova1;

import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        float notaPort, notaMath, notaConGer, media;
        boolean aprovado;

        System.out.println("Informe o nome do candidato: ");
        nome = input.nextLine();

        System.out.println("Informe a nota de Português do candidato "+ nome+": ");
        notaPort = Float.parseFloat(input.nextLine());
        
        System.out.println("Informe a nota de Matemática do candidato "+ nome+": ");
        notaMath = Float.parseFloat(input.nextLine());
        
        System.out.println("Informe a nota de Conhecimentos Gerais do candidato "+ nome+": ");
        notaConGer = Float.parseFloat(input.nextLine());

        media = (notaPort + notaConGer + notaMath) / 3;
        aprovado = (media >= 7) && (notaPort >= 5) && (notaMath >= 5) && (notaConGer >= 5);

        System.out.println(
                "\nCandidato: " + nome +
                "\nNota Português: " + notaPort +
                "\nNota Matemática: " + notaMath +
                "\nNota Conhecimentos Gerais: " + notaConGer +
                "\nMedia das notas: " + media +
                "\nAprovado: " + aprovado 
        );

    }
    
}
