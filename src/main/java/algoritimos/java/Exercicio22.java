package algoritimos.java;

import java.util.Scanner;

public class Exercicio22 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor de N para calcular o N-ésimo elemento da série de Fibonacci: ");
    int n = scanner.nextInt();

    long resultado = calcularFibonacci(n);
    System.out.println("O " + n + "º elemento da série de Fibonacci é: " + resultado);

    scanner.close();
  }

  public static long calcularFibonacci(int n) {
    if (n <= 1) {
      return n;
    } else {
      return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
  }
}
