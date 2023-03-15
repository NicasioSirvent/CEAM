import java.util.Scanner;

public class TragaNumeros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numerosPares = new int[100];
    int[] numerosImpares = new int[100];
    int indicePar = 0;
    int indiceImpar = 0;
    int sumaPar = 0;
    int sumaImpar = 0;
    int numeroInput;

    System.out.print("Numero: ");
    numeroInput = scanner.nextInt();
    while (numeroInput != 0) {
      if (numeroInput % 2 == 0) {
        numerosPares[indicePar++] = numeroInput;
        sumaPar += numeroInput;
      } else {
        numerosImpares[indiceImpar++] = numeroInput;
        sumaImpar += numeroInput;
      }
      System.out.print("Numero: ");
      numeroInput = scanner.nextInt();
    }

    //Lista Pares
    System.out.print("Lista de Pares:");
    for (int i : numerosPares) {
      if (i == 0) break;
      System.out.print(" " + i); 
    }
    System.out.println();
    
    //Lista Impares
    System.out.print("Lista de Impares:");
    for (int i : numerosImpares) {
      if (i == 0) break;
      System.out.print(" " + i); 
    }

    System.out.println("\nSuma Pares: " + sumaPar);
    System.out.println("Suma Impares: " + sumaImpar);
    System.out.println("Suma Total: " + (sumaPar + sumaImpar) );

    scanner.close();
  }
}
