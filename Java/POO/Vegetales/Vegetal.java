package POO.Vegetales;

public class Vegetal {
  //nombre_vulgar, año, precio, cuidado, nivelRiego
  String nombreVulgar;
  int anoNacimiento;
  int precio;
  String cuidado;
  int nivelRiego;

  public Vegetal(String nv, int an, int pr, String cu, int nr) {
    nombreVulgar = nv;
    anoNacimiento = an;
    precio = pr;
    cuidado = cu;
    nivelRiego = nr;
  }
  public Vegetal() { }
  
  
  public void setAnoNacimiento(int anoNacimiento) {
    this.anoNacimiento = anoNacimiento;
  }
  public int getAnoNacimiento() {
    return anoNacimiento;
  }
  public void setCuidado(String cuidado) {
    this.cuidado = cuidado;
  }
  public String getCuidado() {
    return cuidado;
  }
  public void setNivelRiego(int nivelRiego) {
    this.nivelRiego = nivelRiego;
  }
  public int getNivelRiego() {
    return nivelRiego;
  }
  public void setNombreVulgar(String nombreVulgar) {
    this.nombreVulgar = nombreVulgar;
  }
  public String getNombreVulgar() {
    return nombreVulgar;
  }
  public void setPrecio(int precio) {
    this.precio = precio;
  }
  public int getPrecio() {
    return precio;
  }
}
