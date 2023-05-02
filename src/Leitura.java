import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = input.nextLine();

        System.out.println("Qual o ano de lançamento: ");
        int anoDeLancamento = input.nextInt();

        System.out.println("Diga sua avaliação para o filme: ");
        double avaliacao = input.nextDouble();

        System.out.println(filme);
        System.out.println("O ano de lançamento foi de: " + anoDeLancamento);
        System.out.println("A avaliacao foi de: " + avaliacao);
    }
}
