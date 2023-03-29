package listaexerciciosaula5;

import java.util.Scanner;

/**
Observe a seguinte regra aeronáutica (fictícia). Para que um avião possa
decolar de um aeroporto, várias condições devem ser satisfeitas: 
* caso a pista seja menor que 1,5 Km, o avião deve pesar menos que 40 toneladas, 
* caso a pista possua entre 1,5 e 2 Km, o avião não deve ultrapassar as 60 toneladas. 
* Caso a pista seja superior a 2 Km, qualquer avião pode decolar. 
* Caso a visibilidade seja inferior a 20 metros, apenas aviões com sistema de decolagem computadorizada podem decolar. 
* Se estiver chovendo acima de 5 mm, nenhum avião pode decolar. 
* Se o avião possuir mais de 100 passageiros e estiver chovendo, o avião não pode decolar. 
 */
public class Exercicio10 {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        float tamPista;
        int peso, visibilidade, chuva, passageiros;
        boolean sisDecolagem, podeDecolar;

        //System.out.println("Informe o tamanho da pista: ");
        //tamPista = Float.parseFloat(input.nextLine());
        tamPista = (float) 3;
        
        //System.out.println("Informe o peso do avião: ");
        //peso = Integer.parseInt(input.nextLine());
        peso = 50;
        
        //System.out.println("Informe a visibilidade do avião: ");
        //visibilidade = Integer.parseInt(input.nextLine());
        visibilidade = 12;
        
        //System.out.println("Informe o número de passageiros do avião: ");
        //passageiros = Integer.parseInt(input.nextLine());
        passageiros = 120;
        
        //System.out.println("Informe os milímetros se há chuva: ");
        //chuva = Integer.parseInt(input.nextLine());
        chuva = 1;
        
        //System.out.println("Informe o sistema de decolagem (true, false): ");
        //sisDecolagem = Boolean.parseBoolean(input.nextLine());
        sisDecolagem = true;
        
        //podeDecolar = 
          //      ((tamPista < 1.5) && (peso < 40)) ||
            //    ((tamPista < 2 && tamPista > 1.5) && (peso <= 60)) || //ver pq não da 4 linha
              //  ((tamPista > 2)) ||
                //((visibilidade < 20) && (sisDecolagem == true)) ||
                //(5 < chuva) ||
                //!((passageiros > 100) && (chuva > 0));
                
                podeDecolar = (peso < 40) ||
                        (tamPista >= 1.5 && peso <= 60) ||
                        (tamPista > 2) &&
                        ((visibilidade >= 20) || (sisDecolagem == true)) &&
                        (chuva == 0 || chuva <= 5 && passageiros <= 100);
        
        
                        System.out.println(
                "Pode decolar: " + podeDecolar 
        );
    }
    
}
