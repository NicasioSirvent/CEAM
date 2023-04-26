#include <stdio.h>
int main(int argc, char const *argv[]) {
  int numero;
  printf("Dime un número: ");
  scanf("%d", &numero);
  
  puts("---------------------");
  if (numero > 0) {
    printf("El numero %d es positivo.\n", numero);
  } else if (numero < 0) {
    printf("El numero %d es negativo.\n", numero);
  } else {
    printf("El numero %d es neutro.\n", numero);
  }
  puts("---------------------");

  return 0;
}