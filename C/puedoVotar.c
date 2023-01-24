#include <stdio.h>

int main(int argc, char const *argv[]) {
  int edad;
  puts("---------------");
  printf("Dime tu Edad: ");
  scanf("%d", &edad);

  if (edad < 18) {
    printf("No puedes votar!, te faltan %d años!\n", 18 - edad);
  } else {
    puts("Si que puedes votar!");
  }
  puts("---------------");
  return 0;
}