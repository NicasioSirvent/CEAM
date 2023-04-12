#include <stdio.h>

int main(int argc, char const *argv[]) {

  struct {
    char titulo[30];
    char interprete[30];
    int pvp;
    int anoPrimeraEdicion;
  } discos[3];

  int idxMinAnoPub = 0;

  for (int i = 0; i <= 2; i++) {
    printf("Titulo del Disco %d: ", i+1);
    scanf("%s", discos[i].titulo);
    printf("Interprete del Disco %d: ", i+1);
    scanf("%s", discos[i].interprete);
    printf("PVP del Disco %d: ", i+1);
    scanf("%d", &discos[i].pvp);
    printf("Año de Primera Edicion del Disco %d: ", i+1);
    scanf("%d", &discos[i].anoPrimeraEdicion);
    if (discos[i].anoPrimeraEdicion < discos[idxMinAnoPub].anoPrimeraEdicion) 
      idxMinAnoPub = i; 
  }

  for (int i = 0; i <= 2; i++) {
    printf("\n Disco %d -", i+1);
    printf("Titulo: %s ", discos[i].titulo);
    printf("Interprete: %s ", discos[i].interprete);
    printf("PVP: %d", discos[i].pvp);
    printf("Año de Primera Edicion: %d", discos[i].anoPrimeraEdicion);
  }
  
  printf("\n** El Disco mas Antiguo es %s**\n", discos[idxMinAnoPub].titulo);
}
