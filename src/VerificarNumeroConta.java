import java.util.Scanner;


public class VerificarNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        String n = scanner.nextLine();
        if (n.length() != 8) {
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        } else {
            System.out.println("Numero de conta valido.");
        }
    }
    
}
