package JavaExamen;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Quiniela15Random {
  public static void main(String[] args) {
    Random random = new Random();
    PrintWriter pw = null;
    String resultadosPosibles[] = {"1","X","2"};

    try {
      pw = new PrintWriter("quinielas.txt");
      
      for (int i = 0; i < 15; i++) {
        String resultado = resultadosPosibles[random.nextInt(3)]; 
        System.out.println(resultado);
        pw.println(resultado);
      }
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } finally {
      pw.close();
    }
  } 
}