package Curso;

public class Persona {
  private String nombre;

  //constructor
  public Persona() {};

  public Persona(String nombre) {
    this.nombre = nombre;
  }

  public String verDatos() {
    return "Nombre: " + getNombre();
  }

  //getters y setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String toString() {
    return getNombre();
  }
}
