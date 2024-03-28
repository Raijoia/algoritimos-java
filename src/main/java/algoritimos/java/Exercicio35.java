package algoritimos.java;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de corredores inscritos na prova:");
        int quantidadeCorredores = scanner.nextInt();

        // Criar matriz para armazenar as informações dos corredores
        int[][] dadosCorredores = new int[quantidadeCorredores][3]; // [Número de inscrição, Posição de chegada, Tempo de prova]

        // Digitar os dados dos corredores
        for (int i = 0; i < quantidadeCorredores; i++) {
            System.out.println("Digite o número de inscrição do corredor:");
            dadosCorredores[i][0] = scanner.nextInt();

            System.out.println("Digite a posição de chegada do corredor:");
            dadosCorredores[i][1] = scanner.nextInt();

            System.out.println("Digite o tempo de prova (em segundos) do corredor:");
            dadosCorredores[i][2] = scanner.nextInt();
        }

        // Realizar busca da posição de chegada e do tempo de prova para um determinado corredor
        System.out.println("Digite o número de inscrição do corredor que deseja buscar:");
        int numeroInscricaoBusca = scanner.nextInt();

        boolean corredorEncontrado = false;
        for (int i = 0; i < quantidadeCorredores; i++) {
            if (dadosCorredores[i][0] == numeroInscricaoBusca) {
                System.out.println("Número de inscrição: " + dadosCorredores[i][0]);
                System.out.println("Posição de chegada: " + dadosCorredores[i][1]);
                System.out.println("Tempo de prova: " + dadosCorredores[i][2] + " segundos");
                corredorEncontrado = true;
                break;
            }
        }

        if (!corredorEncontrado) {
            System.out.println("Corredor com número de inscrição " + numeroInscricaoBusca + " não encontrado.");
        }
    }
}
