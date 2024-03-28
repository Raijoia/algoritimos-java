package algoritimos.java;
import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números a serem organizados:");
        int tamanho = scanner.nextInt();

        int[] vetor = new int [tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            vetor[i] = scanner.nextInt();
        }
        System.out.println();

        selectionSort(vetor);

        System.out.println("Números ordenados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");

        scanner.close();
    }

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
    
        for (int i = 0; i < n - 1; i++) {
          int minIndex = i;
          for (int j = i + 1; j < n; j++) {
            if (vetor[j] < vetor[minIndex]) {
              minIndex = j;
            }
          }
          int temp = vetor[minIndex];
          vetor[minIndex] = vetor[i];
          vetor[i] = temp;
        }
      }
}
