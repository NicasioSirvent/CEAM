/*
* Letra Control NIF
*/

#include <stdio.h>

int main() {
  char letraNif[] = "TRWAGMYFPDXBNJZSQVHLCKE";
  long dni;
  printf("Tu DNI?: ");
  scanf("%ld", &dni);
  printf("** Tu letra es la %c **\n", letraNif[dni%23]);
  return 0;
}
