#include <stdio.h>

double multiplicar(double entrada) {
  return entrada * 2.0;
}

int main() {
  int edad = 30;
  double sueldo = 12345.67;
  double lista[3] = {1.2, 3.4, 5.6};

  printf("El doble del salario es %.2f\n", multiplicar(sueldo));
  return 0;
}