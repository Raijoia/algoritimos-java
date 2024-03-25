package algoritimos.java;

import java.util.Scanner;

public class Exercicio16 {
  public static boolean isPar(int valor) {
    if(valor % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Digite o numero: ");
    int valor = s.nextInt();

    System.out.println(isPar(valor) ? "e par" : "e impar");
  }
}
