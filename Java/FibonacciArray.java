import java.util.Scanner;

public class FibonacciArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] fiboArray = {1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946};
    
    System.out.print("Dime un Numero del 1 al 20: ");
    int numFibo = scanner.nextInt();
    while (numFibo > 20 || numFibo < 1) {
      System.out.print("Del 1 al 20! :");
      numFibo = scanner.nextInt();
    }

    System.out.println("Serie Fibo(n) al reves:");
    for (int i = numFibo - 1; i >= 0; i--) {
      System.out.print(" " + fiboArray[i]);
    }
    System.out.println();
    scanner.close();
  }
}
