package Vehiculos;

enum tipo {COMBUSTION,ELECTRICO,HIBRIDO};

public class Vehiculo {
  private String fechaFab;
  private String marca;
  private String modelo;
  private int consumo;
  private tipo tipoMotor;

  public Vehiculo(String fechaFab, String marca, String modelo, int consumo, tipo tipoMotor) {
    this.fechaFab = fechaFab;
    this.marca = marca;
    this.modelo = modelo;
    this.consumo = consumo;
    this.tipoMotor = tipoMotor;
  }
  public Vehiculo() {}

  public String getFechaFab() {
    return fechaFab;
  }
  public void setFechaFab(String fechaFab) {
    this.fechaFab = fechaFab;
  }
  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public int getConsumo() {
    return consumo;
  }
  public void setConsumo(int consumo) {
    this.consumo = consumo;
  }
  public tipo getTipoMotor() {
    return tipoMotor;
  }
  public void setTipoMotor(tipo tipoMotor) {
    this.tipoMotor = tipoMotor;
  }
  public String toString() {
    return  "\nMarca: " + marca 
          + "\nModelo: " + modelo
          + "\nFecha Fabricacion: " + fechaFab
          + "\nConsumo: " + consumo
          + "\nTipo de Motor: " + tipoMotor; 
  }
}