 import java.util.Scanner;

public class MultiplicacaoRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro positivo:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro positivo:");
        int num2 = scanner.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Os números devem ser inteiros e positivos.");
        } else {
            int resultado = multiplicarRecursivamente(num1, num2);
            System.out.println("O resultado da multiplicação é: " + resultado);
        }
    }

    public static int multiplicarRecursivamente(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 + multiplicarRecursivamente(num1, num2 - 1);
        }
    }
}
