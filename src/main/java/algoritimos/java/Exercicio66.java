import java.util.Scanner;

public class Exercicio66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[20];

        // Recebendo os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
        }

        // Ordenando o vetor em ordem decrescente usando o método de seleção
        ordenacaoPorSelecaoDecrescente(vetor);

        // Apresentando o vetor ordenado em tela
        System.out.println("Vetor ordenado em ordem decrescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }

    public static void ordenacaoPorSelecaoDecrescente(double[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int indiceMaximo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] > vetor[indiceMaximo]) {
                    indiceMaximo = j;
                }
            }
            if (indiceMaximo != i) {
                double temp = vetor[i];
                vetor[i] = vetor[indiceMaximo];
                vetor[indiceMaximo] = temp;
            }
        }
    }
}
