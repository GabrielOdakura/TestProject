import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        String nome = "Gabriel";
        String tipoDeConta = "Corrente";
        int opcao;
        double saldo = 2500.0;
        boolean sinal = false;
        Scanner input = new Scanner(System.in);
        double valor;

        System.out.println("**********************************\n" +
                "Nome          : " + nome +
                "\nTipo conta    : " + tipoDeConta +
                "\nSaldo Inicial : " + saldo +
                "\n**********************************\n");

        while(!(sinal)){
            System.out.println("Digite a opção desejada!");
            System.out.println(
                    "Opções\n\n"+
                    "1 - Consultar Saldo\n" +
                    "2 - Receber Valor\n" +
                    "3 - Transferir Valor\n"+
                    "4 - Sair do Programa\n");
            opcao = input.nextInt();
            switch (opcao){
                case 1:// checar saldo
                    System.out.println("O seu saldo é de: " + saldo);
                    break;
                case 2:// receber valor
                    System.out.println("Digite o valor a receber!");
                    valor = input.nextDouble();
                    saldo += valor;
                    System.out.println("O seu novo saldo é de: " + saldo);
                    break;
                case 3:// transferir valor
                    System.out.println("Digite o valor a transferir!");
                    valor = input.nextDouble();
                    if (valor < saldo){
                        saldo -= valor;
                        System.out.println("Transferencia feita com sucesso!");
                        System.out.println("O seu novo saldo é de: " + saldo);
                    } else System.out.println("Você não tem o saldo necessário para esta operação!");
                    break;
                case 4:
                    sinal = true;
                    break;
            }
        }
        System.out.println("Obrigado pela preferencia!");
        input.close();

    }
}
