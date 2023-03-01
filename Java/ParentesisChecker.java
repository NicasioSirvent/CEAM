import java.util.Scanner;

public class ParentesisChecker {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Dame los Parentesis: ");
    String palabra = scanner.next();
    boolean valido = true;
    int nivel = 0;
    for (char letra: palabra.toCharArray()) {
      if (letra == '(') nivel++;
      if (letra == ')') nivel--;
      if (nivel < 0){
        valido = false;
        break;
      }
    }

    if (valido == true && nivel == 0) {
      System.out.println("Parentesis Validos");
    } else {
      System.out.println("Parentesis Invalidos");
    }
    scanner.close();
  }
}
