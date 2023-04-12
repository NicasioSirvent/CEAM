/*
* Programa de Ruleta
*/

#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main() {
  int num;
  time_t t;

  srand((unsigned) time(&t)); //semilla para el generador random
  num = rand()%37;

  printf("El numero es el %d", num);

  if (num != 0) {
    if (num%2 == 0) {
      printf(" y es Par.");
    } else {
      printf(" y es Impar.");
    }
  }
  return 0;
}