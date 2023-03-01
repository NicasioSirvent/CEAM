package JavaExamen;

import java.util.Scanner;

public class DimeResultadoQuiniela5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char Quiniela[] = new char[5];

    System.out.println("Dime 5 Resultados: (Ej.Formato: '2-1'): ");
    for (int i = 0; i < 5; i++) {
      System.out.print("Resultado " + (i+1) + ": ");
      String palabra = scanner.next();
      int primero = palabra.charAt(0);
      int segundo = palabra.charAt(2);
        
      if (primero > segundo) {
        Quiniela[i] = '1';
      } else if (primero == segundo) {
        Quiniela[i] = 'X';
      } else {
        Quiniela[i] = '2';
      }
    }
    
    System.out.println("La Quiniela:");
    for (int i = 0; i < 5; i++) {
      System.out.println(Quiniela[i]);
    }

    scanner.close();
  }
}
