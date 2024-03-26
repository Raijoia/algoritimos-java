 import java.util.Scanner;

public class CalculadoraPotenciaRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base:");
        int base = scanner.nextInt();

        System.out.println("Digite o expoente:");
        int expoente = scanner.nextInt();

        if (base < 0 || expoente < 0) {
            System.out.println("Os números devem ser inteiros e positivos.");
        } else {
            int resultado = calcularPotencia(base, expoente);
            System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
        }
    }

    public static int calcularPotencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, expoente - 1);
        }
    }
}
