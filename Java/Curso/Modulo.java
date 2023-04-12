package Curso;

enum tipo {TEORICO,PRACTICO};

public class Modulo {
  private String nombre;
  private tipo tipoCurso;
  private String fechaExamen;
  private Profesor profesor;

  public Modulo (String nombre, tipo tipoCurso, String fechaExamen, Profesor profesor) {
    this.nombre = nombre;
    this.tipoCurso = tipoCurso;
    this.fechaExamen = fechaExamen;
    this.profesor = profesor;
  } 
  
  public String getNombre() {
    return nombre;
  }

  public tipo getTipoCurso() {
    return tipoCurso;
  }

  public String getFechaExamen() {
    return fechaExamen;
  }

  public Profesor getProfesor() {
    return profesor;
  }


  @Override
  public String toString() {
    return "Curso: " + nombre + "\nProfesor: " + profesor + "\nFecha Examen: " + fechaExamen; 
  }
}
