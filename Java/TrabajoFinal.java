import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class TrabajoFinal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    PrintWriter pw = null;


    /* 
    int x = 1;
    int y = 0;
    int temp;
    for (int i = 0; i < 10; i++) {
      temp = x + y;
      x = y;
      y = temp;
      fibonacci[i] = y;
    }
*/

    try {
      pw = new PrintWriter("trabajo-final-bloque-1-java.txt");
      pw.println("###");

      System.out.println("Buenas, introduzca números del 1 al 20. Para terminar, introduzca un 0:");
      System.out.println();
      int numero = scanner.nextInt();

      while (numero != 0) {

        //si fib, escribir # numero veces
        int[] fibonacci = {1,2,3,5,8,13};
        for (int i : fibonacci) {
          if (numero == i) {
            pw.println("#".repeat(i));
          }
        }

        //entre 14 y 20, dia semana (14->lunes)
        if (numero > 13 && numero < 21) {
          String diaSemana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
          pw.println(diaSemana[numero - 14]);
        }

        //4 -> palo baraja "Copas, Bastos, Espadas y Oros”
        if (numero == 4) {
          Random random = new Random();
          String palo[] = {"Copas", "Bastos", "Espadas", "Oros"};
          pw.println(palo[random.nextInt(4)]);
        }
        //6-7, pedir string hasta length 6-7, imprimir este en archivo.
        if (numero >= 6 && numero <= 7) {
          String palabra;
          do {
            System.out.println("Introduzca un texto de "+ numero +" cifras: ");
            palabra = scanner.next();
          } while (palabra.length() != numero);

          pw.println(palabra);
        }

        //9-12, cuadro asteriscos.
        if (numero >= 9 && numero <= 12) {
          for (int fila = 1; fila <= numero; fila++) {
            for (int columna = 1; columna <= numero; columna++) {
              pw.print("* ");
            }
            pw.println();
          }
        }
        //recojemos nuevo numero.
        numero = scanner.nextInt();
      }

      pw.println("###");
      System.out.println();
      System.out.println("Hasta la vista :)");

    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } finally {
      pw.close();
    }
    scanner.close();
  }
}