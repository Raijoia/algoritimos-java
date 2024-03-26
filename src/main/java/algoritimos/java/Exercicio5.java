 import java.util.Scanner;

public class ContadorCapicuas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[16];
        System.out.println("Digite os 16 elementos do vetor:");
        for (int i = 0; i < 16; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        int totalCapicuas = contarCapicuas(vetor);
        
        System.out.println("Total de Capicuas: " + totalCapicuas);
    }
    
    public static int contarCapicuas(int[] vetor) {
        int total = 0;
        for (int i = 0; i <= vetor.length - 4; i++) {
            if (ehCapicua(vetor, i, i + 3)) {
                total++;
                System.out.println("Capicua encontrada: " + vetor[i] + vetor[i + 1] + vetor[i + 2] + vetor[i + 3] + " (índices " + i + ", " + (i + 1) + ", " + (i + 2) + " e " + (i + 3) + ")");
            }
        }
        return total;
    }
    
    public static boolean ehCapicua(int[] vetor, int inicio, int fim) {
        while (inicio < fim) {
            if (vetor[inicio] != vetor[fim]) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}
