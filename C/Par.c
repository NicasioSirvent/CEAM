#include <stdio.h>
int par(int);

int main (void) {
  int n = 0;
  printf("Numero?: ");
  scanf("%d", &n);
  if (par(n)) {
    printf("El numero es Par\n");
  } else {
    printf("El numero es Impar\n");
  }  
}

int par(int num) {
  return (num % 2 == 0) ? 1:0;
}