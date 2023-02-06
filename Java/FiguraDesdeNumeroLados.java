import java.util.Scanner;

public class FiguraDesdeNumeroLados {
  public static void main(String[] args) {
    String figura = "";
    int lados = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Dime tu Numero de Lados y te Digo Que Eres: ");
    lados = input.nextInt();
    while (lados < 1 || lados > 8) {
      System.out.print("Perdón: Un Numero entre 1 y 8!: ");
      lados = input.nextInt();
    }

    switch (lados) {
      case 1:
        figura = "Punto";
        break;
      case 2:
        figura = "Linea";
        break;
      case 3:
        figura = "Triangulo";
        break;
      case 4:
        figura = "Rectangulo";
        break;
      case 5:
        figura = "Pentagono";
        break;
      case 6:
        figura = "Hexágono";
        break;
      case 7:
        figura = "Heptagono";
        break;
      case 8:
        figura = "Octogono";
        break;
      default:
        figura = "Ovni";
        break;
        
    }
    System.out.println("Creo que eres un ... " + figura + ".");
    input.close();
  }
}