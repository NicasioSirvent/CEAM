#include <stdio.h>
#define NUM 5

int main(int argc, char const *argv[]) {

  struct alumno {
    char nombre[30];
    float nota;
  } alumnos[NUM];
  
  int i;
  float notaTotal = 0;

  for (i = 0; i < NUM; i++) {
    printf("Introduce nombre de alumno %d:", i+1);
    scanf("%s", alumnos[i].nombre);
    printf("Introduce nota del alumno %d:", i+1);
    scanf("%f", &alumnos[i].nota);
    notaTotal += alumnos[i].nota;
  }

  for (i = 0; i < NUM; i++) {
    printf("\n Alumno %d: ", i+1);
    printf("Nombre: %s y ", alumnos[i].nombre);
    printf("Nota: %.2f", alumnos[i].nota);
  }
  
  printf("\nLa nota media de los alumnos es %.2f\n", notaTotal/NUM);
}
