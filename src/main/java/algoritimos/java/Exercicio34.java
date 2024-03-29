import java.util.Scanner;

public class exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma string com no máximo 15 caracteres: ");
        String input = sc.nextLine();
        
        if (input.length() > 15) {
            System.out.println("A string tem mais de 15 caracteres tente novamente.");
            return;
        }
        char[] vetor = input.toCharArray();
        
        System.out.print("Digite o caractere que deseja ");
        char caractereBusca = sc.next().charAt(0);
        
        int indice = buscaLin(vetor, caractereBusca);
        if (indice != -1) {
            System.out.println("O caractere foi encontrado no índice: " + indice);
        } else {
            System.out.println("O caractere não foi encontrado.");
        }
    }
    public static int buscaLin(char[] vetor, char caractere) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == caractere) {
                return i; 
            }
        }
        return -1; 
    }
}
