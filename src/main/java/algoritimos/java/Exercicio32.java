package algoritimos.java;

import java.util.Scanner;

public class Exercicio32 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] vetor = new int[15]; // Criando um vetor de tamanho 15

    System.out.println("Digite 15 números para preencher o vetor:");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Número " + (i + 1) + ": ");
      vetor[i] = scanner.nextInt();
    }

    System.out.print("Digite o número que deseja buscar: ");
    int numeroBusca = scanner.nextInt();

    int indice = buscarNumero(vetor, numeroBusca);

    if (indice != -1) {
      System.out.println("O número " + numeroBusca + " foi encontrado no índice " + indice + " do vetor.");
    } else {
      System.out.println("O número " + numeroBusca + " não foi encontrado no vetor.");
    }

    scanner.close();
  }


  public static int buscarNumero(int[] vetor, int numeroBusca) {
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == numeroBusca) {
        return (i + 1);
      }
    }
    return -1;
  }
}
