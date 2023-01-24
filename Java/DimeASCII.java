import java.util.Scanner;

public class DimeASCII {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Dime un caracter: ");
    char miChar = scanner.next().charAt(0);
    
    //int miCharInt = miChar; //cast implicito
    //System.out.print(miChar + " -> " + miCharInt);
    //System.out.print(miChar + " -> " + (int)miChar); //cast explicito
    //System.out.println(miChar + " -> " + String.format("%d", miChar)); //String.format
    System.out.print(miChar + " -> " + Ascii.dimeNumeroAscii(miChar)); //libretria ayuda

    System.out.println(" de tipo " + Ascii.dimeTipoAscii(miChar) );
    scanner.close();

    Ascii.listaAscii();
    //System.out.print(String.format("%c",numero));  
  }
}