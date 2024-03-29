package algoritimos.java;
import java.util.Arrays;
import java.util.Random;


public class Exercicio53 {
    private static final int TAMANHO_VETOR = 100;
    private static final int ELEMENTO_MAXIMO = 1000;
    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] vetor = gerarVetorOrdenado(TAMANHO_VETOR);
        
        for (int i = 0; i < 5; i++) {
            int elementoChave = random.nextInt(ELEMENTO_MAXIMO);
            System.out.println("\nElemento Chave: " + elementoChave);
            comparaBusca(vetor, elementoChave);
        }
    }

    private static int[] gerarVetorOrdenado(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(ELEMENTO_MAXIMO);
        }
        Arrays.sort(vetor);
        return vetor;
    }

    private static int buscaLinear(int[] vetor, int chave) {
        int tentativas = 0;
        for (int i = 0; i < vetor.length; i++) {
            tentativas++;
            if (vetor[i] == chave) {
                System.out.println("Busca Linear: Elemento encontrado!");
                return tentativas;
            }
        }
        System.out.println("Busca Linear: Elemento não encontrado!");
        return tentativas;
    }

    private static int buscaBinaria(int[] vetor, int chave) {
        return buscaBinariaRecursiva(vetor, chave, 0, vetor.length - 1, 0);
    }

    private static int buscaBinariaRecursiva(int[] vetor, int chave, int inicio, int fim, int tentativas) {
        tentativas++;
        if (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == chave) {
                System.out.println("Busca Binária: Elemento encontrado!");
                return tentativas;
            } else if (vetor[meio] < chave) {
                return buscaBinariaRecursiva(vetor, chave, meio + 1, fim, tentativas);
            } else {
                return buscaBinariaRecursiva(vetor, chave, inicio, meio - 1, tentativas);
            }
        }
        System.out.println("Busca Binária: Elemento não encontrado!");
        return tentativas;
    }

    private static void comparaBusca(int[] vetor, int chave) {
        int tentativasLinear = buscaLinear(vetor, chave);
        int tentativasBinaria = buscaBinaria(vetor, chave);
        System.out.println("Tentativas de Busca Linear: " + tentativasLinear);
        System.out.println("Tentativas de Busca Binária: " + tentativasBinaria);
        if (tentativasLinear < tentativasBinaria) {
            System.out.println("A Busca Linear foi mais eficiente.");
        } else if (tentativasBinaria < tentativasLinear) {
            System.out.println("A Busca Binária foi mais eficiente.");
        } else {
            System.out.println("Ambos os métodos tiveram a mesma eficiência.");
        }
    }
}
