/*
* Programa de quinielas
*/

#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main() {
  int i, n;
  time_t t;
  char x12[] = {'1','X','2'};

  n = 14; //14 resultados
  srand((unsigned) time(&t)); //semilla para el generador random

  for (i = 0; i < n; i++) {
    printf("Resultado %2d: %c\n", i+1, x12[rand() % 3]);
  }
  return 0;
}