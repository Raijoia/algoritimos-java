package algoritimos.java;

import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
      char[] vetor = new char[10];

      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite 10 caracteres em ordem crescente:");
      for (int i = 0; i < vetor.length; i++) {
        vetor[i] = scanner.next().charAt(0);
      }

      System.out.println("Digite o caractere a ser buscado:");
      char elemento = scanner.next().charAt(0);

      int indice = buscaIndice(vetor, elemento, 0, vetor.length - 1);

      if (indice != -1) {
        System.out.println("O caractere '" + elemento + "' está no índice " + (indice + 1) + " do vetor.");
      } else {
        System.out.println("O caractere '" + elemento + "' não está presente no vetor.");
      }

      scanner.close();
    }
    
    public static int buscaIndice(char[] vetor, char elemento, int inicio, int fim) {
        if (inicio > fim) {
          return -1;
        }
    
        int meio = (inicio + fim) / 2;
    
        if (vetor[meio] == elemento) {
          return meio;
        } else if (vetor[meio] < elemento) {
          return buscaIndice(vetor, elemento, inicio, meio - 1);
        } else {
          return buscaIndice(vetor, elemento, meio + 1, fim);
        }
      }
}
