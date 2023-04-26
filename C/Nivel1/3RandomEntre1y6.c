/*
* Programa para calcular potencias
*/

#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main() {
  int i, n;
  time_t t;

  n = 3;
  //semilla para el generador random
  srand((unsigned) time(&t));

  for (i = 0; i < n; i++) {
    printf("%d\n", (rand() % 6) + 1);
  }
  return 0;
}