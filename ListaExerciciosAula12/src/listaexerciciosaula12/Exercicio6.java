package listaexerciciosaula12;

import java.util.Scanner;

/**
 * Suponha que o conceito de um aluno seja determinado em função da sua nota,
 * conforme a tabela abaixo. Crie um programa que leia o nome e a nota de um
 * aluno e passe-a por parâmetro para uma função que deve retornar o seu
 * conceito. Por fim, o programa deve apresentar o nome, a nota e o conceito do
 * aluno.
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, conceito;
        float nota;

        System.out.println("Informe seu nome:");
        nome = input.nextLine();

        System.out.println("Informe sua nota:");
        nota = Float.parseFloat(input.nextLine());
        
        conceito = calcConceito(nota);
        showResults(nome, conceito, nota);
    }

    public static String calcConceito(float nota) {
        if (nota <= 49) {
            return "Insuficiente";
        } else if (nota <= 64) {
            return "Regular";
        } else if (nota <= 84) {
            return "Bom";
        } else {
            return "Ótimo";
        }
    }
    
    public static void showResults(String nome, String conceito, float nota){
        System.out.println(nome + ", com sua nota " + nota + ", seu conceito é: " + conceito);
    }

}
