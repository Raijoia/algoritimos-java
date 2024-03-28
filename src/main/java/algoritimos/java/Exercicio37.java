import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio37 {
    private static final int NUM_ASSENTOS = 100; // Número total de assentos
    private static Map<Integer, String> assentos = new HashMap<>(); // Mapeia número do assento para RG do passageiro

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Reservar assento");
            System.out.println("2 - Cancelar reserva de assento");
            System.out.println("3 - Cancelar todas as reservas");
            System.out.println("4 - Verificar lotação do avião");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    reservarAssento();
                    break;
                case 2:
                    cancelarReserva();
                    break;
                case 3:
                    cancelarTodasReservas();
                    break;
                case 4:
                    verificarLotacao();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        
        scanner.close();
    }
    
    private static void reservarAssento() {
        if (assentos.size() == NUM_ASSENTOS) {
            System.out.println("O avião está lotado.");
            return;
        }
        
        int assento = encontrarPrimeiroAssentoVago();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o RG do passageiro:");
        String rg = scanner.nextLine();
        assentos.put(assento, rg);
        System.out.println("Assento reservado com sucesso: " + assento);
    }
    
    private static void cancelarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do assento a ser cancelado:");
        int assento = scanner.nextInt();
        
        if (assentos.containsKey(assento)) {
            assentos.remove(assento);
            System.out.println("Reserva do assento " + assento + " cancelada com sucesso.");
        } else {
            System.out.println("Assento não reservado.");
        }
    }
    
    private static void cancelarTodasReservas() {
        assentos.clear();
        System.out.println("Todas as reservas foram canceladas.");
    }
    
    private static void verificarLotacao() {
        System.out.println("Número de assentos ocupados: " + assentos.size());
        System.out.println("Número de assentos disponíveis: " + (NUM_ASSENTOS - assentos.size()));
    }
    
    private static int encontrarPrimeiroAssentoVago() {
        for (int i = 1; i <= NUM_ASSENTOS; i++) {
            if (!assentos.containsKey(i)) {
                return i;
            }
        }
        return -1; // Se todos os assentos estiverem ocupados
    }
}
