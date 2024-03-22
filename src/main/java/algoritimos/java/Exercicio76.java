import java.util.Scanner;

public class Exercicio76 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar o vetor de tamanho 20
        double[] vetor = new double[20];

        // Receber os valores do usuário
        System.out.println("Digite os 20 valores para preencher o vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o valor #" + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        // Chamar a função de ordenação Quick-Sort
        quickSortDecrescente(vetor, 0, vetor.length - 1);

        // Exibir o vetor ordenado em tela
        System.out.println("\nVetor ordenado em ordem decrescente:");
        for (double num : vetor) {
            System.out.println(num);
        }

        scanner.close();
    }

    // Implementação do algoritmo Quick-Sort
    public static void quickSortDecrescente(double[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particionar(vetor, inicio, fim);
            quickSortDecrescente(vetor, inicio, posicaoPivo - 1);
            quickSortDecrescente(vetor, posicaoPivo + 1, fim);
        }
    }

    // Função para particionar o vetor
    public static int particionar(double[] vetor, int inicio, int fim) {
        double pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] >= pivo)
                i++;
            else if (pivo > vetor[f])
                f--;
            else {
                double troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
