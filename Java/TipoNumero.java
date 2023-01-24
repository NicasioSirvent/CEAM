import java.util.Scanner;

public class TipoNumero {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      int numero = 0;

      System.out.print("Dime un Número: ");
      numero = scanner.nextInt();

      if (numero < 0) {
        System.out.println("Número Negativo.");
      } else if (numero > 0) {
        System.out.println("Número Positivo.");
      } else {
        System.out.println("Numero Cero");
      }
      System.out.println("¡Que listo soy, por Júpiter!");

      scanner.close();
    }

  }
}
