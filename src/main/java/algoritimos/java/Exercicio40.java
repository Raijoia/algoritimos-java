package algoritimos.java;
import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        char[] vetor = new char[10]; 
    
        System.out.println("Digite 10 letras para preencher o vetor:");
        for (int i = 0; i < vetor.length; i++) {
          System.out.print((i + 1) + "ª letra: ");
          vetor[i] = scanner.next().charAt(0);
        }
    
        System.out.print("Digite a letra que deseja buscar: ");
        char charBusca = scanner.next().charAt(0);
    
        int indice = buscarChar(vetor, charBusca, 9);
    
        if (indice != -1) {
          System.out.println("A letra " + charBusca + " foi encontrada no " + (indice + 1) + "º índice do vetor.");
        } else {
          System.out.println("A letra \"" + charBusca + "\" não foi encontrada no vetor.");
        }
    
        scanner.close();
      }
    
    
      public static int buscarChar(char[] vetor, int charBusca, int indice) {
        
        if (vetor[indice] == charBusca) {
            return indice;
        } else if (vetor[indice] != charBusca ) {
           return buscarChar(vetor, charBusca, indice -1);
        } else {
            System.out.println("Letra não está no vetor");
            return -1;
        }
      }
}
