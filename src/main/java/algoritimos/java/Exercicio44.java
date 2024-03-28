import java.util.Arrays;
import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[15];
        preencherVetor(vetor, scanner);

        System.out.println("Digite o número de busca:");
        int numeroBusca = scanner.nextInt();

        Arrays.sort(vetor); // Ordena o vetor para utilizar a busca binária
        int indiceEncontrado = buscaBinaria(vetor, numeroBusca);
        if (indiceEncontrado != -1) {
            System.out.println("O número " + numeroBusca + " foi encontrado no índice " + indiceEncontrado + " do vetor.");
        } else {
            System.out.println("O número " + numeroBusca + " não foi encontrado no vetor.");
        }

        scanner.close();
    }

    private static void preencherVetor(int[] vetor, Scanner scanner) {
        System.out.println("Digite os 15 números para preencher o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
    }

    private static int buscaBinaria(int[] vetor, int numeroBusca) {
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (vetor[meio] == numeroBusca) {
                return meio;
            } else if (vetor[meio] < numeroBusca) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1; // Retorna -1 se o número não for encontrado
    }
}
