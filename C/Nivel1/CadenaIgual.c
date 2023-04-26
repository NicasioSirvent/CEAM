#include <stdio.h>
#include <string.h>
#define CLAVE "pepe"

int main(int argc, char const *argv[]) {
  char clave[10]; 
  printf("Dime Clave :");
  scanf("%s", clave);

  if (strcmp(clave, CLAVE) == 0) {
    puts("La clave es correcta!");
  } else {
    puts ("La clave es Incorrecta!");
  }
  return 0;
}