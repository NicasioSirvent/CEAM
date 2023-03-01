package JavaExamen;

import java.util.Random;

public class Quiniela15Random2 {
  public static void main(String[] args) {
    Random random = new Random();
    int numero;
      
    for (int i = 0; i < 15; i++) {
      numero = random.nextInt(100);
      if (numero < 60) {
        System.out.println("1");
      } else if (numero < 85) {
        System.out.println("X");
      } else {
        System.out.println("2");
      }
    }
  } 
}