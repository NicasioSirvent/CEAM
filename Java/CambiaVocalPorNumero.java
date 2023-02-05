import java.util.Scanner;

public class CambiaVocalPorNumero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Dime una palabra y la numereo: ");
    String palabra = scanner.next();
    char letra;
    //Una Manera
    String nuevaPalabra = palabra
        .replace('a', '4')
        .replace('e', '3')
        .replace('i', '1')
        .replace('o', '0');

    //Otra Manera
    System.out.print("La nueva palabra es: ");
    for (int i = 0; i < palabra.length(); i++) {
      letra = palabra.charAt(i);
      switch(letra) {
        case 'a':
        case 'A':
          System.out.print('4');
          break;
        case 'e':
        case 'E':
          System.out.print('3');
          break;
        case 'i':
        case 'I':
          System.out.print('1');
          break;
        case 'o':
        case 'O':
          System.out.print('0');
          break;
        default:
          System.out.print(letra);
          break;
      }
    }
    System.out.println();
    System.out.println("La nueva palabra es: " + nuevaPalabra);
    scanner.close();
  }}
