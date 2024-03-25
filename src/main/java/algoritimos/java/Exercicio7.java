package algoritimos.java;
import java.util.Scanner;

public class Exercicio7 {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de linhas da matriz:");
        int linhas = scanner.nextInt();

        System.out.println("Digite a quantidade de colunas da matriz:");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[][] transposta = calculaTransposta(matriz);
        System.out.println("Matriz transposta:");
        imprimirMatriz(transposta);

        scanner.close();
    }

    public static int[][] calculaTransposta(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
               transposta[j][i] = matriz[i][j]; 
            }
        }

        return transposta;
    }

    public static void imprimirMatriz(int[][] matriz) {
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
                if (j < matriz[0].length - 1) {
                    System.out.print(", ");
                } else {
                    System.out.print("}");
                }
            }
            System.out.println("");
        }
    }
}
