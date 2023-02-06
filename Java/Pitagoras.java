import java.util.Scanner;

public class Pitagoras {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("--------------------------");
    System.out.println("Hipotenusa² = a² + b²\n Dime a y b y te digo hipotenusa. ");
    System.out.print("a: ");
    int a  = scanner.nextInt(); 
    System.out.print("b: ");
    int b  = scanner.nextInt(); 
    System.out.println("La Hiponenusa es " 
        + String.format("%.2f", Math.sqrt((Math.pow(a, 2) + Math.pow(b,2))) ));
    System.out.println("--------------------------");
    scanner.close();
  }
}