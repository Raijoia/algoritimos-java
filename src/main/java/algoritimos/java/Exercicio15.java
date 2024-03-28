package algoritimos.java;

import java.util.Scanner;

public class Exercicio15 {
  private static int numeroSecreto;
  private static int contadorPalpites;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nMenu:");
      System.out.println("A- Inserir número secreto");
      System.out.println("B- Jogar");
      System.out.println("C- Apresentar resultados");
      System.out.println("D- Sair");
      System.out.print("Escolha uma opção: ");
      char opcao = scanner.next().charAt(0);

      switch (opcao) {
        case 'A':
          inserirNumeroSecreto(scanner);
          break;
        case 'B':
          jogar(scanner);
          break;
        case 'C':
          apresentarResultados();
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

  private static void inserirNumeroSecreto(Scanner scanner) {
    System.out.print("Digite o número secreto (inteiro e positivo): ");
    numeroSecreto = scanner.nextInt();
    System.out.println("Número secreto definido com sucesso!");
  }

  private static void jogar(Scanner scanner) {
    contadorPalpites = 0;
    while (true) {
      System.out.print("Digite um palpite (ou um número negativo para sair): ");
      int palpite = scanner.nextInt();
      if (palpite < 0) {
        System.out.println("Retornando ao menu principal.");
        return;
      } else if (palpite == numeroSecreto) {
        System.out.println("ACERTOU! Retornando ao menu principal.");
        return;
      } else if (palpite > numeroSecreto) {
        System.out.println("ALTO");
      } else {
        System.out.println("BAIXO");
      }
      contadorPalpites++;
    }
  }

  private static void apresentarResultados() {
    System.out.println("Quantidade de palpites no último jogo: " + contadorPalpites);
  }
}
