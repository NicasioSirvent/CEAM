import java.util.Scanner;

public class MenuBancarioDoWhile {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    int cantidad = 0;
    int saldo = 1000;

    do {
      System.out.println("Menú: ");
      System.out.println("1 - Extracto de cuenta: ");
      System.out.println("2 - Ingreso en cuenta: ");
      System.out.println("3 - Reintegro de cuenta: ");
      System.out.println("4 - Salir ");
      System.out.print("Elije Opcion: ");
      numero = scanner.nextInt();

      System.out.println("-------------------");
      if (numero == 1) {
        System.out.println("Tienes " + saldo + " Euros de Saldo.");
      } else if (numero == 2) {
        System.out.println("¿Que Cantidad quieres Ingresar?");
        cantidad = scanner.nextInt();
        saldo += cantidad;
        System.out.println("Ingresando " + cantidad + " en Cuenta, tienes " + saldo + " Euros");
      } else if (numero == 3) {
        System.out.println("¿Que Cantidad quieres Reintegrar?");
        cantidad = scanner.nextInt();
        saldo -= cantidad;
        System.out.println("Reintegro de " + cantidad + " Euros, tienes " + saldo + " Euros");
      } else if (numero == 4) {
        System.out.println("Hasta Pronto!");
      } else {
        System.out.println("Opcion no Valida!");
      }
      System.out.println("-------------------");
    } while (numero != 4);
    scanner.close();
  }
}
