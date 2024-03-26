package algoritimos.java;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite os 10 números a serem somados:");

        preencherVetor(vetor, 0, scanner);

        int soma = calcularSoma(vetor, 0);

        System.out.println("A soma de todos os números é: " + soma);

        scanner.close();
    }

    public static void preencherVetor(int[] vetor, int indice, Scanner scanner) {
        if (indice < vetor.length) {
            System.out.print("Digite o " + (indice + 1) + "º número: \n");
            vetor[indice] = scanner.nextInt();
            preencherVetor(vetor, indice + 1, scanner);
        }
    }

    // Função recursiva para calcular a soma dos elementos do vetor
    public static int calcularSoma(int[] vetor, int indice) {
        if (indice == vetor.length - 1) {
            return vetor[indice];
        } else {
            return vetor[indice] + calcularSoma(vetor, indice + 1);
        }
    }
}

