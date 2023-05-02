import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double avaliacao = 0.0;
        double mediaAvaliacao = 0.0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme: ");
            avaliacao = input.nextDouble();
            mediaAvaliacao += avaliacao;
        }

        System.out.println("A media foi de: " + mediaAvaliacao/3);
    }
}
