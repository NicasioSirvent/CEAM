import java.util.Random;

public class ClaseRandom {
  public static void main(String[] args) {
    Random random = new Random();
    System.out.println("Un entero 0-10 random: " + random.nextInt(10));
    System.out.println("Un decimal 0-10 random:" + random.nextFloat(10.0f));
    String palo[] = {"Espadas","Oros","Bastos","Copas"};
    System.out.println("Palo de Baraja al Azar: " + palo[random.nextInt(3)]);
    String carta[] = {"As","2","3","4","5","6","7","8","9","Sota","Caballo","Rey"};
    System.out.println("Una carta al Azar: El/La " 
              + carta[random.nextInt(11)] + " de " + palo[random.nextInt(3)] );
    System.out.println();
  } 
  
}
