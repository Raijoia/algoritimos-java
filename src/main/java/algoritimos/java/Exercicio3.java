public class Exercicio3 {
    public static void main(String[] args) {
        char[] vetor = new char[26];
        for (int i = 0; i < 26; i++) {
            vetor[i] = (char) ('A' + i);
        }
        System.out.println("Vetor com caracteres de A até Z:");
        for (char c : vetor) {
            System.out.print(c + " ");
        }
        System.out.println(); 
    }
}
