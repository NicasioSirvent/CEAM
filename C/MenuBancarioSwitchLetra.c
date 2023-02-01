#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
  int saldo = 1000;
  int cantidad = 0;
  char opcion = '0';

  system("clear");

  while (opcion != 'd')
  {
    puts("Esto es un Menu Bancario: ");
    puts("a - Extracto de cuenta: ");
    puts("b - Ingresar en cuenta: ");
    puts("c - Reintegro de cuenta: ");
    puts("d - Salir ");
    printf("Elije Opcion: ");
    while((opcion = getchar()) == '\n');
    //scanf("%c", &opcion);

    puts("-------------------");
    switch (opcion) {
    case ('a'):
    case ('A'):
      printf("Tienes %d Euros de Saldo.\n", saldo);
      break;
    case ('b'):
    case ('B'):
      printf("¿Que cantidad quiere Ingresar?: ");
      scanf("%d", &cantidad);
      saldo += cantidad;
      printf("Ingresando %d en Cuenta, tienes %d Euros\n", cantidad, saldo);
      break;
    case ('c'):
    case ('C'):
      printf("¿Que cantidad quiere Retirar?: ");
      scanf("%d", &cantidad);
      saldo -= cantidad;
      printf("Reintegro de %d Euros, tienes %d Euros\n", cantidad, saldo);
      break;
    case ('d'):
    case ('D'):
      puts("Hasta Pronto!");
      break;
    default:
      puts("¡Opcion no valida!");
      break;
    }
    puts("-------------------");
  }

  return 0;
}