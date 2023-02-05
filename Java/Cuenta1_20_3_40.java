public class Cuenta1_20_3_40 {
  public static void main(String[] args) {
    char sep;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 1) {
        System.out.print(i);
      } else {
        System.out.print(10 * i);
      }

      sep = (i == 10) ? '.' : ',';
      System.out.print(sep);
    }
    System.out.println();
  }
}