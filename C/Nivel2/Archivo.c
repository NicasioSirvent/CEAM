#include <stdio.h>
int main(int argc, char const *argv[])
{
  int i;
  FILE *archivo;
  archivo = fopen(argv[1], "w");
  fprintf(archivo,"por poner algo\n\n");
  fclose(archivo);
  return 0;
}
