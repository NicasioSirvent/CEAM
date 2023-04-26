#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main() {
  int num;
  char caracter;
  float paga;
  char cadena[30];

  FILE *archi;
  archi = fopen("arch_mio.god", "rb");
  if (archi == NULL)
    exit(1);

  fread(&caracter, sizeof(char), 1, archi);
  printf("La letra leída del fichero es: %c\n", caracter);

  fread(&num, sizeof(int), 1, archi);
  printf("El número leído del fichero es: %i\n", num);

  fread(&paga, sizeof(float), 1, archi);
  printf("El salario leído del fichero es: %.2f\n", paga);

  fread(cadena, 30, 1, archi);
  // fgets(cadena, 30,archi);
  //puts(cadena);
  printf("La cadena leida es %s\n", cadena);

  fclose(archi);
  getchar();
}
