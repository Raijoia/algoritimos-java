import java.util.Scanner;

public class exercicio61 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[20];

        System.out.println("Digite os valores do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
        }

        ordDec(vetor);

        System.out.println("Vetor ordenado em ordem decrescente:");
        for (double valor : vetor) {
            System.out.println(valor);
        }

        scanner.close();
    }
    public static void ordDec(double[] vetor) {
        int n = vetor.length;
        boolean trocado;
        do {  trocado = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] < vetor[i + 1]) {
                    double temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocado = true;
                }
            }
        } while (trocado);
    }
}
