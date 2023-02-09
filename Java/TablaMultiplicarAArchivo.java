import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TablaMultiplicarAArchivo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter salida = null;

    System.out.print("Dime un numero y te doy su tabla de multiplicar: ");
    int numero = scanner.nextInt();

    try {
      salida = new PrintWriter("datos.txt");
      for (int i = 0; i <= 10; i++) {
        salida.println(numero + " x " + i + " = " + numero * i);
      }
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } finally {
      salida.close();
    }
    scanner.close();
  }
}
