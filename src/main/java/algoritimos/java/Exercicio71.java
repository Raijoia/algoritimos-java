import java.util.Scanner;

public class exercicio71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[20];

        System.out.println("Digite os elementos do vetor");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
        }
        ordemDec(vetor);
        System.out.println("Vetor ordenado em ordem decrescente:");
        for (double elemento : vetor) {
            System.out.print(elemento + " ");
        }
        scanner.close();
    }
    public static void ordemDec(double[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            double chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] < chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }
}


