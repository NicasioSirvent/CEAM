package JavaExamen;
import java.util.Scanner;

public class DimeResultado {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Dime el Resultado: (Ej.Formato: '2-1'): ");
    String palabra = scanner.next();
    int primero = palabra.charAt(0);
    int segundo = palabra.charAt(2);

    if (primero > segundo) {
      System.out.println("1");
    } else if (primero == segundo) {
      System.out.println("X");
    } else {
      System.out.println("2");
    }

    scanner.close();
  }
}
