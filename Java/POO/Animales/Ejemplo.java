package POO.Animales;

public class Ejemplo {
  public static void main(String[] args) {
    Animal animal1 = new Animal();
    Animal animal2 = new Animal();
    animal2.setEspecie("Tortuga");
    animal2.setNombre("Melissa");
    animal1.setEdad(3);
    animal1.setEspecie("Perro");
    animal1.persona = new Persona("Federico");
      
    System.out.println("El nombre es: " + animal1.getNombre());
    System.out.println(" su dueño es " + animal1.persona.getNombre() + " y tiene " + animal1.getEdad() + " años");
    System.out.println("El 2º animal es un@ " + animal2.getEspecie());
  }
}
