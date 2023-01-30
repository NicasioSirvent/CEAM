import java.util.Scanner;

public class DivisasAEuro {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    float cantidad = 0;

    do {
      System.out.println("##\nMenú Cambio de Divisas:\n##");
      System.out.println("1 - De Dingis a Euros: ");
      System.out.println("2 - De Norces a Euros: ");
      System.out.println("3 - De Pinglis a Euros: ");
      System.out.println("4 - Salir ");
      System.out.print("Elije Opcion: ");
      numero = scanner.nextInt();

      System.out.println("-------------------");
      if (numero == 1) {
        System.out.print("¿Cantidad de Dinglis?: ");
        cantidad = scanner.nextFloat();
        System.out.println(cantidad + " Dinglis son " +
            String.format("%.2f", cantidad / 2) + " Euros.");
      } else if (numero == 2) {
        System.out.print("¿Cantidad de Norces?: ");
        cantidad = scanner.nextFloat();
        System.out.println(cantidad + " Norces son " +
            String.format("%.2f", cantidad / 2) + " Euros.");
      } else if (numero == 3) {
        System.out.print("¿Cantidad de Pinglis?: ");
        cantidad = scanner.nextFloat();
        System.out.println(cantidad + " Pinglis son " +
            String.format("%.2f", cantidad / 2) + " Euros.");
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