import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OperacionesBancariasAPantalla {
  public static void main(String[] args) {
    FileReader fr = null;
    BufferedReader br = null;

    DateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
    String horaActual = dateFormat.format(new Date());

    try {
      fr = new FileReader("datos.txt");
      br = new BufferedReader(fr);
      String linea;
      
      System.out.println("------------");
      System.out.println("Comprobante Bancario");
      System.out.println("Fecha: " + horaActual);
      System.out.println("Operaciones:");
      System.out.println("------------");
      
      while( (linea = br.readLine()) != null)
        System.out.println("* " + linea);

      System.out.println("------------");
      System.out.println("Muchas gracias por su visita");
      System.out.println("------------");

      fr.close();

    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
