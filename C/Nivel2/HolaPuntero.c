#include <stdio.h>
#include <stdlib.h>

int main() {
  int a = 10;
  int* p = &a;
  printf("El valor de a es %d y el valor de *p es %d\n", a, *p);
  printf("La direccion de p es %p\n", p);
  return 0; 
}