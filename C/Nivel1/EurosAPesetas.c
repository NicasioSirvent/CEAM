#include <stdio.h>
void main(int argc, char const *argv[]) {
  float euros;
  puts("** Dime la cantidad en Euros: **");
  scanf("%f", &euros);
  printf("Tienes %.1f Pesetas!\n", 166.386 * euros);
  //printf("\n->%02x", 12);
}