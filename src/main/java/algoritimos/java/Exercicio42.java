package algoritimos.java;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
      char[] vetor = new char[10];

      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite 10 caracteres em ordem crescente:");
      for (int i = 0; i < vetor.length; i++) {
        vetor[i] = scanner.next().charAt(0);
      }

      System.out.println("Digite o caractere a ser buscado:");
      char elemento = scanner.next().charAt(0);

      int indice = buscaBinariaIterativa(vetor, elemento);

      if (indice != -1) {
        System.out.println("O caractere '" + elemento + "' está no índice " + (indice + 1) + " do vetor.");
      } else {
        System.out.println("O caractere '" + elemento + "' não está presente no vetor.");
      }

      scanner.close();
    }

    public static int buscaBinariaIterativa(char[] vetor, char elemento) {
      int inicio = 0;
      int fim = vetor.length - 1;

      while (inicio <= fim) {
        int meio = (inicio + fim) / 2;

        if (vetor[meio] == elemento) {
          return meio;
        } else if (vetor[meio] < elemento) {
          inicio = meio + 1;
        } else {
          fim = meio - 1;
        }
      }

      return -1;
    }
}
