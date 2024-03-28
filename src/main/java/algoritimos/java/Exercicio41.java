import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetor = new double[10];

        System.out.println("Digite os 10 elementos do vetor:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextDouble();
        }

       
        System.out.println("Digite o número que vc quer achar");
        double nBusca = scanner.nextDouble();

       
        int indiceEncontrado = buscaLinearRecursiva(vetor, nBusca, vetor.length - 1);

        if (indiceEncontrado != -1) {
            System.out.println("O número " + nBusca + " está localizado no índice " + indiceEncontrado + " do vetor.");
        } else {
            System.out.println("O número " + nBusca + " não foi encontrado no vetor.");
        }

        scanner.close();
    }

    public static int buscaLinearRecursiva(double[] vetor, double numero, int indice) {
     
        if (indice < 0) {
            return -1; 
        }

        if (vetor[indice] == numero) {
            return indice; 
        }

       
        return buscaLinearRecursiva(vetor, numero, indice - 1);
    }
}
