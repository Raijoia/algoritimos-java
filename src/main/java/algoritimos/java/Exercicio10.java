package algoritimos.java;
import java.util.Scanner;

public class Exercicio10{
    private static final int TOTAL_FILEIRAS = 30;
    private static final int ASSENTOS_POR_FILEIRA = 100;
    private static final int LIVRE = 0;
    private static final int RESERVADO = 1;
    private static final int VENDIDO = 2;

    private int[][] lugares;

    public void Teatro() {
        lugares = new int[TOTAL_FILEIRAS][ASSENTOS_POR_FILEIRA];
        // Inicializa todos os lugares como livres
        for (int i = 0; i < TOTAL_FILEIRAS; i++) {
            for (int j = 0; j < ASSENTOS_POR_FILEIRA; j++) {
                lugares[i][j] = LIVRE;
            }
        }
    }

    public void mostrarMapa() {
        System.out.println("Mapa de Assentos:");
        for (int i = 0; i < TOTAL_FILEIRAS; i++) {
            for (int j = 0; j < ASSENTOS_POR_FILEIRA; j++) {
                System.out.print(lugares[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void venderIngresso(int fileira, int assento) {
        if (fileira < 1 || fileira > TOTAL_FILEIRAS || assento < 1 || assento > ASSENTOS_POR_FILEIRA) {
            System.out.println("Assento inválido!");
            return;
        }

        if (lugares[fileira - 1][assento - 1] == LIVRE) {
            lugares[fileira - 1][assento - 1] = VENDIDO;
            System.out.println("Ingresso vendido com sucesso para o assento " + assento + " na fileira " + fileira + ".");
        } else {
            System.out.println("Este assento já está reservado ou vendido.");
        }
    }

    public void reservarIngresso(int fileira, int assento) {
        if (fileira < 1 || fileira > TOTAL_FILEIRAS || assento < 1 || assento > ASSENTOS_POR_FILEIRA) {
            System.out.println("Assento inválido!");
            return;
        }

        if (lugares[fileira - 1][assento - 1] == LIVRE) {
            lugares[fileira - 1][assento - 1] = RESERVADO;
            System.out.println("Assento reservado com sucesso para o assento " + assento + " na fileira " + fileira + ".");
        } else {
            System.out.println("Este assento já está reservado ou vendido.");
        }
    }

    public static void main(String[] args) {
    Teatro teatro = new Teatro();
    Scanner scanner = new Scanner(System.in);
    int opcao;
    
    do {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Mostrar Mapa de Assentos");
        System.out.println("2 - Vender Ingresso");
        System.out.println("3 - Reservar Ingresso");
        System.out.println("0 - Sair");
        System.out.print("Opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                teatro.mostrarMapa();
                break;
            case 2:
                System.out.print("Digite a fileira: ");
                int fileiraVenda = scanner.nextInt();
                System.out.print("Digite o assento: ");
                int assentoVenda = scanner.nextInt();
                teatro.venderIngresso(fileiraVenda, assentoVenda);
                break;
            case 3:
                System.out.print("Digite a fileira: ");
                int fileiraReserva = scanner.nextInt();
                System.out.print("Digite o assento: ");
                int assentoReserva = scanner.nextInt();
                teatro.reservarIngresso(fileiraReserva, assentoReserva);
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    } while (opcao != 0);

    scanner.close();
    }
}