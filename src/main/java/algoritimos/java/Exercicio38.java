package algoritimos.java;

import java.util.Scanner;

public class Exercicio38 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double[] vetor = new double[10];
    System.out.println("Digite 10 elementos do vetor:");
    for (int i = 0; i < 10; i++) {
      vetor[i] = scanner.nextDouble();
    }

    System.out.println("Digite o elemento para busca:");
    double elementoBusca = scanner.nextDouble();

    int resultado = buscarMaiorIndice(vetor, elementoBusca);

    if (resultado != -1) {
      System.out.println("O número " + elementoBusca + " está localizado no índice " + (resultado + 1) + " do vetor.");
    } else {
      System.out.println("O elemento não foi encontrado no vetor.");
    }

    scanner.close();
  }

  public static int buscarMaiorIndice(double[] vetor, double elemento) {
    int indice = -1;
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == elemento) {
        indice = i;
      }
    }
    return indice;
  }
}
