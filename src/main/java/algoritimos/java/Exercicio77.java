package algoritimos.java;

import java.util.Scanner;

public class Exercicio77 {
  public static void quickSort(double v[], int inicio, int fim) {
    if (inicio < fim) {
      int posicaoPivo = particionar(v, inicio, fim);
      quickSort(v, inicio, posicaoPivo - 1);
      quickSort(v, posicaoPivo + 1, fim);
    }
  }

  public static int particionar(double v[], int inicio, int fim) {
    double pivo = v[inicio];
    int i = inicio + 1, f = fim;
    while (i <= f) {
      if (v[i] <= pivo) {
        i++;
      } else if (pivo < v[f]) {
        f--;
      } else {
        double troca = v[i];
        v[i] = v[f];
        v[f] = troca;
        i++;
        f--;
      }
    }
    v[inicio] = v[f];
    v[f] = pivo;
    return f;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Digite 20 doubles");
    double[] arr = new double[20];

    for (int i = 0; i < 20; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arr[i] = s.nextDouble();
    }

    quickSort(arr, 0, arr.length - 1);

    System.out.println("Array ordenado:");
    for (int i = 0; i < 20; i++) {
      System.out.print(arr[i] + " ");
    }

    s.close();
  }
}
