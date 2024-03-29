import java.util.Scanner;
public class exercicio25 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            float[] vetor = new float[10];
            System.out.println("Digite os 10 elementos do vetor:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                vetor[i] = scanner.nextFloat();
            }
            System.out.print("Digite o elemento a ser buscado no vetor: ");
            float elemento = scanner.nextFloat();
            int indice = procelem(vetor, elemento, 0);
            if (indice == -1) {
                System.out.println("O elemento " + elemento + " não foi encontrado no vetor.");
            } else {
                System.out.println("O número " + elemento + " está localizado no índice " + indice + " do vetor.");
            }
    
            scanner.close();
        }
        public static int  procelem(float[] vetor, float elemento, int ind) {
          
            if (ind == vetor.length) {
                return -1;
            }
            if (vetor[ind] == elemento) {
                return ind;
            }
            return  procelem(vetor, elemento, ind + 1);
        }
    }
    