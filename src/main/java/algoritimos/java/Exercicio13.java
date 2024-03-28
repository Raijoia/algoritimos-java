import java.util.Scanner;

class Prego {
    int numero;
    double comprimento;
    double diametro;
    
    public Prego(int numero, double comprimento, double diametro) {
        this.numero = numero;
        this.comprimento = comprimento;
        this.diametro = diametro;
    }
}

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prego[] pregos = new Prego[10];
        
        // Entrada de dados
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o comprimento do prego " + (i + 1) + ":");
            double comprimento = scanner.nextDouble();
            System.out.println("Digite o diâmetro do prego " + (i + 1) + ":");
            double diametro = scanner.nextDouble();
            pregos[i] = new Prego(i + 1, comprimento, diametro);
        }
        
        // Cálculo do comprimento médio
        double comprimentoTotal = 0;
        double diametroTotal = 0;
        double comprimentoMax = 0;
        double diametroMin = Double.MAX_VALUE;
        int numComprimentoMax = 0;
        int numDiametroMin = 0;
        
        for (Prego prego : pregos) {
            comprimentoTotal += prego.comprimento;
            diametroTotal += prego.diametro;
            
            if (prego.comprimento > comprimentoMax) {
                comprimentoMax = prego.comprimento;
                numComprimentoMax = prego.numero;
            }
            
            if (prego.diametro < diametroMin) {
                diametroMin = prego.diametro;
                numDiametroMin = prego.numero;
            }
        }
        
        double comprimentoMedio = comprimentoTotal / 10;
        double diametroMedio = diametroTotal / 10;
        
        // Saída de resultados
        System.out.println("Comprimento Médio: " + comprimentoMedio);
        System.out.println("Diâmetro Médio: " + diametroMedio);
        System.out.println("Número do prego mais longo: " + numComprimentoMax);
        System.out.println("Comprimento do prego mais longo: " + comprimentoMax);
        System.out.println("Número do prego mais fino: " + numDiametroMin);
        System.out.println("Diâmetro do prego mais fino: " + diametroMin);
    }
}
