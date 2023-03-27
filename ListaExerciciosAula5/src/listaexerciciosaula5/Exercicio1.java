package listaexerciciosaula5;


/**
Apresente os resultados (true ou false) das seguintes expressões:
 */
public class Exercicio1 {

    public static void main(String[] args) {
        boolean num1, num2, num3, num4, num5, num6;
        
        num1 = 5 + 3 * 6 / 2 >= 10;
        num2 = 36 / 3 * 2 - 5 + 8 == 27;
        num3 = ! (30 / 4 * 6 == 15);
        num4 = (30 % 4 * 6 == 12) || true;
        num5 = (5 * 7 % 3) + 4 / 2 + 5 == 12 && (12 / 4 < 8);
        num6 = (((5 * 7 % 3 + 5) / 2 + 5) <= 14) || (!(12 / 4 < 8 * 2));
        
                System.out.println(
                num1 + "\n" +
                num2 + "\n" +
                num3 + "\n" +
                num4 + "\n" +
                num5 + "\n" +
                num6 + "\n"
        );
    }
    
}
