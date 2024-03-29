import java.util.Scanner;
public class Exercicio55 {

public static int bB(char[] vetor, char chave, int inicio, int fim) {
    if (inicio > fim) {
        return -1; 
    }
    
    int meio = (inicio + fim) / 2;
    
    if (vetor[meio] == chave) {
        return meio; 
    } else if (vetor[meio] < chave) {
        return bB(vetor, chave, meio + 1, fim);
    } else {
        return bB(vetor, chave, inicio, meio - 1); 
    }
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite uma string de 15 caracteres:");
    String entrada = scanner.nextLine();

    if (entrada.length() != 15) {
        System.out.println("A string deve conter exatamente 15 caracteres.");
        return;
    }
    char[] vetor = entrada.toCharArray();

    System.out.println("Digite o caractere de busca:");
    char caractereBusca = scanner.next().charAt(0);

    int indice = bB(vetor, caractereBusca, 0, vetor.length - 1);

    if (indice != -1) {
        System.out.println("O caractere foi encontrado na posição " + indice);
    } else {
        System.out.println("O caractere não foi encontrado.");
    }

    scanner.close();
}
}


