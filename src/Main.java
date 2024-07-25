import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String vendedor = scan.nextLine();
        double salFixo = scan.nextDouble();
        double vendasMes = scan.nextDouble();
        double total = salFixo + (vendasMes * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n" , total);
    }
}