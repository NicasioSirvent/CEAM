#include <stdio.h>
int main(int argc, char const *argv[]) {
  float radio = 0.0;
  const float PI = 3.1416;
  puts("-------------------");
  printf("Dime el Radio del Circulo:(ua) ");
  scanf("%f", &radio);
  printf("\nEl perimetro es %.1f uas.", 2*PI*radio);
  printf("\nEl Area es %.1f uas^2.", PI*radio*radio);
  printf("\nEl Volumen es %.1f uas^3\n", 4*PI*radio*radio*radio/3);
  puts("-------------------");
  return 0;
}
