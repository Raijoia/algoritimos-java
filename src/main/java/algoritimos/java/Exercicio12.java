package algoritimos.java;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número a ser verificado:");
            int n = scanner.nextInt();
            boolean primo = NumeroPrimo(n);
            if ( n <= 0 ){
                System.out.println("Número deve ser maior que 0");
            } else {
                if (primo){
                    System.out.println(n + " é um número primo.\n");
                } else {
                    System.out.println(n + " não é um número primo.\n");
                }
            }
        scanner.close();    
    }
    public static boolean NumeroPrimo (int n) {
        boolean primo = true;
            if(n <= 1) {
        primo = false;
        return primo;
        } else {
        for (int i = 2; i<= n/2; i++) {
            if ((n % i) == 0){
            primo = false;
            break;
            }
        }
        return primo;
        }
    }
}
