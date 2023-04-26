#include <stdio.h>
int main(int argc, char const *argv[])
{
  float masa = 0;
  float altura = 0;
  float indiceMasaCorporal = 0.0;

  puts("Calculador de Indice de Masa Corporal");
  puts("-------------------------------------");
  printf("Dime tu Peso: ");
  scanf("%f", &masa);
  printf("ok, ahora dime tu Altura (x.xx): ");
  scanf("%f", &altura);
  indiceMasaCorporal = masa / (altura * altura);
  printf("Tu Indice de Masa Corporal es %.1f \n", indiceMasaCorporal);
  puts("-------------------------------------");


  return 0;
}