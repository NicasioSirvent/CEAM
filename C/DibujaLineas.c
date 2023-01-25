/*
 * Demostración de Bucle
 */

#include <stdio.h>

int main(int argc, char const *argv[]) {
  for (int i = 1; i <=100; i++) {
    printf("*");
    if (i%10 == 0){
      printf("\n");
    }
  }
  return 0;
}
