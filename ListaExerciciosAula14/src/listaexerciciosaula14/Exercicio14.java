package listaexerciciosaula14;

import java.util.Scanner;

/**
Uma empresa está cadastrando os candidatos a emprego. Cada candidato preencheu
uma ficha onde estão registrados os seguintes dados: gênero (M, F, I ou X para terminar),
idade e experiência no serviço (S ou N).

Faça um programa que leia estes dados, calcule e apresente:
a) A quantidade de candidatos de cada gênero.
b) A quantidade de candidatos com experiência no serviço.
c) A quantidade de candidatos sem experiência no serviço.
d) A idade média dos candidatos com experiência no serviço.
e) A idade média dos candidatos sem experiência no serviço.
f) O percentual de candidatos com experiência no serviço e idade inferior a 35 anos.
g) A idade do candidato mais jovem.
O programa deve ser repetido até que o usuário digite X como gênero do candidato.
Neste caso, não se deve perguntar as demais informações do candidato.
 */
public class Exercicio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char genero, xp;
        int idade, quantGenM = 0, quantGenF = 0, quantGenI = 0, quantGenX = 0, quantXP = 0, quantSemXP = 0, quantPessoas = 0, perc = 0;
        float mediaIdadeXP = 0, mediaIdadeSemXP = 0;

        do {
            System.out.println("Informe seu gênero:");
            genero = input.nextLine().charAt(0);
            
            if(genero == 'M')quantGenM++;
            if(genero == 'F')quantGenF++;
            if(genero == 'I')quantGenI++;
            if(genero == 'X')quantGenX++;

            if (genero != 'X') {

                System.out.println("Informe sua idade:");
                idade = Integer.parseInt(input.nextLine());

                System.out.println("Informe se tem experiência:");
                xp = input.nextLine().charAt(0);
                
                if(xp == 'S'){
                    quantXP++;
                    mediaIdadeXP = mediaIdadeXP + idade;
                    if(idade < 35){
                        perc++;
                    }
                }
                else{
                    quantSemXP++;
                    mediaIdadeSemXP = mediaIdadeSemXP + idade;
                }
            quantPessoas++;
            }
        } while (genero != 'X');
        
        System.out.println("\nA quantidade de candidatos de cada gênero.");
        System.out.println("Genero M: "+ quantGenM);
        System.out.println("Genero F: "+ quantGenF);
        System.out.println("Genero I: "+ quantGenI);
        System.out.println("Genero X: "+ quantGenX);
        System.out.println("\nA quantidade de candidatos com experiência no serviço: "+ quantXP);
        System.out.println("\nA quantidade de candidatos sem experiência no serviço: "+ quantSemXP);
        System.out.println("\nA idade média dos candidatos com experiência no serviço: "+ (mediaIdadeXP / quantXP));
        System.out.println("\nA idade média dos candidatos sem experiência no serviço: "+ (mediaIdadeSemXP / quantSemXP));
        System.out.println("\nO percentual de candidatos com experiência no serviço e idade inferior a 35 anos: "+ ((perc * 100) / quantPessoas));
    }

}
