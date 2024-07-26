import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        double valorInserido = 0;

        System.out.println("****************\n>> BANCO CENTRAL <<\n** Selecione a opcao **\n\n1 - Depositar Valor.\n\n2 - Sacar Valor.\n\n3 - Consultar Saldo.\n\n4 - Sair.\n\n");

        while (continuar) {
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o valor que vc deseja adicionar");
                valorInserido = scanner.nextDouble();
                saldo += valorInserido;
                System.out.println("seu credito atualizado eh de " + saldo);
                break;
            case 2:
                System.out.println("Digite o valor que vc deseja sacar");
                valorInserido = scanner.nextDouble();
                if (valorInserido > saldo) {
                    System.out.println("nao eh possivel realizar a transacao");
                } else {
                    saldo -= valorInserido;
                    System.out.println("seu credito atualizado eh de " + saldo);}
                    break;
            case 3:
                System.out.println("Seu credito atual eh de " + saldo);
                break;
            case 4:
                System.out.println("Programa encerrado.");
                continuar = false;
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                }
        }
        scanner.close();
    }
}