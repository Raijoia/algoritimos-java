import java.util.Scanner;

public class CalculadoraSerieRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número inteiro positivo para o termo da série:");
        int termo = scanner.nextInt();

        if (termo < 0) {
            System.out.println("O número deve ser inteiro e positivo.");
        } else {
            double resultado = calcularSerie(termo);
            System.out.println("O valor da série é: " + resultado);
        }
    }

    public static double calcularSerie(int termo) {
        if (termo == 0) {
            return 0;
        } else {
            return calcularSerie(termo - 1) + 1.0 / Math.pow(2, termo);
        }
    }
}
