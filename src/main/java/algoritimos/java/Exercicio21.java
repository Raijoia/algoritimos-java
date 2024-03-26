package algoritimos.java;

import java.util.Scanner;

public class Exercicio21 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número para calcular o fatorial: ");
    int numero = scanner.nextInt();

    if (numero < 0) {
      System.out.println("O fatorial de números negativos não é definido.");
    } else {
      long resultado = calcularFatorial(numero);
      System.out.println("O fatorial de " + numero + " é: " + resultado);
    }

    scanner.close();
  }

  public static long calcularFatorial(int numero) {
    if (numero == 0 || numero == 1) {
      return 1;
    } else {
      return numero * calcularFatorial(numero - 1);
    }
  }
}
