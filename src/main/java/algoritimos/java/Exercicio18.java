import java.util.Scanner;
public class Exercicio18 {

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int lerNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Digite um número inteiro maior que zero:");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Número inválido. Por favor, digite um número inteiro maior que zero.");
            }
        } while (numero <= 0);
        scanner.close();
        return numero;
    }

   
    public static void main(String[] args) {
        int numero = lerNumero();

        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}


