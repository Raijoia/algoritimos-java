package algoritimos.java;

import java.util.Scanner;

public class Exercicio81 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Criar o vetor de tamanho 20
    double[] vetor = new double[20];

    // Receber os valores do usuário
    System.out.println("Digite os 20 valores para preencher o vetor:");
    for (int i = 0; i < 20; i++) {
      System.out.print("Digite o valor #" + (i + 1) + ": ");
      vetor[i] = scanner.nextDouble();
    }

    // Chamar a função de ordenação Merge-Sort
    mergeSortDecrescente(vetor, 0, vetor.length - 1);

    // Exibir o vetor ordenado em tela
    System.out.println("\nVetor ordenado em ordem decrescente:");
    for (double num : vetor) {
      System.out.println(num);
    }

    scanner.close();
  }

  // Implementação do algoritmo Merge-Sort
  public static void mergeSortDecrescente(double[] vetor, int inicio, int fim) {
    if (inicio < fim) {
      int meio = (inicio + fim) / 2;
      mergeSortDecrescente(vetor, inicio, meio);
      mergeSortDecrescente(vetor, meio + 1, fim);
      merge(vetor, inicio, meio, fim);
    }
  }

  // Função para combinar dois subvetores em um único vetor ordenado
  public static void merge(double[] vetor, int inicio, int meio, int fim) {
    int tamanho1 = meio - inicio + 1;
    int tamanho2 = fim - meio;

    double[] vetorEsquerdo = new double[tamanho1];
    double[] vetorDireito = new double[tamanho2];

    for (int i = 0; i < tamanho1; ++i) {
      vetorEsquerdo[i] = vetor[inicio + i];
    }
    for (int j = 0; j < tamanho2; ++j) {
      vetorDireito[j] = vetor[meio + 1 + j];
    }

    int i = 0, j = 0;
    int k = inicio;
    while (i < tamanho1 && j < tamanho2) {
      if (vetorEsquerdo[i] >= vetorDireito[j]) {
        vetor[k] = vetorEsquerdo[i];
        i++;
      } else {
        vetor[k] = vetorDireito[j];
        j++;
      }
      k++;
    }

    while (i < tamanho1) {
      vetor[k] = vetorEsquerdo[i];
      i++;
      k++;
    }

    while (j < tamanho2) {
      vetor[k] = vetorDireito[j];
      j++;
      k++;
    }
  }
}
