/*
* Programa de quinielas
*/

#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main() {
  time_t t;
  char* cartas[] = {"as","1","2","3","4","5","6","7","sota","caballo","rey"};
  char* palos[] = {"espadas","bastos","oros","copas"};
  srand((unsigned) time(&t)); //semilla para el generador random
  printf("%s de %s\n", cartas[rand()%10], palos[rand()%3] );
}