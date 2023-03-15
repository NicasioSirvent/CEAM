import java.util.Scanner;

public class VolumenCuboFuncion {
  static float lado = 0;
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Programa que calcula el lado del cubo (0 para salir)");
    while (true) {
      System.out.print("Dime el lado: ");
      lado = scanner.nextFloat();
      if (lado == 0) break;
      System.out.println("El volumen del cubo es " + dimeVolumen(lado));
    }
    scanner.close();
  }

  private static float dimeVolumen(float lado) {
    return lado * lado * lado;
  }
}
