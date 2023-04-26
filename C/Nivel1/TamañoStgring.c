/*
* Captura Strings
*/

#include <stdio.h>

int main(int argc, char const *argv[]) {
  char palabra[] = "Pepito";
  printf("La palabra es %s y mide %ld bytes\n", palabra, sizeof(palabra));
  return 0;
}
