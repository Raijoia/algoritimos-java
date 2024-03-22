package algoritimos.java;

import java.util.Scanner;

public class Exercicio82 {
  public static double[] MergeSort(double v[]) {
    if (v.length > 1) {
      int meio = v.length / 2;
      double v1[] = new double[meio];
      double v2[] = new double[v.length - meio];

      for(int i = 0; i < meio; i++)  v1[i] = v[i];
      for(int i = meio; i < (meio + (v.length - meio)); i++) v2[i - meio] =  v[i];

      v1 = MergeSort(v1);
      v2 = MergeSort(v2);
      v = Merge(v, v1, v2);
      return v;
    }
    return v;
  }

  public static double[] Merge(double w[], double w1[], double w2[]) {
    int i = 0, j = 0, k = 0;

    while(w1.length != j && w2.length != k) {
      if(w1[j] >= w2[k]) {
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

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Digite 20 doubles");
    double[] arr = new double[20];

    for (int i = 0; i < 20; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arr[i] = s.nextDouble();
      System.out.println(arr[i]);
    }

    double organizado[] = MergeSort(arr);

    for (int i = 0; i < 20; i++) {
      System.out.print(organizado[i] + " ");
    }

    s.close();
  }
}
