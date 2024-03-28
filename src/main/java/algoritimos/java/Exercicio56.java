import java.util.Arrays;
import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char[] vetor = new char[15];
        preencherVetor(vetor, scanner);
        
        System.out.println("Digite o caractere de busca:");
        char caractereBusca = scanner.next().charAt(0);
        
        Arrays.sort(vetor); // Ordena o vetor para utilizar a busca binária
        int indiceEncontrado = buscaBinariaRecursiva(vetor, caractereBusca, 0, vetor.length - 1);
        if (indiceEncontrado != -1) {
            System.out.println("O caractere '" + caractereBusca + "' foi encontrado no índice " + indiceEncontrado + " do vetor.");
        } else {
            System.out.println("O caractere '" + caractereBusca + "' não foi encontrado no vetor.");
        }
        
        scanner.close();
    }
    
    private static void preencherVetor(char[] vetor, Scanner scanner) {
        System.out.println("Digite uma string de no máximo 15 caracteres para preencher o vetor:");
        String input = scanner.next();
        
        for (int i = 0; i < Math.min(input.length(), vetor.length); i++) {
            vetor[i] = input.charAt(i);
        }
    }
    
    private static int buscaBinariaRecursiva(char[] vetor, char caractereBusca, int esquerda, int direita) {
        if (esquerda > direita) {
            return -1; // Retorna -1 se o caractere não for encontrado
        }
        
        int meio = (esquerda + direita) / 2;
        
        if (vetor[meio] == caractereBusca) {
            return meio;
        } else if (vetor[meio] < caractereBusca) {
            return buscaBinariaRecursiva(vetor, caractereBusca, meio + 1, direita);
        } else {
            return buscaBinariaRecursiva(vetor, caractereBusca, esquerda, meio - 1);
        }
    }
}
