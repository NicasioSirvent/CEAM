import java.util.Scanner;

public class StringsIguales {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Dime la primera palabra: ");
    String palabra1 = scanner.next();
    System.out.print("Dime la segunda palabra: ");
    String palabra2 = scanner.next();
    if ( palabra1.equals(palabra2) ) {
      System.out.println("Las palabras son iguales");
    } else {
      System.out.println("Las palabras son diferentes");
    }
    scanner.close();
  }
}
