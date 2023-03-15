#include <stdio.h>


int main(int argc, char const *argv[]) {

  struct {
    char nombre[30];
    int poblacion;
    float rentaPerCapita;
  } ciudades[3];

  int idxMaxPob = 0;

  for (int i = 0; i <= 2; i++) {
    printf("Introduce Nombre de Ciudad %d: ", i+1);
    scanf("%s", ciudades[i].nombre);
    printf("Introduce Poblacion de Ciudad %d: ", i+1);
    scanf("%d", &ciudades[i].poblacion);
    printf("Introduce RentaPerCapita de Ciudad %d: ", i+1);
    scanf("%f", &ciudades[i].rentaPerCapita);
    if (ciudades[i].poblacion > ciudades[idxMaxPob].poblacion) 
      idxMaxPob = i; 
  }

  for (int i = 0; i <= 2; i++) {
    printf("\n Ciudad %d -", i+1);
    printf("Nombre: %s ", ciudades[i].nombre);
    printf("Poblacion: %d ", ciudades[i].poblacion);
    printf("Renta per Capita: %.2f ", ciudades[i].rentaPerCapita);
  }
  
  printf("\n** La ciudad mas poblada es %s**\n", ciudades[idxMaxPob].nombre);
}
