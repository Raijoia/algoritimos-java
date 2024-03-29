import java.util.Scanner;

class Exercicio19 {
    private int numero;
    private double comprimento;
    private double diametro;

    public Prego(int numero, double comprimento, double diametro) {
        this.numero = numero;
        this.comprimento = comprimento;
        this.diametro = diametro;
    }

    public int getNumero() {
        return numero;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getDiametro() {
        return diametro;
    }
}

class ControleQualidade {
    private Prego[] pregos;

    public ControleQualidade() {
        this.pregos = new Prego[10];
    }

    public void adicionarPrego(int numero, double comprimento, double diametro) {
        if (numero >= 1 && numero <= 10) {
            pregos[numero - 1] = new Prego(numero, comprimento, diametro);
        } else {
            System.out.println("Número de prego inválido.");
        }
    }

    public void calcularMedias(Prego[] pregos) {
        double comprimentoTotal = 0;
        double diametroTotal = 0;

        for (Prego prego : pregos) {
            comprimentoTotal += prego.getComprimento();
            diametroTotal += prego.getDiametro();
        }

        double comprimentoMedio = comprimentoTotal / pregos.length;
        double diametroMedio = diametroTotal / pregos.length;

        System.out.println("Comprimento Médio: " + comprimentoMedio);
        System.out.println("Diâmetro Médio: " + diametroMedio);
    }

    public void encontrarAmostraMaisLonga(Prego[] pregos) {
        double comprimentoMaximo = Double.MIN_VALUE;
        int numeroAmostraMaisLonga = -1;

        for (Prego prego : pregos) {
            if (prego.getComprimento() > comprimentoMaximo) {
                comprimentoMaximo = prego.getComprimento();
                numeroAmostraMaisLonga = prego.getNumero();
            }
        }

        System.out.println("Amostra mais longa: Número " + numeroAmostraMaisLonga + ", Comprimento " + comprimentoMaximo);
    }

    public void encontrarAmostraMaisFina(Prego[] pregos) {
        double diametroMinimo = Double.MAX_VALUE;
        int numeroAmostraMaisFina = -1;

        for (Prego prego : pregos) {
            if (prego.getDiametro() < diametroMinimo) {
                diametroMinimo = prego.getDiametro();
                numeroAmostraMaisFina = prego.getNumero();
            }
        }

        System.out.println("Amostra mais fina: Número " + numeroAmostraMaisFina + ", Diâmetro " + diametroMinimo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleQualidade controle = new ControleQualidade();
        Prego[] pregos = new Prego[10];

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o comprimento do prego " + i + ":");
            double comprimento = scanner.nextDouble();
            System.out.println("Digite o diâmetro do prego " + i + ":");
            double diametro = scanner.nextDouble();
            pregos[i - 1] = new Prego(i, comprimento, diametro);
        }

        controle.calcularMedias(pregos);
        controle.encontrarAmostraMaisLonga(pregos);
        controle.encontrarAmostraMaisFina(pregos);

        scanner.close();
    }
}
