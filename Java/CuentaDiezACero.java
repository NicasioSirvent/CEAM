public class CuentaDiezACero {
  public static void main(String[] args) throws InterruptedException {
    for( int i = 10; i >= 0; i-- ){
      Thread.sleep(500);
      System.out.println(i);
    }
    System.out.println("¡Ignición!");
  } 
  
}
