#include <stdio.h>
#include <stdlib.h>

char convertircesar5 (char);

void main(void) {
  char dato[5];
  char convertido[5];
  int i;
  FILE* fichero;

  fichero = fopen("clave.txt", "r");
  fgets(dato, 6, fichero);
  fclose(fichero);

  for (i=0; i<5; i++){
    convertido[i] = convertircesar5(dato[i]);
    printf("%c Convertido es %c\n", dato[i], convertido[i]);
  }
}

char convertircesar5(char c) {
  return c + 5;
}
