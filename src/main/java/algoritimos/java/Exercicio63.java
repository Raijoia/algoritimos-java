import java.util.Scanner;

    public class Exercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        char[] vetor = new char[10];
        int i, j, meio;
        char temp, busca;

    
        System.out.println("Digite os elementos do vetor:");
        for (i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.next().charAt(0);
        }

        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
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


