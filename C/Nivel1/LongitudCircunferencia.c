#include <stdio.h>

void main() {
  float radio, pi;
  printf("Dime el Valor de Pi: ");
  scanf("%f", &pi);
  printf("Dime el Radio del Circulo: ");
  scanf("%f", &radio);
  printf("La Longitud de la Circunferencia de %.1f u.a. es %.1f u.a.\n", radio, 2 * pi * radio);
  printf("La Area de la Circunferencia de %.1f u.a. es %.1f u.a.\n", radio, pi * radio * radio);
}