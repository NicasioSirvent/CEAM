#include <stdio.h>


int main(int argc, char const *argv[]) {

  struct trabajador {
    char nombre[30];
    float salario;
  } empleados[3];

  char basura[100];

  for (int i = 0; i <= 2; i++) {
    printf("Introduce nombre de trabajador %d:", i+1);
    scanf("%s", empleados[i].nombre);
    printf("Introduce salario de trabajador %d:", i+1);
    scanf("%f", &empleados[i].salario);
  }

  for (int i = 0; i <= 2; i++) {
    printf("\n Trabajador %d -", i+1);
    printf("nombre: %s", empleados[i].nombre);
    printf("salario: %.2f", empleados[i].salario);
  }
}
