package algoritimos.java;
import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números a serem organizados:");
        int tamanho = scanner.nextInt();

        int[] vetor = new int [tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            vetor[i] = scanner.nextInt();
        }
        System.out.println();

        bubbleSort(vetor);

        System.out.println("Números ordenados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");

        scanner.close();
    }
    
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocou;
    
        do {
          trocou = false;
          for (int i = 0; i < n - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
              int temp = vetor[i];
              vetor[i] = vetor[i + 1];
              vetor[i + 1] = temp;
              trocou = true;
            }
          }
          n--;
        } while (trocou);
      }
}
