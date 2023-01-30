import java.util.Scanner;

public class AñosBisiestosEntre {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int anoDesde = 0;
    int anoHasta = 0;
    System.out.println("Dime 2 años y te digo los Años Bisiestos entre ellos.");
    System.out.print("Año Desde: ");
    anoDesde = scanner.nextInt();

    System.out.print("Año Hasta (mayor que anterior): ");
    anoHasta = scanner.nextInt();

    if (anoDesde > anoHasta) {
      System.out.println("'Desde Año' debe de ser menor que 'Hasta Año'!");
      scanner.close();
      return;
    }
    // bisiesto: sumar.., 
    //divisible entre 4, pero no centenario
    //si centerario, y divisible tambien entre 400
    System.out.println("*****************");
    for (int i = anoDesde; i <= anoHasta; i++) {
      if ((i % 4 == 0) && (i % 100 != 0) || ( (i % 100 == 0 ) && (i % 400 == 0))) {
        System.out.println(i);
      }
    }
    System.out.println("*****************");    
    scanner.close();
  }

}
