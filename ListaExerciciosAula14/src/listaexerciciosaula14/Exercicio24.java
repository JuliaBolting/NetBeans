package listaexerciciosaula14;

import java.util.Scanner;

/**
Em uma eleição presidencial existem quatro candidatos. Os votos são informados por
meio de código. Os códigos utilizados são: ]
• Números de 1 a 4 indicam cada um dos candidatos;
• 5 - Voto nulo;
• 6 - Voto em branco .
Faça um programa leia os votos informados, calcule e mostre:
• O total de votos para cada candidato;
• O total de votos nulos;
• O total de votos em branco;
• A porcentagem de votos nulos sobre o total de votos;
• A porcentagem de votos em branco sobre o total de votos.
Para finalizar o conjunto de votos, deve-se digitar o código 0 e para códigos inválidos o
programa deve mostrar uma mensagem.
 */
public class Exercicio24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cod, cod1 = 0, cod2 = 0, cod3 = 0, cod4 = 0, cod5 = 0, cod6 = 0, total;
        
        do{
            System.out.println("Informe o código de voto: ");
            cod = Integer.parseInt(input.nextLine());
            if(cod == 1) cod1++;
            if(cod == 2) cod2++;
            if(cod == 3) cod3++;
            if(cod == 4) cod4++;
            if(cod == 5) cod5++;
            if(cod == 6) cod6++;
            if(cod > 6 || cod < 0)
                System.out.println("Código inválido");
            total = cod1 + cod2 + cod3 + cod4 + cod5 + cod6;
        }while(cod != 0);
        
        System.out.println(cod1 + " votos para o candidato 1");
        System.out.println(cod2 + " votos para o candidato 2");
        System.out.println(cod3 + " votos para o candidato 3");
        System.out.println(cod4 + " votos para o candidato 4");
        System.out.println(cod5 + " votos nulos");
        System.out.println(cod6 + " votos em branco");
        System.out.println("Porcentagem de votos nulos: "+ ((cod5 * 100) / total));
        System.out.println("Porcentagem de votos em branco: "+ ((cod6 * 100) / total));
    }
    
}
