package algoritimos.java;

import java.util.Scanner;

public class Exercicio69 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] vetor = new char[5];
    System.out.println("Digite os 5 elementos do vetor:");
    for (int i = 0; i < 5; i++) {
      vetor[i] = scanner.next().charAt(0);
    }

    insertionSort(vetor);

    System.out.println("Vetor ordenado:");
    for (int i = 0; i < 5; i++) {
      System.out.print(vetor[i] + " ");
    }

    scanner.close();
  }

  public static void insertionSort(char[] vetor) {
    int n = vetor.length;

    for (int i = 1; i < n; i++) {
      char chave = vetor[i];
      int j = i - 1;

      while (j >= 0 && vetor[j] > chave) {
        vetor[j + 1] = vetor[j];
        j--;
      }
      vetor[j + 1] = chave;
    }
  }
}
