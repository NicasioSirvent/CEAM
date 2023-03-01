import java.util.Scanner;

public class TragaNumeros {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numerosPares = new int[100];
    int[] numerosImpares = new int[100];
    int indicePar = 0;
    int indiceImpar = 0;
    int sumaTotal = 0;
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
      sumaTotal += numeroInput;
      System.out.print("Numero: ");
      numeroInput = scanner.nextInt();
    }

    //Lista Pares
    System.out.println("Lista de Pares");
    System.out.println("--------------");
    for (int i : numerosPares) {
      if (i == 0) break;
      System.out.println(i); 
    }
    
    //Lista Impares
    System.out.println("Lista de Impares");
    System.out.println("----------------");
    for (int i : numerosImpares) {
      if (i == 0) break;
      System.out.println(i); 
    }

    System.out.println("Suma Pares: " + sumaPar);
    System.out.println("Suma Impares: " + sumaImpar);
    System.out.println("Suma Total: " + sumaTotal);

    scanner.close();
  }
}
