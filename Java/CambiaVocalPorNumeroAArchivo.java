import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CambiaVocalPorNumeroAArchivo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter salida = null;

    System.out.print("Dime una palabra y la numereo: ");
    String palabra = scanner.next();

    String nuevaPalabra = palabra
        .replace('a', '4')
        .replace('e', '3')
        .replace('i', '1')
        .replace('o', '0');

    try {
      salida = new PrintWriter("datos.txt");
      salida.println("La nueva palabra es: " + nuevaPalabra);
    } catch( FileNotFoundException e) {
      System.out.println(e.getMessage());
    } finally {
      salida.close();
    }
    scanner.close();
  }
}

