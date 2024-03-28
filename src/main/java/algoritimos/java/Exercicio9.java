package algoritimos.java;

import java.util.Scanner;

public class Exercicio9 {
    static int[][] matriz;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz quadrada (n x n):");
        int n = scanner.nextInt();

        matriz = new int[n][n];

        System.out.println("Digite os elementos da matriz:");

        // Preencher a matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificar se é uma matriz identidade
        boolean isIdentidade = verificarIdentidade();

        if (isIdentidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz não é uma matriz identidade.");
        }
    }

    public static boolean verificarIdentidade() {
        int n = matriz.length;

        // Verificar se é uma matriz quadrada
        for (int i = 0; i < n; i++) {
            if (matriz[i].length != n) {
                return false;
            }
        }

        // Verificar se os elementos da diagonal principal são iguais a 1
        for (int i = 0; i < n; i++) {
            if (matriz[i][i] != 1) {
                return false;
            }
        }

        // Verificar se todos os outros elementos são iguais a 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
