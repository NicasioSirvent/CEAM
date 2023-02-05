import java.util.Scanner;

public class MenuBancarioSwitchLetras {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    char letra = ' ';
    int cantidad = 0;
    int saldo = 1000;

    while (letra != 'd') {
      System.out.println("Menú: ");
      System.out.println("a - Extracto de cuenta: ");
      System.out.println("b - Ingreso en cuenta: ");
      System.out.println("c - Reintegro de cuenta: ");
      System.out.println("d - Salir ");
      System.out.print("Elije Opcion: ");
      letra = scanner.next().charAt(0);

      System.out.println("-------------------");
      switch (letra) {
        case 'a':
        case 'A':
          System.out.println("Tienes " + saldo + " Euros de Saldo.");
          break;
        case 'b':
        case 'B':
          System.out.println("¿Que Cantidad quieres Ingresar?");
          cantidad = scanner.nextInt();
          saldo += cantidad;
          System.out.println("Ingresando " + cantidad + " en Cuenta, tienes " + saldo + " Euros");
          break;
        case 'c':
        case 'C':
          System.out.println("¿Que Cantidad quieres Reintegrar?");
          cantidad = scanner.nextInt();
          saldo -= cantidad;
          System.out.println("Reintegro de " + cantidad + " Euros, tienes " + saldo + " Euros");
          break;
        case 'd':
        case 'D':
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