import java.util.Scanner;

public class EdadNombre {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      String nombre = "";
      int edad = 0;
      String ubicacion = "";
      float altura = 0.0f;
      String Fumador = "";
      boolean esFumador = false;

      System.out.print("Dime tu nombre: ");
      nombre = scanner.next();
      // nombre = scanner.next("[a-zA-Z]*");

      System.out.print("Dime tu edad: ");
      edad = scanner.nextInt();

      System.out.print("Y.. ¿Dónde vives?: ");
      ubicacion = scanner.next();

      System.out.print("Y.. ¿Cúanto mides en cms?: ");
      altura =  scanner.nextFloat();

      System.out.print("Y por último.. ¿Eres fumador? :");
      Fumador = scanner.next();

      switch(Fumador) {
        case("s"):
        case("S"):
        case("Si"):
        case("si"):
        case("SI"):
          esFumador = true;
          break;
      }


      System.out.print("Tu nombre es " + nombre + " y tu edad es " + edad + " años.");
      System.out.println(" Vives en " + ubicacion + " y mides " + altura + " cm.");
      if (esFumador) {
        System.out.println("Y eres fumador");
      } else {
        System.out.println("Y no eres fumador!");
      }
      System.out.println("¡Que listo soy, por Júpiter!");

      scanner.close();
    }

  }
}
