import java.util.Scanner;

public class IndiceMasaCorporal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    float altura = 0.0f;
    float peso = 0.0f;
    float imc;

    System.out.print("Dime tu altura: ");
    altura = scanner.nextFloat();

    System.out.print("Y ahora dime tu peso: ");
    peso = scanner.nextFloat();

    imc = peso / (altura * altura);

    System.out.println("Vale, tu IMC es " + imc);

    if (imc < 18 ) {
      System.out.println("Y estas delgado.");
    } else if (imc >= 18 && imc < 25) {
      System.out.println("Y tu peso es normal.");
    } else {
      System.out.println("Y tienes sobrepeso.");
    }

    scanner.close();

  }
  
}
