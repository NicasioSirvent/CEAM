public class Ascii {

  public static int dimeNumeroAscii(char miChar) {

    return (int) miChar;
  }

  public static String dimeTipoAscii(int miInt) {

    String miTipo = "";
    if (miInt < 33) {
      miTipo = "No Imprimible";
    } else if (miInt < 48) {
      miTipo = "Signo Puntuacion";
    } else if (miInt < 58) {
      miTipo = "Numero";
    } else if (miInt < 64) {
      miTipo = "Signo";
    } else if (miInt < 91) {
      miTipo = "Letra Mayuscula";
    } else if (miInt < 97) {
      miTipo = "Signo de Puntacion";
    } else if (miInt < 123) {
      miTipo = "Letra Minuscula";
    } else {
      miTipo = "signo";
    }
    return miTipo;
  }

  public static void listaAscii() {

    for (int i = 0; i < 128; i++) {
      System.out.print(i + " -> ");
      //System.out.print(String.format("%c",i));
      System.out.print((char)i);

      System.out.println(" -> " + dimeTipoAscii(i));
    }
  }
}
