import java.util.Scanner;

public class NumerosImparesEntre {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int numero1 = 0;
    int numero2 = 0;

    System.out.print("Primer Numero: ");
    numero1 = scanner.nextInt();

    System.out.print("Segundo Numero (mayor que anterior): ");
    numero2 = scanner.nextInt();

    if (numero1 > numero2) {
      System.out.println("Numero1 debe de ser menor que Numero2!");
      scanner.close();
      return;
    }

    System.out.println("*****************");
    for (int i = numero1; i <= numero2; i++) {
      if (i%2 == 1) {
      System.out.println(i);
      }
    }
    System.out.println("*****************");    
    scanner.close();
  }

}
