package algoritimos.java;
import java.util.Scanner;

public class Exercicio75 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos números deseja organizar?");
    int tamanho = scanner.nextInt();

    int iVet[] = new int[tamanho];

    System.out.println("Digite os números:");

    for (int i = 0; i < tamanho; i++) {
        System.out.print("Elemento " + (i + 1) + ": ");
        iVet[i] = scanner.nextInt();
    }
  }
  
  
  public static void OrdenaçaoQuickSortInt (int iVet[], int iBaixo, int iAlto)
    {
        int iP,iB,iA;
        int iPivot;

        iB=iBaixo;
        iA=iAlto;
        iPivot=iVet[iBaixo];
        while(iBaixo < iAlto)
        {
            while((iVet[iAlto] >= iPivot) && (iBaixo < iAlto))
                iAlto--;
            if(iBaixo != iAlto)
            {
                iVet [iBaixo]=iVet [iAlto];
                iBaixo++;
            }
            while((iVet [iBaixo] <= iPivot) && (iBaixo < iAlto))
                iBaixo++;
            if(iBaixo != iAlto)
            {
                iVet[iAlto]=iVet[iBaixo];
                iAlto--;
            }
        }
        iVet [iBaixo]=iPivot;
        iP=iBaixo;
        iBaixo=iB;
        iAlto=iA;
        if(iBaixo < iP) OrdenaçãoQuickSortInt (iVet, iBaixo, iP-1);
        if (iAlto > iP) OrdenaçãoQuickSortInt (iVet, iP+1, iAlto);
        
        System.out.println("Números organizados:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print(iVet[i] + " ");
        }
        scanner.close();
    }
}
