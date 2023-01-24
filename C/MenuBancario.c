#include <stdio.h>
int main(int argc, char const *argv[]) {
  int saldo = 1000;
  int opcion = 0;

  while (1) {
    puts("Esto es un Menu Bancario: ");
    puts("1 - Extracto de cuenta: ");
    puts("2 - Ingresa 100 en cuenta: ");
    puts("3 - Reintegro 100 de cuenta: ");
    puts("4 - Salir ");
    printf("Elije Opcion: ");
    scanf("%d", &opcion);

    puts("-------------------");
    if (opcion == 1) {
      printf("Tienes %d Euros de Saldo.\n", saldo);
    } else if (opcion == 2) {
      saldo += 100;
      printf("Ingresando 100 en Cuenta, tienes %d Euros\n", saldo);
    } else if (opcion == 3) {
      saldo -= 100;
      printf("Reintegro de 100 Euros, tienes %d Euros\n", saldo);
    } else if (opcion == 4) {
      puts("Hasta Pronto!");
      break;
    } else { 
      puts("Opcion no Valida!");
    }
    puts("-------------------");
  }
  return 0;
}