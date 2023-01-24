import java.util.Scanner;

public class MenuBancario {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      int numero = 0;
      int saldo = 1000;

      while (true) {
        System.out.println("Esto es un Menu Bancario: ");
        System.out.println("1 - Extracto de cuenta: ");
        System.out.println("2 - Ingresa 100 en cuenta: ");
        System.out.println("3 - Reintegro 100 de cuenta: ");
        System.out.println("4 - Salir ");
        System.out.print("Elije Opcion: ");
        numero = scanner.nextInt();

        System.out.println("-------------------");
        if (numero == 1) {
          System.out.println("Tienes " + saldo + " Euros de Saldo.");
        } else if (numero == 2) {
          saldo += 100;
          System.out.println("Ingresando 100 en Cuenta, tienes " + saldo + " Euros");
        } else if (numero == 3) {
          saldo -= 100;
          System.out.println("Reintegro de 100 Euros, tienes " + saldo + " Euros");
        } else if (numero == 4){
          System.out.println("Hasta Pronto!");
          break;
        } else {
          System.out.println("Opcion no Valida!");
        }
        System.out.println("-------------------");
      }
      scanner.close();
    }
  }
}
