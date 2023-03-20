package POO.Animales;

public class Veterinario {

  public static void main(String[] args) {
    Persona persona_1 = new Persona("Pepe");
    Animal animal_1 = new Animal("Simba", "Gato", 3);
    animal_1.setTitular(persona_1);

    
  }


}
