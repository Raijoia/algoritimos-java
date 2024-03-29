
import java.util.Scanner;

public class Exercicio68 {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        char[] vetor = new char[10];
        int i, j, meio;
        char busca;
        System.out.println("Digite os elementos do vetor:");
        for (i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.next().charAt(0);
        }
        for (i = 0; i < 9; i++) {
            int minIndex = i;
            for (j = i + 1; j < 10; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                char temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
            }
        }
        System.out.println("\nVetor ordenado:");
        for (i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.print("\nDigite o caractere a ser buscado: ");
        busca = scanner.next().charAt(0);
        int indice = inicioFim(vetor, busca, 0, 9);
        if (indice == -1) {
            System.out.println("Caractere não encontrado no vetor.");
        } else {
            System.out.println("O caractere '" + busca + "' foi encontrado no índice " + indice + " do vetor.");
        }
        scanner.close();
    }
}
public static int inicioFim(char[] vetor, char busca, int inicio, int fim) {
    if (inicio <= fim) {
        int meio = (inicio + fim) / 2;
        if (vetor[meio] == busca) {
            return meio;
        } else if (vetor[meio] < busca) {
            return inicioFim(vetor, busca, meio + 1, fim);
        } else {
            return inicioFim(vetor, busca, inicio, meio - 1);
        }
    }
    return -1; 
}
}


