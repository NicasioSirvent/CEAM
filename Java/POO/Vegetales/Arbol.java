package POO.Vegetales;

public class Arbol extends Vegetal {
  //altura, espacio_vital, frutal (booleano).
  int altura;
  int espacioVital;
  boolean esFrutal;  

  public Arbol(int al, int sv, boolean ef) {
    altura = al;
    espacioVital = sv;
    esFrutal = ef;
  }

  public Arbol() { }

  public void setAltura(int altura) {
    this.altura = altura;
  }
  
  public int getAltura() {
    return altura;
  }

  public void setEspacioVital(int espacioVital) {
    this.espacioVital = espacioVital;
  }
  public int getEspacioVital() {
    return espacioVital;
   }

   public void setEsFrutal(boolean esFrutal) {
     this.esFrutal = esFrutal;
   }
   public boolean getEsFrutal() {
     return esFrutal;
   }
}
