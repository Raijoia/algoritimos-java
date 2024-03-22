package algoritimos.java;

import java.util.Scanner;

public class Exercicio78 {
  static void quickSort(char[] vetor, int inicio, int fim) {
    if (inicio < fim) {
      int posicaoPivo = particiona(vetor, inicio, fim);
      quickSort(vetor, inicio, posicaoPivo - 1);
      quickSort(vetor, posicaoPivo + 1, fim);
    }
  }
  static int particiona(char[] vetor, int inicio, int fim) {
    char pivo = vetor[inicio];
    int i = inicio + 1, f = fim;
    while (i <= f) {
      if (vetor[i] <= pivo)
        i++;
      else if (pivo < vetor[f])
        f--;
      else {
        char troca = vetor[i];
        vetor[i] = vetor[f];
        vetor[f] = troca;
        i++;
        f--;
      }
    }
    vetor[inicio] = vetor[f];
    vetor[f] = pivo;
    return f;
  }
  static int buscaBinaria(char[] vetor, int inicio, int fim, char chave) {
    if (fim >= inicio) {
      int meio = inicio + (fim - inicio) / 2;
      if (vetor[meio] == chave)
        return meio;
      if (vetor[meio] > chave)
        return buscaBinaria(vetor, inicio, meio - 1, chave);
      return buscaBinaria(vetor, meio + 1, fim, chave);
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] vetor = new char[10];

    System.out.println("Digite 10 caracteres para preencher o vetor:");
    for (int i = 0; i < 10; i++) {
      vetor[i] = scanner.next().charAt(0);
    }

    System.out.println("Digite o caractere que deseja buscar:");
    char caractereBusca = scanner.next().charAt(0);

    quickSort(vetor, 0, vetor.length - 1);

    int indice = buscaBinaria(vetor, 0, vetor.length - 1, caractereBusca);

    if (indice != -1) {
      System.out.println("O caractere " + caractereBusca + " está no índice: " + indice);
    } else {
      System.out.println("O caractere " + caractereBusca + " não foi encontrado no vetor.");
    }

    scanner.close();
  }
}
