import java.util.InputMismatchException;
import java.util.Scanner;

public class AulaPratical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = lerValor(scanner, "Digite o valor de 'a': ");
        double b = lerValor(scanner, "Digite o valor de 'b': ");
        double c = lerValor(scanner, "Digite o valor de 'c': ");

        try {
            double x1 = Equacao.raizEq2GrauX1(a, b, c);
            double x2 = Equacao.raizEq2GrauX2(a, b, c);
            System.out.printf("As raízes da equação são: x1 = %.2f, x2 = %.2f%n", x1, x2);
        } catch (NaoTemRaizesReaisException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double lerValor(Scanner scanner, String mensagem) {
        double valor = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(mensagem);
            try {
                valor = scanner.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Por favor, digite um número real.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }
        return valor;
    }
}