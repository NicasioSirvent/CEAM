import java.util.ArrayList;

import parque_natural.ecosistema.fauna.Animal;
import parque_natural.ecosistema.flora.Arbol;
import parque_natural.organizacion.Persona;

public class ParqueNatural {
  public static void main(String[] args) {
    ArrayList<Animal> animalesDelParque = new ArrayList<Animal>();
    ArrayList<Arbol> arbolesDelParque = new ArrayList<Arbol>();

    Persona persona_1 = new Persona("Pepe");
    Persona persona_2 = new Persona("Luis");
    
    Animal animal_1 = new Animal("Boby", "Perro", 2, persona_1);
    animalesDelParque.add(animal_1);

    Animal animal_2 = new Animal("Belcebu", "Gato", 3, persona_2);
    animalesDelParque.add(animal_2);

    Arbol arbol_1 = new Arbol(4, 3, true);
    arbol_1.setNombreVulgar("Naranjo");
    arbolesDelParque.add(arbol_1);

    if (!animalesDelParque.isEmpty()) {
      System.out.println();
      System.out.println("Listado de Animales del Parque");
      System.out.println("------------------------------");
      for(Animal an : animalesDelParque) {
        System.out.println(an);
      }
    }
    
    if (!arbolesDelParque.isEmpty()) {
      System.out.println();
      System.out.println("Listado de Arboles del Parque");
      System.out.println("------------------------------");
      for(Arbol ar : arbolesDelParque) {
        System.out.println(ar);
      }
    }
  }
}
