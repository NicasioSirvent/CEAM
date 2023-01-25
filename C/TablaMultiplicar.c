#include <stdio.h>

int main(int argc, char const *argv[]) {
  int numero;
  printf("Dime Numero y te doy su Tabla: ");
  scanf("%d", &numero);

  puts("***********************");
  for (int i=0; i<=10; i++) {
    printf(" %d por %d igual a %d\n", numero, i, numero*i);
  }
  puts("***********************");
  return 0;
}