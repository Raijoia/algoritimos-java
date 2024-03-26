package algoritimos.java;

public class Exercicio2 {
    public static void main(String[] args) {
        int [] vetor = new int[100];

        for (int i = 0; i < vetor.length; i++){
            if (i % 2 == 0) {
                vetor[i] = 0;
            } else {
                vetor[i] = i;
            }
        }

        for (int n : vetor) {
            System.out.println(n + " ");
        }
    }
}
