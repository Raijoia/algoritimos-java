import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] vetor = new char[5];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.next().charAt(0);
        }

        int trocasMelhorCaso = bubbleSort(vetor.clone());
        int trocasPiorCaso = bubbleSort(getVetorInverso(vetor));
        int trocasCasoMedio = bubbleSort(getVetorAleatorio(vetor));

        System.out.println("Número de trocas para o melhor caso: " + trocasMelhorCaso);
        System.out.println("Número de trocas para o pior caso: " + trocasPiorCaso);
        System.out.println("Número de trocas para o caso médio: " + trocasCasoMedio);

        scanner.close();
    }

    private static int bubbleSort(char[] vetor) {
        int trocas = 0;
        boolean trocou;

        for (int i = 0; i < vetor.length - 1; i++) {
            trocou = false;
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    char temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocou = true;
                    trocas++;
                }
            }
            if (!trocou) {
                break; // Se não houve trocas nesta iteração, o vetor está ordenado
            }
        }

        return trocas;
    }

    private static char[] getVetorInverso(char[] vetor) {
        char[] vetorInverso = vetor.clone();
        for (int i = 0; i < vetorInverso.length / 2; i++) {
            char temp = vetorInverso[i];
            vetorInverso[i] = vetorInverso[vetorInverso.length - 1 - i];
            vetorInverso[vetorInverso.length - 1 - i] = temp;
        }
        return vetorInverso;
    }

    private static char[] getVetorAleatorio(char[] vetor) {
       
        return vetor.clone();
    }
}
