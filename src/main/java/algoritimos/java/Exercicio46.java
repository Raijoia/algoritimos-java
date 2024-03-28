import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char[] vetor = new char[15];
        preencherVetor(vetor, scanner);
        
        System.out.println("Digite o caractere de busca:");
        char caractereBusca = scanner.next().charAt(0);
        
        int indiceEncontrado = buscaLinear(vetor, caractereBusca);
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
    
    private static int buscaLinear(char[] vetor, char caractereBusca) {
        for (int i = 0; i < vetor.length && vetor[i] != '\u0000'; i++) {
            if (vetor[i] == caractereBusca) {
                return i;
            }
        }
        return -1; // Retorna -1 se o caractere não for encontrado
    }
}
