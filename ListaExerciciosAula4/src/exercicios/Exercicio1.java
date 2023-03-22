package exercicios;

/**
 * Calcule os resultados das seguintes expressões:
 */
public class Exercicio1 {

    public static void main(String[] args) {

        int res1, res2, res3, res4, res5, res6, res7, res8;

        res1 = 5 + 3 * 6 / 2;
        res2 = 36 / 3 * 2 - 5 + 8;
        res3 = 30 / 4 * 6;
        res4 = 30 % 4 * 6;
        res5 = 5 * 7 % 3 + 4 / 2 + 5;
        res6 = (5 * 7 % 3 + 4) / 2 + 5;
        res7 = (5 * 7 % 3) + 4 / (2 + 5);
        res8 = (5 * 7 % 3) + 4 / 2 + 5;

        System.out.println(
                res1 + " é a resposta para a conta 5 + 3 * 6 / 2 \n"
                + res2 + " é a resposta para a conta 36 / 3 * 2 - 5 + 8 \n"
                + res3 + " é a resposta para a conta 30 / 4 * 6 \n"
                + res4 + " é a resposta para a conta 30 % 4 * 6 \n"
                + res5 + " é a resposta para a conta 5 * 7 % 3 + 4 / 2 + 5 \n"
                + res6 + " é a resposta para a conta (5 * 7 % 3 + 4) / 2 + 5 \n"
                + res7 + " é a resposta para a conta (5 * 7 % 3) + 4 / (2 + 5) \n"
                + res8 + " é a resposta para a conta (5 * 7 % 3) + 4 / 2 + 5 \n" 
        );
    }

}
