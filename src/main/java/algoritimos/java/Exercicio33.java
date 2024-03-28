package algoritimos.java;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] vetor = new char[15]; 
    
        System.out.println("Digite 15 letras para preencher o vetor:");
        for (int i = 0; i < vetor.length; i++) {
          System.out.print("Número " + (i + 1) + ": ");
          vetor[i] = scanner.next().charAt(0);
        }
    
        System.out.print("Digite o caractere que deseja buscar: ");
        char charBusca = scanner.next().charAt(0);
    
        int indice = buscarChar(vetor, charBusca);
    
        if (indice != -1) {
          System.out.println("O número " + charBusca + " foi encontrado no índice " + indice + " do vetor.");
        } else {
          System.out.println("O número " + charBusca + " não foi encontrado no vetor.");
        }
    
        scanner.close();
    }

    public static int buscarChar(char[] vetor, char charBusca) {
        for (int i = 0; i < vetor.length; i++) {
          if (vetor[i] == charBusca) {
            return (i + 1);
          }
        }
        return -1;
      }
}
