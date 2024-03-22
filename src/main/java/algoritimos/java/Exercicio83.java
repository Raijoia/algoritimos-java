package algoritimos.java;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio83 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] vetor = new char[10];

    System.out.println("Digite 10 caracteres:");
    for (int i = 0; i < 10; i++) {
      System.out.print("Digite o caractere " + (i+1) + ": ");
      vetor[i] = scanner.next().charAt(0);
    }
    quickMergeSort(vetor, 0, vetor.length - 1);

    System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

    System.out.print("Digite o caractere a ser buscado: ");
    char caractereBuscado = scanner.next().charAt(0);

    int indice = buscaBinariaRecursiva(vetor, caractereBuscado, 0, vetor.length - 1);

    if (indice != -1) {
      System.out.println("O caractere '" + caractereBuscado + "' está no índice " + indice + " do vetor.");
    } else {
      System.out.println("O caractere '" + caractereBuscado + "' não foi encontrado no vetor.");
    }
    scanner.close();
  }
  private static void quickMergeSort(char[] vetor, int inicio, int fim) {
    if (inicio < fim) {
      int indiceParticao = particionar(vetor, inicio, fim);
      quickMergeSort(vetor, inicio, indiceParticao - 1);
      quickMergeSort(vetor, indiceParticao + 1, fim);
    }
  }
  private static int particionar(char[] vetor, int inicio, int fim) {
    char pivo = vetor[fim];
    int i = inicio - 1;
    for (int j = inicio; j < fim; j++) {
      if (vetor[j] <= pivo) {
        i++;
        trocar(vetor, i, j);
      }
    }
    trocar(vetor, i + 1, fim);
    return i + 1;
  }
  private static void trocar(char[] vetor, int i, int j) {
    char temp = vetor[i];
    vetor[i] = vetor[j];
    vetor[j] = temp;
  }
  private static int buscaBinariaRecursiva(char[] vetor, char chave, int inicio, int fim) {
    if (inicio <= fim) {
      int meio = (inicio + fim) / 2;
      if (vetor[meio] == chave) {
        return meio;
      } else if (vetor[meio] < chave) {
        return buscaBinariaRecursiva(vetor, chave, meio + 1, fim);
      } else {
        return buscaBinariaRecursiva(vetor, chave, inicio, meio - 1);
      }
    }
    return -1;
  }
}
