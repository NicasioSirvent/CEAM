import java.util.Scanner;

class DibujaNumeroPuntos {
  public static void main(String[] args) {
    int numero, fila, columna;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Dime un numero entre 1 y 50 y te dubujo un cuadradico: ");
    numero = scanner.nextInt();
    while (numero < 1 || numero > 50) {
      System.out.print("Entre 1 y 50, Cabezon!: ");
      numero = scanner.nextInt();
    }
    System.out.println("Ahi va....");

    for (fila = 1; fila <= numero; fila++) {
      for (columna = 1; columna <= numero; columna++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    scanner.close();
  }
}