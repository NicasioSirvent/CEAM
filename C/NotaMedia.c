#include <stdio.h>
int main(int argc, char const *argv[]) {
  float notas[5], media; 
  float suma = 0;
  int i;

  for (i=0; i<5; i++) {
    printf("Introduce una nota: ");
    scanf("%f", &notas[i]);
    suma += notas[i];
  }

  puts("***");
  printf("La nota media es %.2f\n", suma/5);
  puts("***");

  return 0;
}