package algoritimos.java;

import java.util.Scanner;

public class Exercicio39 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] vetor = new int[10]; 

    System.out.println("Digite 10 números para preencher o vetor:");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Número " + (i + 1) + ": ");
      vetor[i] = scanner.nextInt();
    }

    System.out.print("Digite o número que deseja buscar: ");
    int numeroBusca = scanner.nextInt();

    int indice = buscarNumero(vetor, numeroBusca, 0);

    if (indice != -1) {
      System.out.println("O número " + numeroBusca + " foi encontrado no índice " + (indice + 1) + " do vetor.");
    } else {
      System.out.println("O número " + numeroBusca + " não foi encontrado no vetor.");
    }

    scanner.close();
  }


  public static int buscarNumero(int[] vetor, int numeroBusca, int indice) {
    if (vetor[indice] == numeroBusca) {
        return indice;
    } else if (vetor[indice] != numeroBusca ) {
       return buscarNumero(vetor, numeroBusca, indice + 1);
    } else {
        System.out.println("Numero não está no vetor");
        return -1;
    }
  }
}
