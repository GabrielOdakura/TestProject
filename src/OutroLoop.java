import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double avaliacao = 0.0;
        double mediaAvaliacao = 0.0;
        int i = 0;

        while (i < 3) {
            System.out.println("Diga sua avaliação para o filme: ");
            avaliacao = input.nextDouble();
            mediaAvaliacao += avaliacao;
            i++;
        }

        System.out.println("A media foi de: " + mediaAvaliacao/3);
    }
}
