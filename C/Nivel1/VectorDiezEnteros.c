/*
* Demostración de Bucle For
*/

#include <stdio.h>

int main(int argc, char const *argv[]) {
  int vector[10];
  int i;
  for (i=0; i<10; i++) {
    vector[i] = 100+i;
  }
  for (i=0; i<10; i++) {
    printf("%d ", vector[i]);
  }
  puts("");
}