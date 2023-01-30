//import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    // int numero = new Random().nextInt(10) + 1;
    int numero = (int) (Math.random() * 20) + 1;
    int guess = 0;

    System.out.println("## " + numero);
    System.out.println("¡Adivina Numero entre 1 y 20, te doy 5 Oportunidades!");

    for (int i = 1; i < 6; i++) {
      System.out.print("Intento " + i + " : ");
      guess = scanner.nextInt();
      if (guess == numero) {
        System.out.println("## ¡Has Acertado! :) ##");
        break;
      } else {
        if (i == 5) {
          System.out.println("## Has Perdido, buuuuu! :( ##");
          break;
        } else {
          System.out.println("-> Nie! Intentalo otra vez...");
        }
      }
    }
    scanner.close();
  }
}