package Curso;
import java.util.*;

public class Curso {
  public static void main(String[] args) {
    new Curso().go();
  }

  public void go() {
    //Profesores
    Profesor profesor_1 = new Profesor("PepeProf");
    Profesor profesor_2 = new Profesor("JuanProf");
    //Modulos con profesores
    Modulo modulo_1 = new Modulo("Matematicas", tipo.TEORICO, "2023.02.03", profesor_1);
    Modulo modulo_2 = new Modulo("Laboratorio", tipo.PRACTICO, "2023.04.03", profesor_2);
    
    //Alumnos
    List<Alumno> alumnos = new ArrayList<>();
    alumnos.add(new Alumno("PepeAlum"));
    alumnos.add(new Alumno("JuanAlum"));
    alumnos.add(new Alumno("PericoAlum"));


    //Algunos examenes despues;
    alumnos.get(0).addNota(modulo_1, 7);
    alumnos.get(0).addNota(modulo_2, 5);
    alumnos.get(1).addNota(modulo_1, 3);
    alumnos.get(1).addNota(modulo_2, 8);
    alumnos.get(2).addNota(modulo_1, 5);
    alumnos.get(2).addNota(modulo_2, 7);


    //Y al final del curso, el resultado:
    System.out.println("Notas Finales:");
    System.out.println("--------------");
    
    for(Alumno al: alumnos) {
      System.out.println("Alumno: " + al);
      al.boletin.forEach((mod, nota) -> System.out.println(mod.getNombre() + ": " + nota));
      System.out.println();
      //for(Map.Entry<Modulo,Integer> mod: al.boletin.entrySet()) {
      //  System.out.println("  " + mod.getKey().getNombre() + ": " + mod.getValue());
      //}
    }
  }
}