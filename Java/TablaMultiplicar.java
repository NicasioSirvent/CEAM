import java.util.Scanner;

public class TablaMultiplicar {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int numero = 0;

    System.out.print("Dime un Número y te doy su tabla de Multiplicar: ");
    numero = scanner.nextInt();
    System.out.println("*****************");
    for (int i = 0; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + numero * i);
    }
    System.out.println("*****************");    
    
    scanner.close();
  }

}
