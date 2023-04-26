/*
 * Dolares a Euros, Yenes y Pesos Bolivianos.
 */
#include <stdio.h>

void main(int argc, char const *argv[]) {
  float euros;
  int opcion;

  while (opcion != 0) {
    printf("Cuantos Euros quieres convertir?: ");
    scanf("%f", &euros);
    puts("Selecciona divisa: (0 para salir)");
    puts("1: a Dolares");
    puts("2: a Yenes");
    puts("3: a Libras");
    scanf("%d", &opcion);

    if (opcion == 1)
      printf("%.1f Euros son %.1f Dolares.\n", euros, euros * 1.09);
    else if (opcion == 2)
      printf("%.1f Euros son %.1f Yenes.\n", euros, euros * 141.49);
    else if (opcion == 3)
      printf("%.1f Euros son %.1f Libras.\n", euros, euros * 0.88);

    puts("##");
  }
}