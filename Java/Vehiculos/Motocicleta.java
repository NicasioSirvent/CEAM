package Vehiculos;

public class Motocicleta extends Vehiculo {
  private int cilindrada;
  
  public Motocicleta() {}
  public Motocicleta(int cilindrada) {
    this.cilindrada = cilindrada;
  }
  public Motocicleta(String fechaFab, String marca, String modelo, int consumo, tipo tipoMotor, int cilindrada) {
    super(fechaFab, marca, modelo, consumo, tipoMotor);
    this.cilindrada = cilindrada;
  }

  public int getCilindrada() {
    return cilindrada;
  }
  public void setCilindrada(int cilindrada) {
    this.cilindrada = cilindrada;
  }

  public String toString() {
    String salida = "\n# Moto:";
    salida += super.toString();
    salida += "\nCilindrada: " + cilindrada;
    return salida;
  }
}