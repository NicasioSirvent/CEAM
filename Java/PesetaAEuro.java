import java.util.Scanner;

public class PesetaAEuro {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int pesetas = 0;

    System.out.print("Dime las Pesetas: ");
    pesetas = scanner.nextInt();
    System.out.println("Tienes " + String.format("%.2f", pesetas/166.38) + " Euros.");

    scanner.close();
  }

}
