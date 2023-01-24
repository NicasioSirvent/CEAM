import java.util.Scanner;

public class TipoNumeroAnidado {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      int numero = 0;

      System.out.print("Dime un Número: ");
      numero = scanner.nextInt();

      if (numero == 0) {
        System.out.println("Número Neutro.");
      } else { 
        if (numero > 0) {
          System.out.println("Número Positivo.");
        } else if (numero < 0) {
          System.out.println("Numero Negativo.");
        }
      }
      scanner.close();
    }

  }
}
