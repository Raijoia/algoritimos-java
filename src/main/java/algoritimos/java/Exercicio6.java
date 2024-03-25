package algoritimos.java;

public class Exercicio6 {
  static int linhas = 3;
  static int colunas = 3;
  static int[][] matriz = new int[3][3];

  public static void main(String[] args) {
    preencherMatriz();

    System.out.println("Matriz antes de limpar:");
    imprimirMatriz();

    limparMatriz();

    System.out.println("\nMatriz após limpar:");
    imprimirMatriz();
  }

  public static void preencherMatriz() {
    int valor = 1;
    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        matriz[i][j] = valor++;
      }
    }
  }

  public static void limparMatriz() {
    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        matriz[i][j] = -1;
      }
    }
  }

  public static void imprimirMatriz() {
    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
