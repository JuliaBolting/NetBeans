package listaexerciciosaula14;

import java.util.Scanner;

/**
Em sistemas informatizados é comum que determinas entidades, tais como
matrículas, contas, etc., recebam uma identificação na forma de um número (ou código).
Esse código é sempre acompanhado de um dígito adicional, que é utilizado para
conferência do código e é denominado de dígito verificador. Considerando códigos
compostos por cinco dígitos, o dígito verificador, nesse caso, é determinado conforme o
exemplo a seguir, para o código 14327.
Veja que, para cada dígito do código, é determinada uma parcela resultante da
multiplicação do dígito por um peso, começando com o peso 2 para o último dígito; 3 para
o penúltimo e assim por diante.
1 x 6 = 6
4 x 5 = 20
3 x 4 = 12
2 x 3 = 6
7 x 2 = 14
A seguir, somam-se todas as parcelas. Após, determina-se o resto da divisão da soma
obtida por 11. O valor do dígito verificador será igual à diferença entre 11 e o resto obtido.
Caso essa diferença seja 10 ou 11, então o dígito verificador será igual a zero.
Somatório das parcelas (SP) = 58
Resto (R) = SP Resto 11 = 3 logo,
Dígito verificador = 11 – R = 11 – 3 = 8
Construa um algoritmo que, para um conjunto de N códigos, calcule e escreva, para cada
código, o correspondente dígito verificador.
 */
public class Exercicio25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String codigo;
        int soma = 0, contador, numConj, num = 1;
        
        System.out.println("Informe quandos conjuntos de código há: ");
        numConj = Integer.parseInt(input.nextLine());
        
        do{
            contador = 5;
            System.out.println("Informe o código de 5 dígitos: ");
            codigo = input.nextLine();
            if(codigo.length() > 5){
                System.out.println("Código incorreto, tente novamente!");
            }else{
        
            for(int i = 2; i <= 6; i++){
                soma = soma + (Character.getNumericValue(codigo.charAt(contador-1)) * i);
                contador--;
            }
            
            soma = soma % 11;
            soma = 11 - soma;
        
            if(soma == 10 || soma == 11) System.out.println("Dígito verificador = 0");
            else System.out.println("Dígito verificador = " + soma);
            num++;
            }
        }while(num <= numConj);
    }
    
}
