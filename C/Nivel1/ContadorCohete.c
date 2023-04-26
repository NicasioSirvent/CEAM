/*
 * Demostración de Bucle For Descendiente
 */

#include <stdio.h>
#include <unistd.h> //en linux

int main(int argc, char const *argv[]) {
  for (int i = 10; i >= 0; i--) {
    sleep(1);
    printf("%d\n", i);
  }
  puts("¡Cohete Lanzado!");
  return 0;
}
