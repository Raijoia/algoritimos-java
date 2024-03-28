
import java.util.Scanner;
public class Exercicio54 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] vetor = new int[15];
    System.out.println("Digite 15 numeros:");
    for (int i = 0; i < vetor.length; i++) {
        vetor[i] = scanner.nextInt();
    }
    bubbleSort(vetor);
    System.out.println("Digite o numero que deseja");
    int numeroBusca = scanner.nextInt();

    
    int indice = buscaBinRec(vetor, numeroBusca, 0, vetor.length - 1);


    if (indice == -1) {
        System.out.println("Numero nao encontrado no vetor.");
    } else {
        System.out.println("Numero encontrado no indice: " + indice);
    }
}
public static int buscaBinRec(int[] vetor, int numeroBusca, int inicio, int fim) {
    if (inicio > fim) {
        return -1; 
    }
    int meio = (inicio + fim) / 2;

    if (vetor[meio] == numeroBusca) {
        return meio; 
    } else if (vetor[meio] < numeroBusca) {
        return buscaBinRec(vetor, numeroBusca, meio + 1, fim); 
    } else {
        return buscaBinRec(vetor, numeroBusca, inicio, meio - 1); 
    }
}
public static void bubbleSort(int[] vetor) {
    int n = vetor.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (vetor[j] > vetor[j + 1]) {
                int temp = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = temp;
            }
        }
    }
}
}


