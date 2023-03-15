import java.util.Scanner;

public class NumeroParImparFuncion {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int numero = 0;

    System.out.print("Dime un Número: ");
    numero = scanner.nextInt();
    parImpar(numero);

    scanner.close();
  }

  private static void parImpar(int numero) {
    if (numero % 2 == 0) {
      System.out.println("Número Par.");
    } else {
      System.out.println("Numero Impar.");
    }
  }
}
