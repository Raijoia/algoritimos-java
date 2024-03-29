public class Exercicio4 {
    
        public static void main(String[] args) {
           
            char[] vetor = new char[26];
            for (int i = 0; i < 26; i++) {
                vetor[i] = (char) ('A' + i);
            }
    
           
            for (int i = 0; i < vetor.length - 1; i += 2) {
                char temp = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = temp;
            }
    
            
            System.out.println("Vetor após a troca de elementos de dois em dois:");
            for (char c : vetor) {
                System.out.print(c + " ");
            }
            System.out.println(); 
        }
    }
    

