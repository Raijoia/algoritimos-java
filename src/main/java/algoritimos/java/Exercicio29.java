import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro positivo: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro positivo: ");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println("O primeiro número deve ser maior ou igual ao segundo número.");
        } else {
            int resultado = subtract(num1, num2);
            System.out.println("Resultado da subtração: " + resultado);
        }

        scanner.close();
    }

    public static int subtract(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return subtract(num1 + 1, num2 - 1);
        }
    }
}
