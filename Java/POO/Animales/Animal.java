package POO.Animales;

public class Animal {
  private String especie;
  private String nombre;
  private int edad;
  Persona persona;


  public Animal() {
    this.especie = "Sin Identificar";
    this.nombre = "Anonimo";
    this.edad = 0;
  }

  public Animal(String nombre, String especie, int edad) {
    this.especie = especie;
    this.nombre = nombre;
    this.edad = edad;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setEdad(int nuevaEdad) {
    this.edad = nuevaEdad;
  }
  
  public String getEspecie() {
    return this.especie;
  }

  public void setEspecie(String nuevaEspecie) {
    this.especie = nuevaEspecie;
  }


  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
