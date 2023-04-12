#include <stdio.h>
#include <stdlib.h>

int recupera_saldo();
void guarda_saldo(int);
void presenta_menu();

void presenta_menu() {
  puts("Esto es un Menu Bancario: ");
  puts("a - Extracto de cuenta: ");
  puts("b - Ingresar en cuenta: ");
  puts("c - Reintegro de cuenta: ");
  puts("d - Salir ");
  printf("Elije Opcion: ");
}

int recupera_saldo() {
  int cantidad = 0;
  FILE* fichero = fopen("saldo.txt", "r");
  if (fichero != NULL) {
    fscanf(fichero, "%d", &cantidad);
    fclose(fichero);
  }
  return cantidad;
}

void guarda_saldo(int saldo) {
  FILE* fichero = fopen("saldo.txt", "w");
  if (fichero != NULL) {
    fprintf(fichero, "%d", saldo);
    fclose(fichero);
  }
  
}

int main(int argc, char const *argv[])
{
  int saldo = recupera_saldo();
  int cantidad = 0;
  char opcion = '0';
  
  system("clear");

  while (opcion != 'd') {
    presenta_menu();
    while ((opcion = getchar()) == '\n');
    puts("-------------------");
    switch (opcion)
    {
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
      guarda_saldo(saldo);
      puts("Hasta Pronto!");
      exit(0);
      break;
    default:
      puts("¡Opcion no valida!");
      break;
    }
    puts("-------------------");
  }
  return 0;
}