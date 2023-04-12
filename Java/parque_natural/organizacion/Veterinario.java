package parque_natural.organizacion;
import parque_natural.ecosistema.fauna.Animal;

public class Veterinario {

  public static void main(String[] args) {
    Persona persona_1 = new Persona("Pepe");
    Animal animal_1 = new Animal("Simba", "Gato", 3, persona_1);
    System.out.println(animal_1);
  }


}
