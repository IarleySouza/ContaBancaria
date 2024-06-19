import java.util.Scanner;

public class VerificadorElegibilidadeConta { 
    public static void main(String[] args) {
        String out =  new Scanner(System.in).nextInt() >= 18 ? "Voce esta elegivel para criar uma conta bancaria." : "Voce nao esta elegivel para criar uma conta bancaria.";
        System.out.println(out);
    }
}