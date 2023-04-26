#include <stdio.h>
#include <stdlib.h>

double *multiplicar (double *entrada) {
  double *eldoble = (double *) malloc(sizeof(double));
  *eldoble = *entrada * 2.0;
  return eldoble;
}

int main () {
  int *edad = (int *) malloc(sizeof(int));
  *edad = 30;
  double *sueldo = (double *) malloc(sizeof(double));
  *sueldo = 12345.67;
  double *lista = (double *) malloc(3 * sizeof(double));
  lista[0] = 1.2;
  lista[1] = 2.3;
  lista[2] = 3.4;

  double *doblesueldo = multiplicar(sueldo);
  printf("El doble del sueldo es: %.2fEur \n", * doblesueldo);

  free(edad);
  free(sueldo);
  free(lista);
  free(doblesueldo);
  return 0;
}