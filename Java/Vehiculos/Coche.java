package Vehiculos;

import java.util.*;

public class Coche extends Vehiculo {
  private int numeroPuertas;
  private boolean tieneAirbag;
  ArrayList<String> fechasITV;
  
  public Coche() {}
  public Coche(int numeroPuertas, boolean tieneAirbag) {
    this.numeroPuertas = numeroPuertas;
    this.tieneAirbag = tieneAirbag;
    fechasITV = new ArrayList<>();
  }

  public Coche(String fechaFab, String marca, String modelo, int consumo, tipo tipoMotor, int numeroPuertas, boolean tieneAirbag) {
    super(fechaFab, marca, modelo, consumo, tipoMotor);
    this.numeroPuertas = numeroPuertas;
    this.tieneAirbag = tieneAirbag;
    fechasITV = new ArrayList<>();
  }

  public void addITV(String fecha) {
    fechasITV.add(fecha);
  }

  public int getNumeroPuertas() {
    return numeroPuertas;
  }
  public void setNumeroPuertas(int numeroPuertas) {
    this.numeroPuertas = numeroPuertas;
  }
  public boolean getTieneAirgab() {
    return tieneAirbag;
  }
  public void setTieneAirbag(boolean tieneAirbag) {
    this.tieneAirbag = tieneAirbag;
  }

  public String toString () {
    String salida = "\n# Coche:";
    salida += super.toString();
    salida += "\nNumero de Puertas: " + numeroPuertas;
    salida += "\nTiene Airbag: " + tieneAirbag;
    if (!fechasITV.isEmpty()) {
      salida += "\nFechas ITV:";
      for(String f: fechasITV) {
        salida += "\n  " + f;
      }
    }
    return salida;
  }
}
