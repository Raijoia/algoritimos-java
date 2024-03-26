package algoritimos.java;

import java.util.Scanner;

public class Exercicio11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor de a:");
    double a = scanner.nextDouble();

    System.out.println("Digite o valor de b:");
    double b = scanner.nextDouble();

    System.out.println("Digite o valor de c:");
    double c = scanner.nextDouble();

    double delta = calcularDelta(a, b, c);
    System.out.println("Delta (Δ) = " + delta);

    if (delta < 0) {
      System.out.println("As raízes são imaginárias.");
    } else if (delta == 0) {
      System.out.println("As raízes são reais e iguais.");
      double raiz = calcularRaiz1(a, b, delta);
      System.out.println("Valor das raízes: " + raiz);
    } else {
      System.out.println("As raízes são reais e diferentes.");
      double raiz1 = calcularRaiz1(a, b, delta);
      double raiz2 = calcularRaiz2(a, b, delta);
      System.out.println("Valor da primeira raiz: " + raiz1);
      System.out.println("Valor da segunda raiz: " + raiz2);
    }
    scanner.close();
  }

  public static double calcularDelta(double a, double b, double c) {
    return Math.pow(b, 2) - 4 * a * c;
  }

  public static double calcularRaiz1(double a, double b, double delta) {
    return (-b + Math.sqrt(delta)) / (2 * a);
  }

  public static double calcularRaiz2(double a, double b, double delta) {
    return (-b - Math.sqrt(delta)) / (2 * a);
  }
}
