import java.util.Scanner;

public class Factorial {
  static int facto = 1;
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int numero = 0;

    System.out.print("Dime numero y te digo su factorial: ");
    numero = scanner.nextInt();
    System.out.println("El factorial es: " + dimeFactorial(numero));
    scanner.close();
  }
  
  static int dimeFactorial(int num) {
    facto *= num;
    return ( num == 1 ) ? facto : dimeFactorial(--num);  
  }
}
