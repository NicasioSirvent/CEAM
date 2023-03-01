/*
* Programa de quinielas
*/

#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main() {
  int i, numero;
  time_t t;
  srand((unsigned) time(&t)); //semilla para el generador random

  for (i = 0; i < 14; i++) {
    numero = rand() % 100;
    if (numero < 50) {
      puts("1");
    } else if (numero < 80) {
      puts("X");
    } else {
      puts("2");
    }
  }
}