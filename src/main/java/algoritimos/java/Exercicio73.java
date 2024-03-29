import java.util.Scanner;

public class Exercicio73 {
    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
            char[] vetor = new char[10];
            System.out.println("Digite os elementos do vetor:");
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = scanner.next().charAt(0);
            }
            insertionSort(vetor);
            System.out.println("\nVetor ordenado:");
            for (char c : vetor) {
                System.out.print(c + " ");
            }
            System.out.println("\n\nDigite o caractere que deseja buscar:");
            char caractere = scanner.next().charAt(0);
            int indice = bB(vetor, caractere, 0, vetor.length - 1);
            if (indice != -1) {
                System.out.println("O caractere '" + caractere + "' está no índice " + indice + " do vetor.");
            } else {
                System.out.println("O caractere '" + caractere + "' não foi encontrado no vetor.");
            }
        }
    }
    public static void insertionSort(char[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            char chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
    }
    public static int bB(char[] vetor, char chave, int inicio, int fim) {
        if (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == chave) {
                return meio;
            } else if (vetor[meio] < chave) {
                return bB(vetor, chave, meio + 1, fim);
            } else {
                return bB(vetor, chave, inicio, meio - 1);
            }
        }
        return -1;
    }
}
