package POO.Animales;

public class Animal {
  private String especie;
  private String nombre;
  private int edad;
  Persona titular;


  public Animal() {
    especie = "Sin Identificar";
    nombre = "Anonimo";
    edad = 0;
  }

  public Animal(String nom, String esp, int ed) {
    especie = esp;
    nombre = nom;
    edad = ed;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int e) {
    this.edad = e;
  }
  
  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String e) {
    especie = e;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String n) {
    nombre = n;
  }

  public void setTitular(Persona p) {
    titular = p;
  }

  public Persona getTitular() {
    return titular;
  }
}
