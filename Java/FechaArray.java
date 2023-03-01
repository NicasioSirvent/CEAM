import java.util.Scanner;

public class FechaArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeroDia, numeroMes;
    String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    do {
      System.out.print("Dime el numero de dia de la semana (1-7): ");
      numeroDia = scanner.nextInt();
    } while (numeroDia < 1 || numeroDia > 7);

    do {
      System.out.print("Dime el numero de mes (1-12): ");
      numeroMes = scanner.nextInt();
    } while (numeroMes < 1 || numeroMes > 12);

    System.out.println("Dia: " + dias[numeroDia + 1] + " y Mes: " + meses[numeroMes + 1] );
    
    scanner.close(); //cerramos scanner
  }
}
