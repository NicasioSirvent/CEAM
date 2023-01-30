import java.util.Scanner;

public class VolumenCubo {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    float lado = 0;

    System.out.println("Programa que calcula el lado del cubo (0 para salir)");
    while (true) {
      System.out.print("Dime el lado: ");
      lado = scanner.nextFloat();
      if (lado == 0) break;
      System.out.println("El volumen del cubo es " + lado * lado * lado);
      System.out.println("##");
    }
    scanner.close();
  }
}
