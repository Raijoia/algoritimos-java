import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de corredores inscritos na prova:");
        int quantidadeCorredores = scanner.nextInt();

        int[][] dadosCorredores = new int[quantidadeCorredores][3]; // Matriz para armazenar dados dos corredores: [numeroInscricao, posicaoChegada, tempoProva]

        for (int i = 0; i < quantidadeCorredores; i++) {
            System.out.println("Digite o número de inscrição do corredor:");
            dadosCorredores[i][0] = scanner.nextInt();

            System.out.println("Digite a posição de chegada do corredor (0 se não ultrapassou a linha de chegada):");
            dadosCorredores[i][1] = scanner.nextInt();

            System.out.println("Digite o tempo de prova do corredor (em segundos):");
            dadosCorredores[i][2] = scanner.nextInt();
        }

        System.out.println("Digite o número de inscrição do corredor para buscar suas informações:");
        int numeroInscricaoBusca = scanner.nextInt();

        buscarInformacoesCorredor(dadosCorredores, numeroInscricaoBusca);

        scanner.close();
    }

    private static void buscarInformacoesCorredor(int[][] dadosCorredores, int numeroInscricao) {
        for (int i = 0; i < dadosCorredores.length; i++) {
            if (dadosCorredores[i][0] == numeroInscricao) {
                System.out.println("Número de inscrição: " + dadosCorredores[i][0]);
                System.out.println("Posição de chegada: " + dadosCorredores[i][1]);
                System.out.println("Tempo de prova: " + dadosCorredores[i][2] + " segundos");
                return;
            }
        }
        System.out.println("Corredor com número de inscrição " + numeroInscricao + " não encontrado.");
    }
}
