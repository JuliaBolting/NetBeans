package exercicioaula19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
Faça um programa que leia os dados com as
vendas semanais de uma loja, disponíveis em um arquivo com o seguinte formato:
* Nome produto1 (String)
* Quantidade Vendida do produto 1 (Int)
* Preço do produto 1 (Float).
O arquivo dadosVenda.txt disponível no SIGAA apresenta alguns dados como exemplo.
Considere que a empresa comercializa, no máximo, 50 produtos diferentes.
* Após ler os dados o programa deve calcular a receita obtida com as vendas de cada produto
e salvar os dados no arquivo dadosReceita.txt, que deve ter o seguinte formato:
* Nome do Produto 1 - Receita do Produto 1.
O arquivo dadosReceita.txt disponível no SIGAA apresenta alguns dados como exemplo.
Além de salvar estes dados em um arquivo, o programa deve calcular e apresentar na tela a 
receita obtida com a venda de todos os produtos juntos.
 */
public class Exercicio1 {
    
    public static void main(String[] args) {
        try {
            
            FileReader arquivo = new FileReader("dadosVenda.txt");
            FileWriter gravar = new FileWriter("dadosReceita.txt");
            
            BufferedReader buffer = new BufferedReader(arquivo);
            BufferedWriter bufferEscrita = new BufferedWriter(gravar);
            
            String [] produto = new String [50];
            int [] quantVendida = new int [50];
            float [] precoProduto = new float [50];
            float receitaProduto;
            float receitaTotal = 0;
            
            for(int i = 0; i < 50; i++){
                String controle = buffer.readLine();
                if(controle != null){
                    produto[i] = controle;
                    quantVendida[i] = Integer.parseInt(buffer.readLine());
                    precoProduto[i] = Float.parseFloat(buffer.readLine());
                }else{
                    break;
                }
            }
            
            System.out.println(Arrays.toString(produto));
            System.out.println(Arrays.toString(quantVendida));
            System.out.println(Arrays.toString(precoProduto));
            
            for(int j = 0; j < 50; j++){
                if(produto[j] != null){
                    receitaProduto = precoProduto[j] * quantVendida[j];
                    bufferEscrita.write(produto[j] + " - " + receitaProduto + "\n");
                    System.out.println("\n" + produto[j] + " - " + receitaProduto);
                    receitaTotal = receitaTotal + receitaProduto;
                }else{
                    break;
                }
            }
            System.out.println("\nReceita Total: " + receitaTotal);
            
            buffer.close();
            bufferEscrita.close();
        } catch (IOException ex) {
            System.out.println("Erro ao ler/escrever arquivo: " + ex);
        }
    }
}
