#include <stdio.h>

int main(int argc, char const *argv[]) {

  struct trabajador {
    char nombre[30];
    float salario;
  } empleados[3];
  
  int salarioTotal = 0;
  int i;

  for (i = 0; i <= 2; i++) {
    printf("Introduce nombre de trabajador %d:", i+1);
    scanf("%s", empleados[i].nombre);
    printf("Introduce salario de trabajador %d:", i+1);
    scanf("%f", &empleados[i].salario);
    salarioTotal += empleados[i].salario;
  }

  for (i = 0; i <= 2; i++) {
    printf("\n Trabajador %d: ", i+1);
    printf("Nombre: %s y ", empleados[i].nombre);
    printf("Salario: %.2f", empleados[i].salario);
  }
  
  printf("\nLa empresa pagara un total de %d Euros \n", salarioTotal);
}
