package algoritimos.java;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número a ser verificado:");
            int n = scanner.nextInt();           
                if (NumeroPrimo(n,2)){
                    System.out.println(n + " é um número primo.\n");
                } else {
                    System.out.println(n + " não é um número primo.\n");
                }
                scanner.close(); 
            }

    public static boolean NumeroPrimo (int n, int divisor) {
        if (divisor == 0) {
            divisor = 2;
        }
        System.out.println(divisor);
        if (n <= 1) {
            return false;
        }
        
        if (divisor == n) {
            return true;
        }

        if (n % divisor == 0) {
            return false;
        }

        return NumeroPrimo(n, divisor + 1);
    }
    
    
}

