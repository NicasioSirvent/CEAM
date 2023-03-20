package POO.Vegetales;

public class Ejemplo {

  public static void main(String[] args) {
    Arbol arbol_1 = new Arbol();
    arbol_1.setAnoNacimiento(2022);
    arbol_1.setPrecio(200);
    arbol_1.setNombreVulgar("Arbol Tal");

    System.out.println(arbol_1.getNombreVulgar() + " cuesta " + arbol_1.getPrecio() + " Euros");
  }

  
}