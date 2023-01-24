import java.util.Scanner;

public class diaSemana {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeroDia;
    String nombreDia;

    System.out.print("Dima el numero de dia de la semana: ");
    numeroDia = scanner.nextInt();
    
    switch (numeroDia) {
      case (1):
        nombreDia = "Lunes";
        break;
      case (2):
        nombreDia = "Martes";
        break;
      case (3):
        nombreDia = "Miercoles";
        break;
      case (4):
        nombreDia = "Jueves";
        break;
      case (5):
        nombreDia = "Viernes";
        break;
      case (6):
        nombreDia = "Sabado";
        break;
      case (7):
        nombreDia = "Domingo";
        break;
      default:
        nombreDia = "";
    }
    if (nombreDia != "") {
      System.out.println("El nombre del dia es " + nombreDia + ".");
    } else {
      System.out.println("¡Ese dia no existe!");
    }

    scanner.close(); //cerramos scanner
  }
}
