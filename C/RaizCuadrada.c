/*
* Programa para calcular potencias
*/

#include <stdio.h>
#include <math.h>

int main(int argc, char const *argv[]) {
  int n;
  puts("Introduce un numero: ");
  scanf("%d", &n);

  printf("\n El numero %d tiene la raiz %.0f\n", n, sqrt(n));

  return 0;
}
