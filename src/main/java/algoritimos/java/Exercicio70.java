package algoritimos.java;

import java.util.Scanner;

public class Exercicio70 {
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

        insertionSort(vetor);

        System.out.println("Números ordenados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");

        scanner.close();
    }

    public static void insertionSort(int[] vetor) {
        int n = vetor.length;
    
        for (int i = 1; i < n; i++) {
          int chave = vetor[i];
          int j = i - 1;
    
          while (j >= 0 && vetor[j] > chave) {
            vetor[j + 1] = vetor[j];
            j--;
          }
          vetor[j + 1] = chave;
        }
      }
}
