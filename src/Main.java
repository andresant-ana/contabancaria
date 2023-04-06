import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "André Sant'Ana Boim";
        double saldo = 2500;
        int opcao;
        double valorAReceber;
        double valorATransferir;

        System.out.printf(
             "\n" +
             "***************************************" +
             "\n" +
             "Dados do cliente:" +
             "\n\n" +
             "Nome:             " + nome +
             "\n" +
             "Tipo conta:       Corrente" +
             "\n" +
             "Saldo inicial:    R$%.2f" +
             "\n" +
            "***************************************" +
            "\n", saldo
            );

        while (true) {
            System.out.println("""
                                    
                                    
                    Operações:

                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """);
            System.out.println("Digite a opção desejada:");
            opcao = leitor.nextInt();


            if (opcao == 1) {
                System.out.printf("\nO seu saldo atual é de R$%.2f.", saldo);
            } else if (opcao == 2) {
                System.out.println("Insira o valor a receber: ");
                valorAReceber = leitor.nextDouble();
                System.out.printf("O seu saldo agora é de R$%.2f", saldo + valorAReceber);
                saldo += valorAReceber;
            } else if (opcao == 3) {
                System.out.println("Insira o valor a transferir: ");
                valorATransferir = leitor.nextDouble();
                if (valorATransferir > saldo) {
                    System.out.println("Saldo insuficiente para a transferência.");
                } else {
                    System.out.printf("O seu saldo agora é de R$%.2f", saldo - valorATransferir);
                    saldo -= valorATransferir;
                }
            } else if (opcao == 4) {
                System.out.println("Sessão encerrada.");
                break;
            } else {
                System.out.println("Opção inválida.");
            }

        }


    }
}