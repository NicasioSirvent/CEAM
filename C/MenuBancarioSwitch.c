#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
  int saldo = 1000;
  int cantidad = 0;
  int opcion = 0;

  system("clear");

  while ( opcion != 4)
  {
    puts("Esto es un Menu Bancario: ");
    puts("1 - Extracto de cuenta: ");
    puts("2 - Ingresar en cuenta: ");
    puts("3 - Reintegro de cuenta: ");
    puts("4 - Salir ");
    printf("Elije Opcion: ");
    scanf("%d", &opcion);

    puts("-------------------");
    switch (opcion)
    {
    case (1):
      printf("Tienes %d Euros de Saldo.\n", saldo);
      break;
    case (2):
      printf("¿Que cantidad quiere Ingresar?: ");
      scanf("%d", &cantidad);
      saldo += cantidad;
      printf("Ingresando %d en Cuenta, tienes %d Euros\n", cantidad, saldo);
      break;
    case (3):
      printf("¿Que cantidad quiere Retirar?: ");
      scanf("%d", &cantidad);
      saldo -= cantidad;
      printf("Reintegro de %d Euros, tienes %d Euros\n", cantidad, saldo);
      break;
    case (4):
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