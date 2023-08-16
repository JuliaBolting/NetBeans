/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Julia
 */
public class Exercicio2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] vetorNomes = insertNomes();
        float[] vetorSaldoAtual = insertValorInicial(vetorNomes);
        showMenu(vetorNomes, vetorSaldoAtual);
    }

    public static String[] insertNomes() {
        int index = 0;
        String[] vetorNomes = new String[10];
        while (index != 10) {
            System.out.println("Informe o nome do cliente " + index + " : ");
            vetorNomes[index] = input.nextLine();
            index++;
        }
        return vetorNomes;
    }

    public static float[] insertValorInicial(String[] nomes) {
        float[] vetorSaldoInicial = new float[10];
        int index = 0;
        while (index != 10) {
            System.out.println("Qual o saldo inicial do " + nomes[index] + " ? ");
            vetorSaldoInicial[index] = Float.parseFloat(input.nextLine());
            index++;
        }
        return vetorSaldoInicial;
    }

    public static void showMenu(String[] nomesClientes, float[] vetorSaldoAtual) {
        System.out.println("""
                           1 - Sacar Dinheiro
                           2 - Depositar Dinheiro
                           3 - Consultar Saldo
                           4 - Sair""");
        
        doChoose(Integer.parseInt(input.nextLine()), nomesClientes, vetorSaldoAtual);
    }

    public static void doChoose(int escolhaMenu, String[] nomesClientes, float[] vetorSaldoAtual) {
        switch (escolhaMenu) {
            case 1 -> {
                System.out.println("Qual o nome do cliente?");
                String nomeCliente = input.nextLine();
                System.out.println("Qual o valor sacado?");
                float valorSacado = Float.parseFloat(input.nextLine());
                vetorSaldoAtual = sacarDinheiro(nomeCliente, valorSacado, nomesClientes, vetorSaldoAtual);
                consultarSaldo(nomeCliente, nomesClientes, vetorSaldoAtual);
                showMenu(nomesClientes, vetorSaldoAtual);
            }
            case 2 -> {
                System.out.println("Qual o nome do cliente?");
                String nomeCliente = input.nextLine();
                System.out.println("Qual o valor de depósito?");
                float valorDeposito = Float.parseFloat(input.nextLine());
                vetorSaldoAtual = depositarDinheiro(nomeCliente, valorDeposito, nomesClientes, vetorSaldoAtual);
                consultarSaldo(nomeCliente, nomesClientes, vetorSaldoAtual);
                showMenu(nomesClientes, vetorSaldoAtual);
            }
            case 3 -> {
                System.out.println("Qual o nome do cliente?");
                String nomeCliente = input.nextLine();
                consultarSaldo(nomeCliente, nomesClientes, vetorSaldoAtual);
                showMenu(nomesClientes, vetorSaldoAtual);
            }
            default -> {
                System.out.println("Clientes: " + Arrays.toString(nomesClientes));
                System.out.println("Saldos Atuais: " + Arrays.toString(vetorSaldoAtual));
                float saldoTotal = 0;
                for (int i = 0; i < vetorSaldoAtual.length; i++) {
                    saldoTotal = saldoTotal + vetorSaldoAtual[i];
                }
                System.out.println("Saldo total: R$ " + saldoTotal);

            }

        }
    }

    public static float[] sacarDinheiro(String nomeCliente, float saque, String[] nomesClientes, float[] vetorSaldoAtual) {
        for (int i = 0; i < nomesClientes.length; i++) {
            if (nomeCliente.equalsIgnoreCase(nomesClientes[i])) {
                System.out.println("Saldo Inicial: " + vetorSaldoAtual[i]);
                System.out.println("Saque de: R$ " + saque);
                if (vetorSaldoAtual[i] - saque < 0) {
                    System.out.println("Saldo insuficiente!!");
                } else {
                    vetorSaldoAtual[i] = vetorSaldoAtual[i] - saque;
                }
            }
        }
        return vetorSaldoAtual;
    }

    public static void consultarSaldo(String nomeCliente, String[] nomesClientes, float[] saldoAtual) {
        for (int i = 0; i < nomesClientes.length; i++) {
            if (nomeCliente.equalsIgnoreCase(nomesClientes[i])) {
                System.out.println("Saldo Atual: R$ " + saldoAtual[i]);
            }
        }
    }

    public static float[] depositarDinheiro(String nomeCliente, float deposito, String[] nomesClientes, float[] vetorSaldoAtual) {
        for (int i = 0; i < nomesClientes.length; i++) {
            if (nomeCliente.equalsIgnoreCase(nomesClientes[i])) {
                System.out.println("Saldo Inicial: " + vetorSaldoAtual[i]);
                System.out.println("Depósito de: R$ " + deposito);
                vetorSaldoAtual[i] = vetorSaldoAtual[i] + deposito;

            }
        }
        return vetorSaldoAtual;
    }

}
