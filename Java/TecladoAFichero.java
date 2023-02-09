import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TecladoAFichero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter salida = null;
    try {
      salida = new PrintWriter("datos.txt");
      String cadena;
      System.out.println("Intro texto");
      cadena = scanner.nextLine();
      while(!cadena.equalsIgnoreCase("FIN")) {
        salida.println(cadena);
        cadena = scanner.nextLine();
      }
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } finally {
      salida.close();
    }

    scanner.close();
  }
}