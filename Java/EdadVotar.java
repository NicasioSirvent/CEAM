import java.util.Scanner;

public class EdadVotar {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int edad = 0;

    System.out.print("Dime tu edad: ");
    edad = scanner.nextInt();

    if (edad >= 18) {
      System.out.println("Puedes Votar");
    } else {
      System.out.println("No puedes Votar, te faltan " + (18 - edad) + " Años");
    }
    System.out.println("¡Que listo soy, por Júpiter!");

    scanner.close();
  }
}
