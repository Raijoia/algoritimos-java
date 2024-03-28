package algoritimos.java;

import java.util.Scanner;

public class Exercicio59 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] vetor = new char[5];
    System.out.println("Digite os 5 elementos do vetor:");
    for (int i = 0; i < 5; i++) {
      vetor[i] = scanner.next().charAt(0);
    }

    bubbleSort(vetor);

    System.out.println("Vetor ordenado:");
    for (int i = 0; i < 5; i++) {
      System.out.print(vetor[i] + " ");
    }

    scanner.close();
  }

  public static void bubbleSort(char[] vetor) {
    int n = vetor.length;
    boolean trocou;

    do {
      trocou = false;
      for (int i = 0; i < n - 1; i++) {
        if (vetor[i] > vetor[i + 1]) {
          char temp = vetor[i];
          vetor[i] = vetor[i + 1];
          vetor[i + 1] = temp;
          trocou = true;
        }
      }
      n--;
    } while (trocou);
  }
}
