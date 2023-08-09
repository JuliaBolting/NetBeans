package exercicioaula16;

import java.util.Scanner;

/**
O voo de uma empresa aérea possui escala em cinco
cidades (A, B, C, D e E). Faça um programa que leia a quantidade de
passageiros presentes no voo, o nome do passageiro e a cidade de
destino de cada um deles. Por fim, o programa deve imprimir uma
lista para cada cidade, com o nome dos passageiros que a tem como
destino.
● O programa deve ter uma função para realizar a leitura dos dados e
outra função para imprimir as listas. Esta função pode ter apenas um
for dentro dela.
 */
public class Exercicio4 {

    static Scanner input = new Scanner(System.in);
        
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de passageiros no voo: ");
        int n = Integer.parseInt(input.nextLine());
        String[] nomes = new String[n];
        char [] destinos = new char[n];
        leiaDados(n, nomes, destinos);
        imprimaLista(n,nomes,destinos,'A');
        imprimaLista(n,nomes,destinos,'B');
        imprimaLista(n,nomes,destinos,'C');
        imprimaLista(n,nomes,destinos,'D');
        imprimaLista(n,nomes,destinos,'E');
    }
        
    static void leiaDados(int n, String[] nom, char[] dest){
        for (int i=0;i<n;i++){
            System.out.print("Digite o nome do passageiro "+i+": ");
            nom[i] = input.nextLine();
            System.out.print("Digite o destino do passageiro "+nom[i]+": ");
            dest[i] = input.nextLine().charAt(0);
        }
    }

    static void imprimaLista(int n,String[] no, char[] de, char cidade){
        System.out.println("\nPassageiros com destino a cidade "+cidade);
        for (int i=0;i<n;i++){
            if (de[i]==cidade){    
                System.out.println(no[i]);
            }      
        }
    }
    
}
