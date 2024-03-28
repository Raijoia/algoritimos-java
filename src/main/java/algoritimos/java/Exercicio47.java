package algoritimos.java;

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de corredores inscritos na prova:");
        int quantidadeCorredores = scanner.nextInt();

        
        int[][] dadosCorredores = new int[quantidadeCorredores][3];

        
        for (int i = 0; i < quantidadeCorredores; i++) {
            System.out.println("Digite o número de inscrição do corredor:");
            dadosCorredores[i][0] = scanner.nextInt();

            System.out.println("Digite a posição de chegada do corredor:");
            dadosCorredores[i][1] = scanner.nextInt();

            System.out.println("Digite o tempo de prova (em segundos) do corredor:");
            dadosCorredores[i][2] = scanner.nextInt();
        }
        
        realizarBuscaBunaria(dadosCorredores, scanner);

        scanner.close();
    }

    public static void realizarBuscaBunaria(int[][] dadosCorredores, Scanner scanner) {
        System.out.print("Digite o número de inscrição que deseja buscar: ");
        int numBusca = scanner.nextInt();
        boolean encontrado = false;
        int inicio = 0;
        int fim = dadosCorredores.length - 1;
        
        while (inicio <= fim) {
          int meio = (inicio + fim) / 2;
    
          if (dadosCorredores[meio][meio] == numBusca) {
            System.out.println("Dados do corredor de inscrição: " + dadosCorredores[meio][meio]);
            encontrado = true;
            break;
          } else if (dadosCorredores[meio][meio] < numBusca) {
            inicio = meio + 1;
          } else {
            fim = meio - 1;
          }
        }
        if (!encontrado) {
          System.out.println(numBusca + "º corredor não encontrado.");
        }
      }
}
