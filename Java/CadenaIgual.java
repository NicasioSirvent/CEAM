import java.util.Scanner;

public class CadenaIgual {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String PALABRA = "Nicasio";

    System.out.println("--------------------------");
    System.out.print("Dime Palabra: ");
    String userGuess = scanner.next(); 
    
    System.out.println("--------------------------");
    if (userGuess.equals(PALABRA)) {
      System.out.println(" La palabra es Igual! ");
    } else {
      System.out.println(" La palabra es Distinta!");
    }
  
    System.out.println("--------------------------");
    scanner.close();
  }
}