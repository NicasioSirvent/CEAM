import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuBancarioAFichero {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    PrintWriter salida = null;
    int numero = 0;
    int cantidad = 0;
    int saldo = 1000;

    try {
      salida = new PrintWriter("datos.txt");

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
            salida.println("Tienes " + saldo + " Euros de Saldo.");
            break;
          case 2:
            System.out.println("¿Que Cantidad quieres Ingresar?");
            cantidad = scanner.nextInt();
            saldo += cantidad;
            System.out.println("Ingresando " + cantidad + " en Cuenta, tienes " + saldo + " Euros");
            salida.println("Ingresando " + cantidad + " en Cuenta, tienes " + saldo + " Euros");
            break;
          case 3:
            System.out.println("¿Que Cantidad quieres Reintegrar?");
            cantidad = scanner.nextInt();
            saldo -= cantidad;
            System.out.println("Reintegro de " + cantidad + " Euros, tienes " + saldo + " Euros");
            salida.println("Reintegro de " + cantidad + " Euros, tienes " + saldo + " Euros");
            break;
          case 4:
            System.out.println("Hasta Pronto!");
            break;
          default:
            System.out.println("Opcion no Valida!");
            break;
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } finally {
      salida.close();
    }
    scanner.close();
  }
}
