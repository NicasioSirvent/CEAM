import java.util.Scanner;

public class MenuBancarioSwitch {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    int cantidad = 0;
    int saldo = 1000;

    while (numero != 4) {
      System.out.println("Menú: ");
      System.out.println("1 - Extracto de cuenta: ");
      System.out.println("2 - Ingreso en cuenta: ");
      System.out.println("3 - Reintegro de cuenta: ");
      System.out.println("4 - Salir ");
      System.out.print("Elije Opcion: ");
      numero = scanner.nextInt();

      System.out.println("-------------------");
      switch (numero) {
        case 1:
          System.out.println("Tienes " + saldo + " Euros de Saldo.");
          break;
        case 2:
          System.out.println("¿Que Cantidad quieres Ingresar?");
          cantidad = scanner.nextInt();
          saldo += cantidad;
          System.out.println("Ingresando " + cantidad + " en Cuenta, tienes " + saldo + " Euros");
          break;
        case 3:
          System.out.println("¿Que Cantidad quieres Reintegrar?");
          cantidad = scanner.nextInt();
          saldo -= cantidad;
          System.out.println("Reintegro de " + cantidad + " Euros, tienes " + saldo + " Euros");
          break;
        case 4:
          System.out.println("Hasta Pronto!");
          break;
        default:
          System.out.println("Opcion no Valida!");
          break;
      }
      System.out.println("-------------------");
    }  
    scanner.close();
  }
}
