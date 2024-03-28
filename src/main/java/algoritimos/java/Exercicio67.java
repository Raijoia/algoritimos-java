public class Exercicio67 {
    public static void main(String[] args) {
        int[] vetor = {5, 4, 3, 2, 1}; 

        int operacoesMelhorCaso = calcularOperacoesSelecaoMelhorCaso(vetor.clone());
        int operacoesPiorCaso = calcularOperacoesSelecaoPiorCaso(vetor.clone());

        System.out.println("Número de operações de seleção para o melhor caso: " + operacoesMelhorCaso);
        System.out.println("Número de operações de seleção para o pior caso: " + operacoesPiorCaso);
    }

    public static int calcularOperacoesSelecaoMelhorCaso(int[] vetor) {
        int operacoes = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
                operacoes++; // Conta cada comparação de elemento
            }
            int temp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = temp;
        }
        return operacoes;
    }

    public static int calcularOperacoesSelecaoPiorCaso(int[] vetor) {
        int operacoes = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            int indiceMaximo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] > vetor[indiceMaximo]) {
                    indiceMaximo = j;
                }
                operacoes++; // Conta cada comparação de elemento
            }
            int temp = vetor[indiceMaximo];
            vetor[indiceMaximo] = vetor[i];
            vetor[i] = temp;
        }
        return operacoes;
    }
}
