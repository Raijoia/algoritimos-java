package algoritimos.java;

import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] vetor = new char[10];
    System.out.println("Digite 10 elementos do vetor em ordem crescente:");
    for (int i = 0; i < 10; i++) {
      vetor[i] = scanner.next().charAt(0);
    }

    System.out.println("Digite o elemento para busca:");
    char elementoBusca = scanner.next().charAt(0);

    int resultado = buscaMaiorIndice(vetor, elementoBusca, 0, vetor.length - 1);

    if (resultado != -1) {
      System.out.println("Maior índice do vetor que contém o elemento: " + resultado);
    } else {
      System.out.println("Elemento não encontrado no vetor.");
    }

    scanner.close();
  }

  public static int buscaMaiorIndice(char[] vetor, char elemento, int inicio, int fim) {
    if (inicio > fim) {
      return -1;
    }

    int meio = (inicio + fim) / 2;

    if (vetor[meio] == elemento) {
      return meio;
    } else if (vetor[meio] < elemento) {
      return buscaMaiorIndice(vetor, elemento, inicio, meio - 1);
    } else {
      return buscaMaiorIndice(vetor, elemento, meio + 1, fim);
    }
  }
}
