package listaexerciciosaula5;

import java.util.Scanner;

/**
Crie uma nova o programa da questão 5, para que ele considere a frequência do aluno.
Agora, para ser aprovado o aluno precisa ter nota igual ou superior a sete no trabalho,
nota igual ou superior a seis em pelo menos uma das provas e frequência igual ou
superior a 75%. Além desta diferença, caso o aluno tenha nota seis no trabalho ele
poderá ser aprovado, mas para isto precisa ter frequência igual ou superior a 90%.
 */
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota1, nota2, nota3, frequencia;
        boolean aprovado;

        System.out.println("Informe sua primeira nota (Prova 1): ");
        nota1 = Integer.parseInt(input.nextLine());

        System.out.println("Informe sua segunda nota (Prova 2): ");
        nota2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Informe sua terceira nota (Trabalho): ");
        nota3 = Integer.parseInt(input.nextLine());
        
        System.out.println("Informe sua frequência: ");
        frequencia = Integer.parseInt(input.nextLine());
        
        aprovado = ((nota3 >= 7) && (nota1 >= 6 || nota2 >= 6) && (frequencia >= 75) || ((nota3 == 6) && (frequencia >= 90)));
        
                        System.out.println(
                "Aprovado: " + aprovado 
        );
    }
    
}
