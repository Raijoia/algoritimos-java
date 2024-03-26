import java.util.Scanner;

public class MenuNavegacaoVetor {
    static double[] vetor;
    static int posicaoAtual;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        vetor = new double[10];
        posicaoAtual = 0;

        System.out.println("Digite os 10 elementos do vetor:");

        // Carregar os elementos do vetor via teclado
        carregarVetor(scanner);

        // Apresentar menu de opções
        while (true) {
            apresentarMenu(scanner);
        }
    }

    public static void carregarVetor(Scanner scanner) {
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextDouble();
        }
    }

    public static void apresentarMenu(Scanner scanner) {
        System.out.println("Menu:");
        System.out.println("Digite '+' para apresentar o próximo elemento do vetor.");
        System.out.println("Digite '-' para apresentar o elemento anterior do vetor.");
        System.out.println("Digite '.' para sair.");

        char opcao = scanner.next().charAt(0);

        switch (opcao) {
            case '+':
                apresentarProximoElemento();
                break;
            case '-':
                apresentarElementoAnterior();
                break;
            case '.':
                System.out.println("Saindo...");
                System.exit(0);
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    }

    public static void apresentarProximoElemento() {
        if (posicaoAtual < 9) {
            posicaoAtual++;
            System.out.println("Elemento atual: " + vetor[posicaoAtual]);
        } else {
            System.out.println("Você já está no último elemento do vetor.");
        }
    }

    public static void apresentarElementoAnterior() {
        if (posicaoAtual > 0) {
            posicaoAtual--;
            System.out.println("Elemento atual: " + vetor[posicaoAtual]);
        } else {
            System.out.println("Você já está no primeiro elemento do vetor.");
        }
    }
}
