import java.util.Arrays;

import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vetor = new char[5];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.next().charAt(0);
        }

        int operacoesMelhorCaso = calcularOperacoesInsercaoMelhorCaso(vetor.clone());
        int operacoesPiorCaso = calcularOperacoesInsercaoPiorCaso(vetor.clone());

        System.out.println("Número de operações de inserção para o melhor caso: " + operacoesMelhorCaso);
        System.out.println("Número de operações de inserção para o pior caso: " + operacoesPiorCaso);

        scanner.close();
    }

    public static int calcularOperacoesInsercaoMelhorCaso(char[] vetor) {
        int operacoes = 0;
        for (int i = 1; i < vetor.length; i++) {
            char chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
                operacoes++; // Conta cada operação de inserção
            }
            vetor[j + 1] = chave;
        }
        return operacoes;
    }

    public static int calcularOperacoesInsercaoPiorCaso(char[] vetor) {
        int operacoes = 0;
        for (int i = 1; i < vetor.length; i++) {
            char chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] < chave) {
                vetor[j + 1] = vetor[j];
                j--;
                operacoes++; // Conta cada operação de inserção
            }
            vetor[j + 1] = chave;
        }
        return operacoes;
    }
}

