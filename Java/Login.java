import java.util.Scanner;

public class Login {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String USER = "Nicasio";
    final String PASSWORD = "Nicasio";

    System.out.println("--------------------------");
    System.out.print("Login: ");
    String userGuess = scanner.next(); 
    System.out.print("Password: ");
    String passwordGuess = scanner.next();
    
    System.out.println("--------------------------");
    if (userGuess.equals(USER) && passwordGuess.equals(PASSWORD)) {
      System.out.println("  ¡Bienvenido/a " + userGuess + "!");
    } else {
      System.out.println("Inicio de Sesion Incorrecto:");
      if (!userGuess.equals(USER)) {
        System.out.println(" -Usuario Incorrecto.");
      }
      if (!passwordGuess.equals(PASSWORD)) {
        System.out.println(" -Password Incorrecto.");
      }
  }
    System.out.println("--------------------------");
    scanner.close();
  }
}