package algoritimos.java;

import java.util.Scanner;

public class Exercicio64 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] vetor = new char[5];
    System.out.println("Digite os 5 elementos do vetor:");
    for (int i = 0; i < 5; i++) {
      vetor[i] = scanner.next().charAt(0);
    }

    selectionSort(vetor);

    System.out.println("Vetor ordenado:");
    for (int i = 0; i < 5; i++) {
      System.out.print(vetor[i] + " ");
    }

    scanner.close();
  }

  public static void selectionSort(char[] vetor) {
    int n = vetor.length;

    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (vetor[j] < vetor[minIndex]) {
          minIndex = j;
        }
      }
      char temp = vetor[minIndex];
      vetor[minIndex] = vetor[i];
      vetor[i] = temp;
    }
  }
}
