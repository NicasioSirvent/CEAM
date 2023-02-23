/*
* Programa para calcular potencias
*/

#include <stdio.h>
#include <math.h>

int main(int argc, char const *argv[]) {
  int n;
  float p2, p3, p4;
  puts("Introduce un numero: ");
  scanf("%d", &n);

  p2 = pow(n,2);
  p3 = pow(n,3);
  p4 = pow(n,4);
  printf("\n El numero %d tiene las potencias %.0f, %.0f y %.0f\n", n, p2, p3, p4);

  return 0;
}
