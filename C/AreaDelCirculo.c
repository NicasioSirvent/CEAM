#include <stdio.h>
#define PI 3.1416

void main(int argc, char const *argv[]) {
  float radio;
  
  do {
    printf("Dime el Radio del Circulo: ");
    scanf("%f", &radio);
    printf("El Area del Circulo de %.1f u.a. es %.1f u.a.\n", radio, PI * radio * radio); 
    puts("##");
  } while (radio != 0);
}