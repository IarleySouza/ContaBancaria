import java.util.Scanner;

public class ChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        if (saque <= saldo || saque <= saldo + 500) {
            System.out.println("Transacao realizada com sucesso" + (saque > saldo ? " utilizando o cheque especial." : "."));
        } else {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        scanner.close();
    }
        
}