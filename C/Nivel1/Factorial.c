#include <stdio.h>

int factorial (int);

int main() {
  int num;
  int resultado;
  printf("Introduzca un numero entero: ");
  scanf("%d", &num);
  resultado = factorial(num);
  printf("El factorial de %d es %d\n", num, resultado);
}

int factorial(int n) {
  if (n > 1) {return n*factorial(n-1);}
  else return 1;
}