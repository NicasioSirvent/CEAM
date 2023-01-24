import java.util.Scanner;

public class OperacionesMatematicas {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      float numero1 = 0;
      float numero2 = 0;
      int operacion = 0;
      System.out.println("-----------------");
      System.out.print("Primer Numero: ");
      numero1 = scanner.nextFloat();
      System.out.print("Segundo Numero: ");
      numero2 = scanner.nextFloat();
      System.out.println("-----------------");


      System.out.println("Operacion: ");
      System.out.println("1 - Suma 1+2: ");
      System.out.println("2 - Resta 1-2: ");
      System.out.println("3 - Multiplicación 1*2: ");
      System.out.println("4 - División 1/2: ");
      System.out.print("Elije Opcion: ");
      operacion = scanner.nextInt();

      if (operacion == 1) {
        System.out.println("Operacion Suma:" + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
      } else if (operacion == 2) {
        System.out.println("Operacion Resta:" + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
      } else if (operacion == 3) {
        System.out.println("Operacion Multiplicación:" + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
      } else if (operacion == 4){
        System.out.println("Operacion División:" + numero1 + " / " + numero2 + " = " + String.format("%.2f", numero1 / numero2));
      } else {
        System.out.println("Operacion no Valida");
      }
      System.out.println("-----------------");
      scanner.close();
    }

  }
}
