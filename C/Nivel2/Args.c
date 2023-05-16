#include <stdio.h>
int main(int argc, char const *argv[])
{
  int i;
  printf("Argumentos:\n");
  for (i=0; i<argc; i++)
    printf("El Argumento %d es %s\n", i, argv[i]);
  return 0;
}
