package algoritimos.java;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio80 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos números deseja organizar?");
    int tamanho = scanner.nextInt();

    int iVet[] = new int[tamanho];

    System.out.println("Digite os números:");

    for (int i = 0; i < tamanho; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        iVet[i] = scanner.nextInt();
    }

    int organizado[] = new int[tamanho];
    organizado = MergeSort(iVet);

    System.out.println("Números organizados:");

    for (int i = 0; i < tamanho; i++) {
      System.out.print(iVet[i] + " ");
    }

    scanner.close();
  }
  public static int[] MergeSort(int v[]) {
    if (v.length > 1) {
      int meio = v.length / 2;
      int v1[] = new int[meio];
      int v2[] = new int[v.length - meio];

      for(int i = 0; i < meio; i++)  v1[i] = v[i];
      for(int i = meio; i < (meio + (v.length - meio)); i++) v2[i - meio] =  v[i];

      v1 = MergeSort(v1);
      v2 = MergeSort(v2);
      v = Merge(v, v1, v2);
      return v;
    }
    return v;
  }
  public static int[] Merge(int w[], int w1[], int w2[]) {
    int i = 0, j = 0, k = 0;

    while(w1.length != j && w2.length != k) {
      if(w1[j] <= w2[k]) {
        w[i] = w1[j];
        j++;
        i++;
      } else {
        w[i] = w2[k];
        i++;
        k++;
      }
    }

    while(w1.length != j) {
      w[i] = w1[j];
      j++;
      i++;
    }

    while(w2.length != k) {
      w[i] = w2[k];
      i++;
      k++;
    }

    return w;
  }
}  