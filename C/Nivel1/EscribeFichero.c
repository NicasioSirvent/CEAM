#include <stdio.h>
int main() {
  FILE *f1;
  f1 = fopen("datos2.txt", "w");
  if (f1 == NULL){
    printf("No se puede abrir el archivo datos.txt\n");
    return 1;
  }
  fprintf(f1, "lala\n");
  fprintf(f1, "hola\n");
  fclose(f1);
  return 0;
}