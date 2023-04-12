package Vehiculos;

import java.util.*;

public class Test {
  public static void main(String[] args) {
    new Test().go();
  }

  public void go(){
    //lista de coches
    List<Coche> listaCoches = new ArrayList<>();
    listaCoches.add(new Coche("2000.01.01", "Honda", "Civic", 5, tipo.COMBUSTION, 5, false));
    listaCoches.add(new Coche("2000.01.02", "Honda", "CRV", 8, tipo.COMBUSTION, 5, false));
    listaCoches.add(new Coche("2000.01.03", "Honda", "Prelude", 10, tipo.COMBUSTION, 5, false));

    //lista de motos..
    List<Motocicleta> listaMotocicletas = new ArrayList<>();
    listaMotocicletas.add(new Motocicleta("2000.01.01", "Honda", "Transalp", 6, tipo.COMBUSTION, 650));
    listaMotocicletas.add(new Motocicleta("2000.01.02", "Yamaha", "YZF", 6, tipo.COMBUSTION, 1000));
    listaMotocicletas.add(new Motocicleta("2000.01.03", "Suzuki", "SZF", 7, tipo.COMBUSTION, 800));
    
    //ej de itv
    listaCoches.get(0).addITV("2010.01.01");
    listaCoches.get(0).addITV("2015.01.01");

    //salida de lista de coches:
    for(Coche c : listaCoches) {
      System.out.println(c);
    }

    //salida de lista de motos:
    for(Motocicleta m : listaMotocicletas) {
      System.out.println(m);
    }
  }
}