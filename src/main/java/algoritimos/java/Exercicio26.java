import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro numero inteiro positivo: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo numero inteiro positivo: ");
        int n2 = scanner.nextInt();

        if (n1 <= 0 || n2 <= 0) {
            System.out.println("digite apenas numeros inteiros positivos");
        } else {
            int mdc = MDC(n1, n2);
            System.out.println("o MDC de " + n1 + " e " + n2 + " é: " + mdc);
        }

        scanner.close();
    }

    public static int MDC(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return MDC(b, a % b);
        }
    }
}


