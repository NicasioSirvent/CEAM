package POO.Vegetales;

public class Planta extends Vegetal {
  // interior (booleano), tipo_tierra, flor (booleano), comentario.
  boolean esDeInterior;
  String tipoTierra;
  boolean tieneFlor;
  String comentario;

  public Planta(boolean deInt, String tt, boolean tf, String co) {
    esDeInterior = deInt;
    tipoTierra = tt;
    tieneFlor = tf;
    comentario = co;
  }

  public Planta() { }
  
  public void setEsDeInterior(boolean esDeInterior) {
    this.esDeInterior = esDeInterior;
  }
  public boolean getEsDeInterior() {
    return esDeInterior;
  }

  public void setTipoTierra(String tipoTierra) {
    this.tipoTierra = tipoTierra;
  }

  public String getTipoTierra() {
    return tipoTierra;
  }

  public void setTieneFlor(boolean tieneFlor) {
    this.tieneFlor = tieneFlor;
  }

  public boolean getTieneFlor() {
    return tieneFlor;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }
}