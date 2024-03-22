package algoritimos.java;

import java.util.Scanner;

//Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória, o
//conteúdo de cada elemento de um vetor do tipo char, de tamanho 5, via teclado, executar
//uma ordenação crescente do mesmo e apresentar o vetor ordenado em tela. Utilizar um
//método de ordenação Quick-Sort.
public class Exercicio74 {
  public static char[] QuickSort(char iVet[], char iBaixo, char iAlto) {
    char iP, iB, iA;
    char iPivot;

    iB = iBaixo;
    iA = iAlto;
    iPivot = iVet[iBaixo];
    while (iBaixo < iAlto) {

      while ((iVet[iAlto] >= iPivot) && (iBaixo < iAlto)) iAlto--;

      if (iBaixo != iAlto) {
        iVet[iBaixo] = iVet[iAlto];
        iBaixo++;
      }

      while((iVet[iBaixo] <= iPivot) && (iBaixo < iAlto))  iBaixo++;

      if (iBaixo  != iAlto){
        iVet[iAlto] = iVet[iBaixo];
        iAlto--;
      }
    }

    iVet[iBaixo] = iPivot;
    iP = iBaixo;
    iBaixo  = iB;
    iAlto = iA;

    if(iBaixo < iP) iVet = QuickSort(iVet, iBaixo, (char) (iP - 1));
    if(iAlto > iP)  iVet = QuickSort(iVet, (char) (iP + 1), iAlto);

    return iVet;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Digite 5 chars");
    char[] arr = new char[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Elemento " + i + ": ");
      arr[i] = s.next().charAt(0);
    }

    char organizado[] = QuickSort(arr, (char) 0, (char) (arr.length - 1));

    for (int i = 0; i < 5; i++) {
      System.out.print(organizado[i]);
    }

    s.close();
  }
}

