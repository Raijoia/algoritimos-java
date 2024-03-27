package algoritimos.java;

import java.util.Scanner;

public class Exercicio36 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] ra = null;
    double[] notas = null;
    int quantidadeAlunos = 0;

    while (true) {
      System.out.println("\nMenu:");
      System.out.println("A) Cadastrar RA de todos os alunos matriculados");
      System.out.println("B) Cadastrar NOTA de prova para todos os alunos matriculados");
      System.out.println("C) Realizar a busca linear e apresentar a NOTA para um determinado RA");
      System.out.println("D) Sair do programa");
      System.out.print("Escolha uma opção: ");
      char opcao = scanner.next().charAt(0);

      switch (opcao) {
        case 'A':
          System.out.print("Digite a quantidade de alunos matriculados: ");
          quantidadeAlunos = scanner.nextInt();
          ra = cadastrarRA(quantidadeAlunos, scanner);
          break;
        case 'B':
          if (ra == null) {
            System.out.println("É necessário cadastrar os RA dos alunos primeiro.");
          } else {
            notas = cadastrarNotas(quantidadeAlunos, scanner);
          }
          break;
        case 'C':
          if (ra == null || notas == null) {
            System.out.println("É necessário cadastrar os RA e notas dos alunos primeiro.");
          } else {
            realizarBuscaLinear(ra, notas, scanner);
          }
          break;
        case 'D':
          System.out.println("Encerrando o programa.");
          scanner.close();
          return;
        default:
          System.out.println("Opção inválida! Por favor, escolha novamente.");
      }
    }
  }

  public static int[] cadastrarRA(int quantidadeAlunos, Scanner scanner) {
    int[] ra = new int[quantidadeAlunos];
    for (int i = 0; i < quantidadeAlunos; i++) {
      System.out.print("Digite o RA do aluno " + (i + 1) + ": ");
      ra[i] = scanner.nextInt();
    }
    System.out.println("RA cadastrado com sucesso.");
    return ra;
  }

  public static double[] cadastrarNotas(int quantidadeAlunos, Scanner scanner) {
    double[] notas = new double[quantidadeAlunos];
    for (int i = 0; i < quantidadeAlunos; i++) {
      System.out.print("Digite a nota do aluno de RA " + (i + 1) + ": ");
      notas[i] = scanner.nextDouble();
    }
    System.out.println("Notas cadastradas com sucesso.");
    return notas;
  }

  public static void realizarBuscaLinear(int[] ra, double[] notas, Scanner scanner) {
    System.out.print("Digite o RA do aluno para buscar a nota: ");
    int raBusca = scanner.nextInt();
    boolean encontrado = false;
    for (int i = 0; i < ra.length; i++) {
      if (ra[i] == raBusca) {
        System.out.println("Nota do aluno de RA " + ra[i] + ": " + notas[i]);
        encontrado = true;
        break;
      }
    }
    if (!encontrado) {
      System.out.println("RA não encontrado.");
    }
  }
}
