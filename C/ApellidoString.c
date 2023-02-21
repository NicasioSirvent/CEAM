/*
* Primer programa con strings
*/

#include <stdio.h>

int main(int argc, char const *argv[]) {
  char nombre[] = "Nicasio";
  char apellido[] = {'S','i','r','v','e','n','t'};

  //for (int i=0; i<7; i++) {
  for (int i=0; i<sizeof(apellido); i++) {
    printf("%c", apellido[i]);
  }
  
  printf(" ");
  for (int i=0; i<sizeof(nombre); i++) {
    printf("%c", nombre[i]);
  }
  printf("\n");
  return 0;
}
