import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio43 {
    private static final int TAMANHO_VETOR = 1000;
    private static final int VALOR_MAXIMO = 10000;
    private static int[] vetor = new int[TAMANHO_VETOR];

    public static void main(String[] args) {
        preencherVetor();
        Arrays.sort(vetor); // Ordena o vetor para permitir a busca binária
        
        Scanner scanner = new Scanner(System.in);
        int chave;
        do {
            System.out.println("Digite um valor para buscar (ou 0 para sair):");
            chave = scanner.nextInt();
            if (chave != 0) {
                buscarLinear(chave);
                buscarBinaria(chave);
            }
        } while (chave != 0);
        scanner.close();
    }

    private static void preencherVetor() {
        Random random = new Random();
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetor[i] = random.nextInt(VALOR_MAXIMO);
        }
    }

    private static void buscarLinear(int chave) {
        int tentativas = 0;
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            tentativas++;
            if (vetor[i] == chave) {
                System.out.println("Busca linear: Elemento encontrado na posição " + i + ". Tentativas: " + tentativas);
                return;
            }
        }
        System.out.println("Busca linear: Elemento não encontrado. Tentativas: " + tentativas);
    }

    private static void buscarBinaria(int chave) {
        int tentativas = 0;
        int inicio = 0;
        int fim = TAMANHO_VETOR - 1;
        while (inicio <= fim) {
            tentativas++;
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == chave) {
                System.out.println("Busca binária: Elemento encontrado na posição " + meio + ". Tentativas: " + tentativas);
                return;
            } else if (vetor[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        System.out.println("Busca binária: Elemento não encontrado. Tentativas: " + tentativas);
    }
}
