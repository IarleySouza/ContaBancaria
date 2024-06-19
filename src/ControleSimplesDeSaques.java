import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saque = 0.0;

        while ((saque = scanner.nextDouble()) != 0 && saque <= limiteDiario) {
            limiteDiario -= saque;
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
        }

        System.out.println(saque == 0 ? "Transacoes encerradas." : "Limite diario de saque atingido. Transacoes encerradas.");
        scanner.close();
    }
}