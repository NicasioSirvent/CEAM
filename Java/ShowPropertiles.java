public class ShowPropertiles {
  public static void main(String[] args) {
    System.getProperties().list(System.out);    
    System.out.println( "Usuario: " + System.getProperty("user.name"));
  }
  
}