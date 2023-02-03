/*
 * x:penultimo elemento
 * y:ultimo elemento.
 * x,y -> y, x + y -> 
 */
public class Fibonacci {
  public static void main(String[] args) {
    int x = 1;
    int y = 0;
    int temp;
    char sep;
    for (int i = 0; i <= 10; i++) {
      temp = x + y;
      x = y;
      y = temp;
      sep = (i == 10) ? '.' : ',';
      System.out.print("" + y + sep);
    }
    System.out.println();
  }
}
