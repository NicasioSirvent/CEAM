#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
  int numero = 20;
  char letra = 'Q';
  float salario = 2033.2;
  char nombre[30] = "Macario";

  FILE *archivo;
  archivo = fopen("arch_mio.god", "wb");
  if (archivo == NULL)
    exit(1);

  fwrite(&letra, sizeof(char), 1, archivo);
  fwrite(&numero, sizeof(int), 1, archivo);
  fwrite(&salario, sizeof(float), 1, archivo);
  fwrite(nombre, strlen(nombre), 1, archivo);

  fclose(archivo);

  return 0;
}