package algoritimos.java;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        int vet[]; 
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.println("Digite o " + (i+1) + "º elemento da soma:");
            vet[i] = scanner.nextInt();
        }
    }
}
