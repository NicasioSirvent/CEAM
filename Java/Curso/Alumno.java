package Curso;

import java.util.*;

public class Alumno extends Persona {
  Map<Modulo, Integer> boletin;

  public Alumno () {}

  public Alumno (String nombre) {
    super(nombre);
    boletin = new HashMap<>();
  }

  public void addNota(Modulo modulo, int nota) {
    boletin.put(modulo, nota);
  }

  public int getNota(Modulo modulo) {
    return boletin.get(modulo);
  }

}
